package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_Security;

public class LPS_Admin_SecurityTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_Security Admin;

	public LPS_Admin_SecurityTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_Security();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Security Users & Roles
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Security_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.Roles();
		Admin.Users();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Users']")).getText();
		String expected = "Users";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify User details");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
