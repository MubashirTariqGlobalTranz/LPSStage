package GTZTransportation.gtz;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static LogManager logger = LogManager.getLogManager();
    public static WebDriver driver;
    public static Properties config = new Properties();

    // Load configuration settings
    static {
        config.setProperty("browser", "chrome"); // Options: chrome, firefox, edge
        config.setProperty("headless", "true"); // Options: true, false
        config.setProperty("environment", "stage"); // Options: stage, dev, prod
        config.setProperty("incognito", "true"); // Options: true, false
    }

    public static void initialization() {
        String browser = config.getProperty("browser");
        boolean headless = Boolean.parseBoolean(config.getProperty("headless"));
        boolean incognito = Boolean.parseBoolean(config.getProperty("incognito"));
        String environment = config.getProperty("environment");

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) {
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--window-size=1920,1080");
                }
                if (incognito) {
                    chromeOptions.addArguments("--incognito");
                }
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (headless) {
                    firefoxOptions.addArguments("--headless");
                }
                if (incognito) {
                    firefoxOptions.addArguments("-private");
                }
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if (headless) {
                    edgeOptions.addArguments("headless");
                    edgeOptions.addArguments("window-size=1920,1080");
                }
                if (incognito) {
                    edgeOptions.addArguments("inprivate");
                }
                driver = new EdgeDriver(edgeOptions);
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        String baseUrl = "";
        switch (environment.toLowerCase()) {
            case "dev":
                baseUrl = "https://my-dev.shiplps.com/Login.aspx";
                break;
            case "stage":
                baseUrl = "https://my-stage.shiplps.com/Login.aspx";
                break;
            case "prod":
                baseUrl = "https://my.shiplps.com/Login.aspx";
                break;
            default:
                throw new IllegalArgumentException("Unsupported environment: " + environment);
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();

        // Example login
        driver.findElement(By.id("ContentPlaceHolder1_container_txtUserName"))
              .sendKeys("mubashir.tariq@shiplps.com");
        driver.findElement(By.id("ContentPlaceHolder1_container_txtPassword"))
              .sendKeys("Pakistan1234M");
        driver.findElement(By.id("ContentPlaceHolder1_container_btnLogin")).click();
    }

    public void captureScreenShot(WebDriver driver, String testcaseName) {
        TakesScreenshot myScreenshot = (TakesScreenshot) driver;
        File fileSource = myScreenshot.getScreenshotAs(OutputType.FILE);
        File fileTarget = new File(System.getProperty("user.dir") + "/Screenshots/" + testcaseName + ".png");
        try {
            FileUtils.copyFile(fileSource, fileTarget);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot Taken: " + testcaseName);
    }
}
