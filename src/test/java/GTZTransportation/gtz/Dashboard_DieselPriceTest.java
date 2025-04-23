package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Dashboard_DieselPrice;

public class Dashboard_DieselPriceTest extends BaseClass {

	// public static WebDriver driver;
	Dashboard_DieselPrice Report;

	public Dashboard_DieselPriceTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new Dashboard_DieselPrice();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Regions
	 *  on dashboard
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_DieselPrice_Tests() {
//This will run all the methods
		Report.DieselPrice();
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
