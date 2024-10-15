package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue1_Reports;

public class KeyRevenue1_ReportsTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue1_Reports keyRevenue;

	public KeyRevenue1_ReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue1_Reports();
	}

	/**
	 * 
	 * Test case description: This test case verifies the following reports for Key
	 * Revenue: AccountsReceivableAging BillableDeliveryReceipts BillableSearch
	 * BillingRules LoadAuditInvoiceErrors
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_Report1_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.Report_AccountsReceivableAging();
		keyRevenue.Report_BillableDeliveryReceipts();
		keyRevenue.Report_BillableSearch();
		keyRevenue.Report_BillingRules();
		keyRevenue.Report_LoadAuditInvoiceErrors();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Load Audit Invoice Errors']"))
				.getText();
		String expected = "Report - Load Audit Invoice Errors";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
