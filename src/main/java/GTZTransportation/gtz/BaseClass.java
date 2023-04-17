package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

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
    	driver.get("http://my-dev.shiplps.com/Default.aspx");
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.id("ContentPlaceHolder1_container_txtUserName")).sendKeys("jinal.shah@shiplps.com");
    	driver.findElement(By.id("ContentPlaceHolder1_container_txtPassword")).sendKeys("7Q6DEK81GR3<");
    	driver.findElement(By.id("ContentPlaceHolder1_container_btnLogin")).click();
    	
    	
    	
    }
    /*public void teardown() {
        driver.quit();
    }*/
}