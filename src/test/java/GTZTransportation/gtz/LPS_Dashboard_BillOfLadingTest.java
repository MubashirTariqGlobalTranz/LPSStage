package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_BillOfLading;

public class LPS_Dashboard_BillOfLadingTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_BillOfLading Report;

	public LPS_Dashboard_BillOfLadingTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_BillOfLading();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for bill of lading on dashboard
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_BillOfLading_Tests() {
//This will run all the methods
		Report.BillOfLading();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
