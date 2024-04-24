package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_AccountManager_ActionBilling;

public class LPS_AccountManager_ActionBillingTest extends BaseClass {

	// public static WebDriver driver;
	LPS_AccountManager_ActionBilling AccountManager;

	public LPS_AccountManager_ActionBillingTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		AccountManager = new LPS_AccountManager_ActionBilling();
	}
	/**

	Test case description:
	This test case contains test cases for account Management for LPS:
	Verify Actions Events.
	Verify Billing Manger.

	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_AccountManagement_Tests() {
//This will run all the methods
		AccountManager.AccountManagement();
		AccountManager.SearchActionEvent();
		AccountManager.ActionEventsDetails();
		AccountManager.BillableManager();
		AccountManager.BillableManagerInvocies();
		AccountManager.BillableManagerExport();
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Export']")).getText();
		String expected = "Export";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Action Event & Billings");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
