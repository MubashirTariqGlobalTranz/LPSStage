package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPSCustomer_Carrier_ProspectQueue;

public class LPSCustomer_Carrier_ProspectQueueTest extends BaseClass {
	// public static WebDriver driver;
	LPSCustomer_Carrier_ProspectQueue CustomerCarrier;

	public LPSCustomer_Carrier_ProspectQueueTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		CustomerCarrier = new LPSCustomer_Carrier_ProspectQueue();
	}
	/**

	Test case description:
	This test case contains test cases for customer/Prospect Queue for the customer/carrier app:
	Verify customer Prospect Queue.
	Verify edit queue functionality.
	Verify search on Prospect Queue.
	Verify tabs on Prospect Queue (New, Submitted, Assigned, Cancelled).
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void CustomerCarriers_CustomerList_ProspectQueue_tests() {
//This will run all the methods

		CustomerCarrier.clientAdminGTZ();
		CustomerCarrier.EditQueue();
		CustomerCarrier.Search();
		CustomerCarrier.New();
		CustomerCarrier.Submitted();
		CustomerCarrier.Assigned();
		CustomerCarrier.Cancelled();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h1[@class='mb5']/span[text()='Prospect Queue']")).getText();
		String expected = "Prospect Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Prospect Queue");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
