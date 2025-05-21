package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_ReviewShipments;

public class FreightPayment_ReviewShipmentsTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_ReviewShipments freightPayment;

	public FreightPayment_ReviewShipmentsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_ReviewShipments();
	}

	/**
	 * 
	 * Test case description: This test case verifies Review Shipment page in
	 * FreightPayment:
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_ReviewShipments_test() {
//This will run all the methods

		freightPayment.ReviewShipmentGTZ();
		freightPayment.Reviewshipments();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
