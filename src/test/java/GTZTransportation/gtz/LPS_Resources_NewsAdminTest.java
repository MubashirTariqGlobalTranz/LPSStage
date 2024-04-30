package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Resources_NewsAdmin;

public class LPS_Resources_NewsAdminTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Resources_NewsAdmin Resources;

	public LPS_Resources_NewsAdminTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Resources = new LPS_Resources_NewsAdmin();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Resources for
	 * LPS: Verify News Items.
	 * 
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Resources_News_Admin_Tests() {
//This will run all the methods
		Resources.Resources();
		Resources.NewsItems();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//a[normalize-space()='ID']")).getText();
		String expected = "ID";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
