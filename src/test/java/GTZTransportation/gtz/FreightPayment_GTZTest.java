package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_GTZ;

public class FreightPayment_GTZTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_GTZ freightPayment;

	public FreightPayment_GTZTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_GTZ();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_GTZ_tests() {
//This will run all the methods

		freightPayment.GTZ();
		freightPayment.ImportQueue();
		freightPayment.Duplicates();
		freightPayment.MissingCustomer();
		freightPayment.Audit();
		freightPayment.ShipmentVerification();
		freightPayment.PaymentVerification();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
