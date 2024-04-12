package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.User_Admin_SpotQuote;

public class User_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	User_Admin_SpotQuote Admin;

	public User_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new User_Admin_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the Users in the admin section for Spot Quote. It searches for the Users and opens the Users details.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Users_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_Users_Admin();
		Admin.Search_Users_Admin();
		Admin.User_Details_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='User Details']")).getText();
		String expected = "User Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
