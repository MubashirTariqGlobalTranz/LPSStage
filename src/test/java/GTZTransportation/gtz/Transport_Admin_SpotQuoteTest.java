package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Transport_Admin_SpotQuote;

public class Transport_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Transport_Admin_SpotQuote Admin;

	public Transport_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new Transport_Admin_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Transport_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_Transport_Carrier_Admin();
		Admin.Transport_Admin();
		// Admin.User_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Service Types']")).getText();
		String expected = "Service Types";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
