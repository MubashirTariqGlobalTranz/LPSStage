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
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static LogManager logger = LogManager.getLogManager();
    public static WebDriver driver;
    public static Properties config = new Properties();

    // Load configuration settings
    static {
        config.setProperty("browser", "chrome"); // Options: chrome, firefox
        config.setProperty("headless", "true"); // Options: true, false
        config.setProperty("environment", "stage"); // Options: stage, dev, prod
    }

    public static void initialization() {
        String browser = config.getProperty("browser");
        boolean headless = Boolean.parseBoolean(config.getProperty("headless"));
        String environment = config.getProperty("environment");

        if ("chrome".equalsIgnoreCase(browser)) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            if (headless) {
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--window-size=1920,1080");
            }
            driver = new ChromeDriver(chromeOptions);
        } else if ("firefox".equalsIgnoreCase(browser)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
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
