package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Orders_PO_SpotQuote;

public class Orders_PO_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Orders_PO_SpotQuote loadPage;

	public Orders_PO_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new Orders_PO_SpotQuote();
	}

	/**
	 * 
	 * Test case description: This test case verifies the PO Creation for Orders in
	 * Spot Quote: Orders: Verify PO adding successfully.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_POCreation_Orders_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.PO_Creation();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
