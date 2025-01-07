package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_DensityCalculator;

public class LPS_Dashboard_DensityCalculatorTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_DensityCalculator Report;

	public LPS_Dashboard_DensityCalculatorTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_DensityCalculator();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for density
	 * calculator on dashboard
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_DensityCalulator_Tests() {
//This will run all the methods
		Report.DensityCalulator();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
