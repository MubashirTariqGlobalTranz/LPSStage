package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadBoard_LoadManagement_SpotQuote;

public class LoadBoard_LoadManagement_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadBoard_LoadManagement_SpotQuote loadPage;

	public LoadBoard_LoadManagement_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadBoard_LoadManagement_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the load Management in Spot Quote:
	Load Boards:
	Verify Load Management is opening.
	Verify Loads searching on Customers.
	Verify assertion works properly.
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadBoard_LoadManagement_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.All_LoadManagement();

		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
