package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue_Customer;

public class KeyRevenue_CustomerTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue_Customer keyRevenue;

	public KeyRevenue_CustomerTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue_Customer();
	}
	/**

	Test case description:
	This test case verifies the Customer section for Key Revenue:
	Verify invoice history can be opened, searched, and details are displayed properly.
	Verify statement history.
	Verify payment history, search for the customer, and records are displayed properly.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_Customer_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.InvoiceHistory();
		keyRevenue.StatementHistory();
		keyRevenue.PaymentHistory();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Payment History']")).getText();
		String expected = "Payment History";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
