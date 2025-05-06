package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_CarrierPortalRemittance;

public class FreightPayment_CarrierPortalRemittanceTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_CarrierPortalRemittance freightPayment;

	public FreightPayment_CarrierPortalRemittanceTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_CarrierPortalRemittance();
	}
	/**

	Test case description:
	This test case verifies the carrier Portal for FreightPayment:
	Verify carrier portal opens successfully.
	Verify remittance information.
	Search Carrier.
	Verify Shipment details.
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_CarrierPortal_RemittanceInfo_Tests() {
//This will run all the methods

		freightPayment.CarrierPortal();
		freightPayment.Remittance_Info();
		freightPayment.RemittanceInformationDetails();
		

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
