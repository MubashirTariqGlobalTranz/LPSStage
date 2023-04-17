package GTZTransportation.gtz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateLoadPage;
import GTZTransportation.pages.LoginPage;

public class CreateLoadTest  extends BaseClass{
	//public static WebDriver driver;
	CreateLoadPage loadPage;
	public CreateLoadTest () {
		super();
	}

   
  
    @BeforeTest (groups=("Regression"))
    public void setup() 
    {
	
		initialization();
		loadPage = new CreateLoadPage();
    }
    @Test (priority = 1,groups=("Regression"))
    public void spotQuoteTest()  {
    	
    	loadPage.openSpotQuote();
    	loadPage.Create_Load();
		}
    @Test (priority = 2,groups=("Regression"))
     public void LoadAwardProcess() {
    	 loadPage.Load_Award();
    }
    }
    
    /*@Test
    public void createLoadTest() {
       
        
        

        
        // fill out the required fields
    	/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	loadPage.enterCustomerName("106637");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	loadPage.enterContactName("AutomationTest");
    	loadPage.enterPhone("(919) 304-3846");
    	loadPage.enterReferenceNo("1234567");
    	
        
        // submit the form
    	loadPage.submitLoad();
        
        // verify that the load was created successfully
        //Assert.assertTrue(loadPage.isLoadCreated());
    }

    @AfterTest
    public void tearDown() {
        // close the WebDriver
        driver.quit();
    }*/
