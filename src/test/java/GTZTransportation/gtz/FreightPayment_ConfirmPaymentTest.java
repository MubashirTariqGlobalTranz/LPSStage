package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_ConfirmPayment;

public class FreightPayment_ConfirmPaymentTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_ConfirmPayment freightPayment;

	public FreightPayment_ConfirmPaymentTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_ConfirmPayment();
	}

	/**
	 * 
	 * Test case description: This test case verifies confirmPayment page in
	 * FreightPayment:
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_ConfirmPayment_test() {
//This will run all the methods

		freightPayment.confirmPaymentGTZ();
		freightPayment.ConfirmPayment();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
