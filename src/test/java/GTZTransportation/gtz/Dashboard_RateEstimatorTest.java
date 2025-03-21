package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Dashboard_RateEstimator;

public class Dashboard_RateEstimatorTest extends BaseClass {

	// public static WebDriver driver;
	Dashboard_RateEstimator Dasboard;

	public Dashboard_RateEstimatorTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Dasboard = new Dashboard_RateEstimator();
	}
	/**

	Test case description:
	This test case contains test cases for RateEsitmator for LPS:
	Verify Rate Estimator Page.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_RateEstimator_Tests() {
//This will run all the methods
		Dasboard.RateEstimator();
		Dasboard.RateEstimatorSearch();
	    
	
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
