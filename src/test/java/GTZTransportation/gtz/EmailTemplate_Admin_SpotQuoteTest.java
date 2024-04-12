package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.EmailTemplate_Admin_SpotQuote;

public class EmailTemplate_Admin_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	EmailTemplate_Admin_SpotQuote Admin;

	public EmailTemplate_Admin_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new EmailTemplate_Admin_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the Email templates in admin section for Spot Quote. It opens email templates and save them.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_EmailTemplate_Admin_Tests() {

		// This will run all the methods
		Admin.openSpotQuote();
		Admin.Open_EmailTemplate_Admin();
		Admin.TemplateDetail_Admin();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Email Template Details']")).getText();
		String expected = "Email Template Details";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
