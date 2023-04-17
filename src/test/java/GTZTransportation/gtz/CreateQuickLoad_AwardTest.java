package GTZTransportation.gtz;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateDirectLoad_Award;
import GTZTransportation.pages.CreateQuickLoad_Award;
import GTZTransportation.pages.LoginPage;

public class CreateQuickLoad_AwardTest  extends BaseClass{
	//public static WebDriver driver;
	CreateQuickLoad_Award loadPage;
	public CreateQuickLoad_AwardTest () {
		super();
	}

   
  
    @BeforeTest (groups=("Regression"))
    public void setup() 
    {
	
		initialization();
		loadPage = new CreateQuickLoad_Award();
    }
    @Test (priority = 1,groups=("Regression"))
    public void spotQuoteTest()  {
    	
    	loadPage.openSpotQuote();
    	loadPage.Create_Load();
    	loadPage.Award_load();
    	
    	String actual = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]")).getText();
    	String expected = "The Load was successfully awarded";
    	Assert.assertEquals(actual, expected);
		}
    

    

    @AfterTest (groups=("Regression"))
    public void tearDown() {
        // close the WebDriver
        driver.quit();
    }
    }
