package GTZTransportation.gtz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;

public class BaseClass {
    private static final Logger logger = Logger.getLogger(BaseClass.class.getName());
    public static WebDriver driver;
    public static Properties config = new Properties();
    private static DevTools devTools;
    private static Set<String> logEntries = new HashSet<>();
    private static Set<String> currentUrls = new HashSet<>();

    // Dynamic log folder path
    private static final String LOG_FOLDER = System.getProperty("user.dir") + "/Logs/";
    public static String logFilePath;

    static {
        config.setProperty("browser", "chrome");      // Browser choice
        config.setProperty("headless", "true");      // Headless mode
        config.setProperty("incognito", "false");      // Incognito mode
        config.setProperty("environment", "stage");   // Environment choice

        // Create Logs folder if it doesn't exist
        File logDir = new File(LOG_FOLDER);
        if (!logDir.exists()) {
            logDir.mkdirs();
        }

        // Generate log file name with timestamp
        logFilePath = LOG_FOLDER + "NetworkLogs_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".txt";
    }

    public static void initialization() {
        try {
            String browser = config.getProperty("browser");
            boolean isHeadless = Boolean.parseBoolean(config.getProperty("headless"));
            boolean isIncognito = Boolean.parseBoolean(config.getProperty("incognito"));

            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    if (isIncognito) chromeOptions.addArguments("--incognito");
                    if (isHeadless) chromeOptions.addArguments("--headless", "--window-size=1920,1080");
                    driver = new ChromeDriver(chromeOptions);

                    // Initialize DevTools
                    devTools = ((ChromeDriver) driver).getDevTools();
                    devTools.createSession();
                    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    if (isIncognito) firefoxOptions.addArguments("-private");
                    if (isHeadless) firefoxOptions.addArguments("--headless");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.manage().window().maximize();
            driver.get(getBaseUrl(config.getProperty("environment")));

            checkForServerErrors();
            performLogin();

        } catch (Exception e) {
            handleError("Initialization_Error", e);
        }
    }

    private static String getBaseUrl(String environment) {
        switch (environment.toLowerCase()) {
            case "dev":
                return "https://my-dev.shiplps.com/Login.aspx";
            case "stage":
                return "https://my-stage.shiplps.com/Login.aspx";
            case "prod":
                return "https://my.shiplps.com/Login.aspx";
            default:
                throw new IllegalArgumentException("Unsupported environment: " + environment);
        }
    }

    private static void performLogin() {
        try {
            sendKeys(By.id("ContentPlaceHolder1_container_txtUserName"), "mubashir.tariq@shiplps.com");
            sendKeys(By.id("ContentPlaceHolder1_container_txtPassword"), "Pakistan1234M");
            click(By.id("ContentPlaceHolder1_container_btnLogin"));
            logger.info("Login successful");

        } catch (Exception e) {
            handleError("Login_Failure", e);
        }
    }

    // Captures network logs and saves them in a text file
    public static void checkForServerErrors() {
        try {
            // Capture network logs using DevTools
            devTools.addListener(Network.responseReceived(), response -> {
                String url = response.getResponse().getUrl();
                int status = response.getResponse().getStatus();
                if (status != 200 && status != 204) {
                    logEntries.add(url + " - Status: " + status);
                }
            });

            // Highlight server errors
            devTools.addListener(Network.responseReceived(), response -> {
                int status = response.getResponse().getStatus();
                if (status == 400 || status == 401 || status == 403 || status == 404 || status == 500 || status == 502 || status == 503 || status == 504){
                	
                    logger.severe("Server Error Detected: " + response.getResponse().getUrl() + " - Status: " + status);
                    // captureScreenShot(driver, "Server_Error"); // Commented out as requested
                }
            });

            // Capture current window logs
            captureCurrentWindowLogs();

            // Save unique network logs
            saveNetworkLogs();

        } catch (Exception e) {
            logger.warning("Could not check network errors. Ensure JavaScript is enabled.");
        }
    }

    // Saves unique network logs to a file
    private static void saveNetworkLogs() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            writer.write("Network and Current Window Logs:\n");
            for (String url : currentUrls) {
                writer.write("Current URL: " + url + "\n");
            }
            for (String log : logEntries) {
                writer.write(log + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            logger.warning("Failed to save network logs: " + e.getMessage());
        }
    }

    // Captures current window logs
    private static void captureCurrentWindowLogs() {
        String currentUrl = driver.getCurrentUrl();
        currentUrls.add(currentUrl);
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            BaseClass.logEntries.add(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
    }

    public static void click(By locator) {
        try {
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (Exception e) {
            handleError("Click_Failure_" + locator.toString(), e);
        }
    }

    public static void sendKeys(By locator, String text) {
        try {
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(text);
        } catch (Exception e) {
            handleError("SendKeys_Failure_" + locator.toString(), e);
        }
    }

    private static void handleError(String errorType, Exception e) {
        logger.log(Level.SEVERE, "Error occurred: " + errorType, e);
        captureScreenShot(driver, errorType);
    }

    public static void captureScreenShot(WebDriver driver, String testcaseName) {
        try {
            TakesScreenshot myScreenshot = (TakesScreenshot) driver;
            File fileSource = myScreenshot.getScreenshotAs(OutputType.FILE);
            File fileTarget = new File(System.getProperty("user.dir") + "/Screenshots/" + testcaseName + ".png");
            FileUtils.copyFile(fileSource, fileTarget);
            System.out.println("Screenshot Taken: " + testcaseName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed successfully.");
        }
    }
}