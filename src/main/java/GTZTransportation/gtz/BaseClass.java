package GTZTransportation.gtz;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
   public static WebDriver driver;

    /*public void setup() {
    	System.setProperty("webdriver.chrome.driver", "C://Users//mubashir.tariq//Downloads//chromedriver_win32 (1)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
*/
    
    public static void initialization() {
    	WebDriverManager.chromedriver().setup();
    	driver =new ChromeDriver();
    	driver.get("https://my-dev.shiplps.com/Default.aspx");
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.id("ContentPlaceHolder1_container_txtUserName")).sendKeys("jinal.shah@shiplps.com");
    	driver.findElement(By.id("ContentPlaceHolder1_container_txtPassword")).sendKeys("7Q6DEK81GR3<");
    	driver.findElement(By.id("ContentPlaceHolder1_container_btnLogin")).click();
    	
    	
    	
    }
    public void captureScreenShot (WebDriver driver , String testcaseName) {
    	TakesScreenshot myScreenshot = (TakesScreenshot) driver;
    	File fileSource = myScreenshot.getScreenshotAs(OutputType.FILE);
    	File fileTarget = new File(System.getProperty("user.dir") + "/Screenshots/" + testcaseName + ".png");
    	try {
    		FileUtils.copyFile(fileSource, fileTarget);
    		
    	}catch (IOException e)
    	{
    		e.printStackTrace();
    	}
    	
    	System.out.println("Screenshot Taken: " + testcaseName);
    }
    /*public void teardown() {
        driver.quit();
    }*/
}