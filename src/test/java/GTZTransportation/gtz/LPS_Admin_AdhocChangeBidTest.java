package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocChangeBid;

public class LPS_Admin_AdhocChangeBidTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AdhocChangeBid Admin;

	public LPS_Admin_AdhocChangeBidTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AdhocChangeBid();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Change Bid from Adhoc tools.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_ChangeBidr_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ChangeBid();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Bid Amount successfully updated";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Bid Amount successfully updated");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
