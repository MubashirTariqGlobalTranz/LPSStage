package GTZTransportation.gtz;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateDirectLoad_Award;
import GTZTransportation.pages.CreateMassLoad_Award;
import GTZTransportation.pages.CreateQuickLoad_Award;
import GTZTransportation.pages.LoginPage;

public class CreateMassLoad_AwardTest  extends BaseClass{
	//public static WebDriver driver;
	CreateMassLoad_Award loadPage;
	public CreateMassLoad_AwardTest () {
		super();
	}

   
  
    @BeforeTest (groups=("Regression"))
    public void setup() 
    {
	
		initialization();
		loadPage = new CreateMassLoad_Award();
    }
    @Test (priority = 1,groups=("Regression")) 
    public void spotQuoteTest()  {
    	
    	loadPage.openSpotQuote();
    	loadPage.Create_Load();
    	
    	String actual = driver.findElement(By.className("info-validation")).getText();
    	String expected = "The following loads were successfully created";
    	assertTrue(actual.contains(expected));
		}
    

    @AfterTest (groups=("Regression"))
    public void tearDown() {
        // close the WebDriver
        driver.quit();
    }
    }
