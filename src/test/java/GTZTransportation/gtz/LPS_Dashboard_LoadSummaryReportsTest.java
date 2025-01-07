package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_LoadSummaryReport;

public class LPS_Dashboard_LoadSummaryReportsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_LoadSummaryReport Report;

	public LPS_Dashboard_LoadSummaryReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_LoadSummaryReport();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for load summary
	 * report on dashboard
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_LoadSummaryReports_Tests() {
//This will run all the methods
		Report.LoadSummaryReport();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
