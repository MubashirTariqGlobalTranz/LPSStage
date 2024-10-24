package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Orders_SpotQuote;

public class Orders_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Orders_SpotQuote loadPage;

	public Orders_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new Orders_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the Orders in Spot Quote:
	Orders:
	Verify PO against Customer.
	Verify All PO details Origin/Destination/Item/Notes/Import.
	Verify All Tabs New/Hold/Load Created/Completed/Cancelled/All.
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Orders_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.All_Orders();
		loadPage.All_Orders_Tabs();

		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
