package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateDirectLoad_Award;
import GTZTransportation.pages.LoginPage;

public class CreateDirectLoad_AwardTest  extends BaseClass{
	//public static WebDriver driver;
	CreateDirectLoad_Award loadPage;
	public CreateDirectLoad_AwardTest () {
		super();
	}

   
  
    @BeforeTest (groups=("Regression"))
    public void setup() 
    {
	
		initialization();
		loadPage = new CreateDirectLoad_Award();
    }
    @Test (priority = 1, groups=("Regression")) 
    public void spotQuoteTest()  {
    	
    	loadPage.openSpotQuote();
    	loadPage.Create_Load();
    	loadPage.load_Award();
    	loadPage.Search_Load();
    	String actual = driver.findElement(By.className("success-validation")).getText();
    	String expected = "The Load was successfully awarded";
    	Assert.assertEquals(actual, expected);
		}
		
    
    
    
   

    @AfterTest (groups=("Regression"))
    public void tearDown() {
        // close the WebDriver
        driver.quit();
    }
    }
