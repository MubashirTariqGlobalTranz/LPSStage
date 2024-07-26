package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadFlow_SpotQuote_Ericsson_Radiant_Global_PDConfirmation;

public class LoadFlow_SpotQuote_Ericsson_Radiant_Global_PD_Test extends BaseClass {
	// public static WebDriver driver;
	LoadFlow_SpotQuote_Ericsson_Radiant_Global_PDConfirmation loadPage;

	public LoadFlow_SpotQuote_Ericsson_Radiant_Global_PD_Test() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadFlow_SpotQuote_Ericsson_Radiant_Global_PDConfirmation();
	}

	/**
	 * 
	 * Test case description: This test case will search the load for Ericson and do
	 * pickup & delivery confirmation against order in Spot Quote.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Ericson_PD_Confirmation_Tests() {
		// This will run all the tests
		loadPage.openSpotQuote();
		loadPage.Open_Load();
		loadPage.PickUpConfirmation();
		loadPage.DestinationConfirmation();

		// After Delivery confirmation this assertion will work
		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_collapsibleHistory_btnCollapseHistory']")).getText();
		String expected = "Load History Log";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "load Delivery confirmation");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
