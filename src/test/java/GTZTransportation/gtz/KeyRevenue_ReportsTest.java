package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue_Reports;

public class KeyRevenue_ReportsTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue_Reports keyRevenue;

	public KeyRevenue_ReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue_Reports();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_Report_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.Report_KeyPaymentInvoices();
		keyRevenue.Report_ResourceRequest();
		keyRevenue.Report_MarketingPartners();
		keyRevenue.Report_KSXMPListing();
		keyRevenue.Report_InvoiceHistory();
		keyRevenue.Report_PastDueInvoices();
		keyRevenue.Report_AutoLinkDetail();
		keyRevenue.Report_VarianceSummaryByCarrier();
		keyRevenue.Report_Customers();
		keyRevenue.Report_PendingBillables();
		keyRevenue.Report_PendingJobs();
		keyRevenue.Report_LoadAuditSummary();
		keyRevenue.Report_LoadAuditErrorRollup();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Load Audit Error Rollup']"))
				.getText();
		String expected = "Report - Load Audit Error Rollup";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
