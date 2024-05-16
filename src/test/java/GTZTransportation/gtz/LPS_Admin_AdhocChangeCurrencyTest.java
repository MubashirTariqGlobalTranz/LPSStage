package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocChangeCurrency;

public class LPS_Admin_AdhocChangeCurrencyTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocChangeCurrency Admin;

	public LPS_Admin_AdhocChangeCurrencyTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocChangeCurrency();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Change Currency from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_ChangeCurrency_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ChangeCurrency();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expectedPrefix = "Status of the shipment ";

		// Check if the actual message starts with the expected prefix
		Assert.assertTrue(actual.contains(expectedPrefix), "Expected message to contain '" + expectedPrefix + "'");
		captureScreenShot(driver, "Verify Adhoc Change Currency ");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
