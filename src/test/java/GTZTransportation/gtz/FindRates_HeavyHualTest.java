package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRates_HeavyHaul;

public class FindRates_HeavyHualTest extends BaseClass {

	// public static WebDriver driver;
	FindRates_HeavyHaul Rates;

	public FindRates_HeavyHualTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new FindRates_HeavyHaul();
	}

	/**
	 * 
	 * Test case description:
	 * 
	 * Verify successful opening of Heavy Hual Page.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_HeavyHual_Tests() {
//This will run all the methods
		Rates.openFindRates();
		Rates.HeavyHual();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
