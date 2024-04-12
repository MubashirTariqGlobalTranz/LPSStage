package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Requirment_Admin_SpotQuote;

public class Requirment_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Requirment_Admin_SpotQuote Admin;

	public Requirment_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new Requirment_Admin_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the Requirement admin section for Spot Quote. It searches for the Requirement for carrier and opens the Requirement details.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Requirment_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_Requirment_Carrier_Admin();
		Admin.Requirment_Details_Admin();
		// Admin.User_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Requirement Details']")).getText();
		String expected = "Requirement Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
