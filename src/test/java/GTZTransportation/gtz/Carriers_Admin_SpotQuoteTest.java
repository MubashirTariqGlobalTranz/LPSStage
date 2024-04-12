package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Carriers_Admin_SpotQuote;

public class Carriers_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Carriers_Admin_SpotQuote Admin;

	public Carriers_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new Carriers_Admin_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the carrier admin section for Spot Quote. It searches for the carrier and opens the carrier details.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Carriers_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_Carriers_Admin();
		Admin.Search_Carriers_Admin();
		Admin.Carrier_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Details']")).getText();
		String expected = "Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
