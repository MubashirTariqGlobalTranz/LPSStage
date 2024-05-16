package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocChangePayment;

public class LPS_Admin_AdhocChangePaymentTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocChangePayment Admin;

	public LPS_Admin_AdhocChangePaymentTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocChangePayment();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Change Payment from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_ChangePayment_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ChangePayment();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expectedPrefix = "Payment #";

		// Check if the actual message starts with the expected prefix
		Assert.assertTrue(actual.contains(expectedPrefix), "Expected message to contain '" + expectedPrefix + "'");
		captureScreenShot(driver, "Verify Adhoc Change Payment ");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
