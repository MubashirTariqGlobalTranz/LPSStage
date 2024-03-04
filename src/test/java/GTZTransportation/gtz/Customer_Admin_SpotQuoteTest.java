package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Customer_Admin_SpotQuote;

public class Customer_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Customer_Admin_SpotQuote Admin;

	public Customer_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new Customer_Admin_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Customers_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_Customer_Admin();
		Admin.Search_Customer_Admin();
		Admin.Customer_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Customer Details - Armacell LLC']"))
				.getText();
		String expected = "Customer Details - Armacell LLC";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
