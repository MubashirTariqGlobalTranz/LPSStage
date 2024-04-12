package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_CarrierPortal;

public class FreightPayment_CarrierPortalTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_CarrierPortal freightPayment;

	public FreightPayment_CarrierPortalTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_CarrierPortal();
	}
	/**

	Test case description:
	This test case verifies the carrier Portal for FreightPayment:
	Verify carrier portal opens successfully.
	Verify invoice search and opening.
	Verify remittance information.
	Verify code shipments open.
	Verify Review Shipments.
	Verify Batch shipments.
	Verify confirm payments.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_CarrierPortal_Tests() {
//This will run all the methods

		freightPayment.CarrierPortal();
		freightPayment.Invoice_Search();
		freightPayment.RemittanceInformation();
		freightPayment.CodeShipments();
		freightPayment.ReviewShipments();
		freightPayment.BatchShipments();
		freightPayment.ConfirmPayment();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
