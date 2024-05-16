package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocResetPass;

public class LPS_Admin_AdhocResetPassTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocResetPass Admin;

	public LPS_Admin_AdhocResetPassTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocResetPass();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify reset password from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_ResetPass_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ResetPass();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expectedPrefix = "Password successfully reset";

		// Check if the actual message starts with the expected prefix
		Assert.assertTrue(actual.contains(expectedPrefix), "Expected message to contain '" + expectedPrefix + "'");
		captureScreenShot(driver, "Verify Adhoc Password reset");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
