package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadHistory_SpotQuote;

public class LoadHistory_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadHistory_SpotQuote loadPage;

	public LoadHistory_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadHistory_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadHistory_Tests() {
		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.Load_History();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
