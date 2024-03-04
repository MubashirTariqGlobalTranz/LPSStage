package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_GTZ_Links;

public class FreightPayment_GTZ_Links_Test extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_GTZ_Links freightPayment;

	public FreightPayment_GTZ_Links_Test() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_GTZ_Links();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_GTZ_Links_tests() {
//This will run all the methods

		freightPayment.GTZ();
		freightPayment.BudgetTool();
		freightPayment.Customer();
		freightPayment.Users();
		freightPayment.WelocmeEmail();
		freightPayment.InvalidBankAccounts();
		freightPayment.PaymentFileDetails();
		freightPayment.PaymentRemittanceContacts();
		freightPayment.MassBatchTool();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
