package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadBoard_OpenLoads_SpotQuote;

public class LoadBoard_OpenLoads_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadBoard_OpenLoads_SpotQuote loadPage;

	public LoadBoard_OpenLoads_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadBoard_OpenLoads_SpotQuote();
	}

	/**
	 * 
	 * Test case description: This test case verifies the open loads in Spot Quote:
	 * Load Boards: Verify Open Load is opening.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadBoard_OpenLoads_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.All_OpenLoadst();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
