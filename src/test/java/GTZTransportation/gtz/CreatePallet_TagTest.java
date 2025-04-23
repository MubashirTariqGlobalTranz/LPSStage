package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreatePallet_Tag;

public class CreatePallet_TagTest extends BaseClass {
	// public static WebDriver driver;
	CreatePallet_Tag loadPage;

	public CreatePallet_TagTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreatePallet_Tag();
	}

	/**
	 * 
	 * Test case description: Create Pallet tag in Spot Quote app: Verify Pallet tag & PDF
	 * creation is successful.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_PalletTag_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Pallet_Tag();
		loadPage.Pallet_TagPDF();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
