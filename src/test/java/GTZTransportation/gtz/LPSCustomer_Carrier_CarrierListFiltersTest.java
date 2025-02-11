package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPSCustomer_Carrier_CarrierListFilters;

public class LPSCustomer_Carrier_CarrierListFiltersTest extends BaseClass {
	// public static WebDriver driver;
	LPSCustomer_Carrier_CarrierListFilters CustomerCarrier;

	public LPSCustomer_Carrier_CarrierListFiltersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		CustomerCarrier = new LPSCustomer_Carrier_CarrierListFilters();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Carrier list
	 * filters for the customer/carrier app: Verify carrier name. Verify MC Number.
	 * Verify DOT Number. Verify SCAC code. Verify Active
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void CustomerCarriers_CarrierListFilters_tests() {
//This will run all the methods

		CustomerCarrier.CarrierGTZ();
		CustomerCarrier.CarrierList();
		CustomerCarrier.Search();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText();
		String expected = "True";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify active Carrier");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
