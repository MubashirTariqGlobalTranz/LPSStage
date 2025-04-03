package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Dashboard_GenerateBOL;

public class Dashboard_GenerateBOLTest extends BaseClass {
	// public static WebDriver driver;
	Dashboard_GenerateBOL GenerateBOL;

	public Dashboard_GenerateBOLTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		GenerateBOL = new Dashboard_GenerateBOL();
	}
	/**

	Test case description:
	GenerateBOL App on Dashboard:
	Verify GenerateBOL app is opening.
	Verify assertion is working as expected.
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void Dashboard_GenerateBOL_Test() {
//This will run all the methods

		GenerateBOL.Dashboard_GenerateBOLGTZ();
		GenerateBOL.GenerateBOLPage();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
