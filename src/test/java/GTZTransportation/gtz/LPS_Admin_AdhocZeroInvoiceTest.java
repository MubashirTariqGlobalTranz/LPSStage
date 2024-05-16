package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocZeroInvoice;

public class LPS_Admin_AdhocZeroInvoiceTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocZeroInvoice Admin;

	public LPS_Admin_AdhocZeroInvoiceTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocZeroInvoice();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify update zero dollar invoices from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_ZeroInvoicer_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ZeroInvoices();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Successfully updated 0 invoice(s)";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify adhoc zero invoices");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
