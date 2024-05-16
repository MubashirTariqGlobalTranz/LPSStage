package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocAssignCarrier;

public class LPS_Admin_AdhocAssignCarrierTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocAssignCarrier Admin;

	public LPS_Admin_AdhocAssignCarrierTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocAssignCarrier();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Assign carrier from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_AssignCarrier_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.AssignCarrier();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Carrier successfully updated";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify adhoc Carrier successfully updated");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
