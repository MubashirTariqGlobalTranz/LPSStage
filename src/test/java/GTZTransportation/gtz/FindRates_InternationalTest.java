package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRates_International;

public class FindRates_InternationalTest extends BaseClass {

	// public static WebDriver driver;
	FindRates_International Rates;

	public FindRates_InternationalTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new FindRates_International();
	}

	/**
	 * 
	 * Test case description:
	 * 
	 * Verify successful opening of International Rate Estimator Page.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_InternaltionaRateEstimator_Tests() {
//This will run all the methods
		Rates.openFindRates();
		Rates.Internaltional();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
