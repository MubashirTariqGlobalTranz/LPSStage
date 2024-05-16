package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_Adhoc;

public class LPS_Admin_AdhocTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_Adhoc Admin;

	public LPS_Admin_AdhocTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_Adhoc();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Copy user from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_CopyUser_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.CopyUser();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Operation successfully executed";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Copy Operation successfully executed");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
