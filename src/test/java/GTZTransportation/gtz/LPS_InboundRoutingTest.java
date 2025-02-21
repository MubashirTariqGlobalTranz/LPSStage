package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_InboundRouting;

public class LPS_InboundRoutingTest extends BaseClass {

	// public static WebDriver driver;
	LPS_InboundRouting Claims;

	public LPS_InboundRoutingTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Claims = new LPS_InboundRouting();
	}
	/**

	Test case description:
	This test case contains test cases for InboundRoutingfor LPS:
	Verify InboundRouting.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_InboundRouting_Tests() {
//This will run all the methods
		Claims.InboundRouting();
		Claims.InboundRoutingPage();
	    
	
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//span[normalize-space()='ENERGY']")).getText();
		String expected = "ENERGY";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify InboundRouting Page");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
