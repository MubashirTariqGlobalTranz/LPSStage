package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadFlow_SpotQuote_Ericsson_Radiant_Global;

public class LoadFlow_SpotQuote_Ericsson_Radiant_GlobalTest extends BaseClass {
	// public static WebDriver driver;
	LoadFlow_SpotQuote_Ericsson_Radiant_Global loadPage;

	public LoadFlow_SpotQuote_Ericsson_Radiant_GlobalTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadFlow_SpotQuote_Ericsson_Radiant_Global();
	}

	/**
	 * 
	 * Test case description: This test case will search Ericson Load & Award load
	 * in Spot Quote. also add PETA & DETA in load
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Ericson_PETA_DETA_Tests() {
		// This will run all the tests
		loadPage.openSpotQuote();
		loadPage.Open_Load();
		loadPage.load_Award();
		loadPage.PickUpETA();

		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_collapsibleHistory_btnCollapseHistory']")).getText();
		String expected = "Load History Log";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Load PETA DETA");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
