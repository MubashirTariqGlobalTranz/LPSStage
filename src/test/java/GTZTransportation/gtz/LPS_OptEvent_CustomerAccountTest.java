package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_OptEvent_CustomerAccount;

public class LPS_OptEvent_CustomerAccountTest extends BaseClass {

	// public static WebDriver driver;
	LPS_OptEvent_CustomerAccount AccountManager;

	public LPS_OptEvent_CustomerAccountTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		AccountManager = new LPS_OptEvent_CustomerAccount();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for account
	 * Management for LPS: Verify Optimization Details. Verify Customer Account No.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_AccountManagement_Tests() {
//This will run all the methods
		AccountManager.AccountManagement();
		AccountManager.OptimizationDetails();
		AccountManager.CustomerAccountNo();

		AccountManager.AccountDetails();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//button[normalize-space()='Back to Account Numbers']")).getText();
		String expected = "Back to Account Numbers";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
