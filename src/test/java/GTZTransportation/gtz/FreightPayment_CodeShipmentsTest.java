package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_CodeShipments;

public class FreightPayment_CodeShipmentsTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_CodeShipments freightPayment;

	public FreightPayment_CodeShipmentsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_CodeShipments();
	}

	/**
	 * 
	 * Test case description: This test case verifies code shipment page in
	 * FreightPayment:
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_CodeShipment_test() {
//This will run all the methods

		freightPayment.codeshipmentGTZ();
		freightPayment.CodeShipment();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
