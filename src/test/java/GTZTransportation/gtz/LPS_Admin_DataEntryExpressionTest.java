package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_DataEntryExpression;

public class LPS_Admin_DataEntryExpressionTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_DataEntryExpression Admin;

	public LPS_Admin_DataEntryExpressionTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_DataEntryExpression();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Data Entry Expressions. Verify Data Entry Expression Help.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_DataEntryExpressions_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.SearchExpression();
		Admin.DataEntryExpression();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Data Entry Expression Help']")).getText();
		String expected = "Data Entry Expression Help";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Data Entry Expression Help");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
