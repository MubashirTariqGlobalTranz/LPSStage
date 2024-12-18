package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_All_Reports;

public class LPS_Dashboard_All_ReportsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_All_Reports Report;

	public LPS_Dashboard_All_ReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_All_Reports();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for reports on dashboard: Verify Application Error Details.
	 *  KeyPaymentInvoicesReport
		ResourceRequestReport
		UserResourceRequestReport
		KSXSiteActivityReport
		ApplicationErrorsReport
		TrackableCountsReport
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_Reports_Tests() {
//This will run all the methods
		Report.Report();
		Report.KeyPaymentInvoicesReport();
		Report.ResourceRequestReport();
		Report.UserResourceRequestReport();
		Report.KSXSiteActivityReport();
		Report.ApplicationErrorsReport();
		Report.TrackableCountsReport();
		

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Trackable Counts']")).getText();
		String expected = "Report - Trackable Counts";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
