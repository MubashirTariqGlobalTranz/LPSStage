package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPSCustomer_Carrier_CarrierImport;

public class LPSCustomer_Carrier_CarrierImportTest extends BaseClass {
	// public static WebDriver driver;
	LPSCustomer_Carrier_CarrierImport CustomerCarrier;

	public LPSCustomer_Carrier_CarrierImportTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		CustomerCarrier = new LPSCustomer_Carrier_CarrierImport();
	}
	/**

	Test case description:
	This test case contains test cases for Carrier import for the customer/carrier app:
	Verify carrier import opens.
	Verify import details.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void CustomerCarriers_CarrierImport_tests() {
//This will run all the methods & Test

		CustomerCarrier.CarrierGTZ();
		CustomerCarrier.CarrierImport();
		CustomerCarrier.ImportDetails();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Carrier Import']")).getText();
		String expected = "Carrier Import";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Carrier Import");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
