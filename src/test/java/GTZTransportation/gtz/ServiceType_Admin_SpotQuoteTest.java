package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.ServiceType_Admin_SpotQuote;

public class ServiceType_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	ServiceType_Admin_SpotQuote Admin;

	public ServiceType_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new ServiceType_Admin_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_ServiceTypes_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_ServiceTypes_Admin();
		Admin.ServiceType_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Service Type Details']")).getText();
		String expected = "Service Type Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
