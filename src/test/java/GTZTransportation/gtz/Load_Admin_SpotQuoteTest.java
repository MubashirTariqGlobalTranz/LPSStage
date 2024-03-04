package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Load_Admin_SpotQuote;

public class Load_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Load_Admin_SpotQuote Admin;

	public Load_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new Load_Admin_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadServices_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_LoadServices_Admin();
		Admin.loadService_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Load Service Details']")).getText();
		String expected = "Load Service Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
