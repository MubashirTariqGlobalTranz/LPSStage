package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AssetUpload;

public class LPS_Admin_AssetUploadTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_AssetUpload Admin;

	public LPS_Admin_AssetUploadTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_AssetUpload();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Asset Upload Page.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_AssetUpload_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.AssetUpload();
		

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//p[@class='margin-bottom-5px']")).getText();
		String expected = "• File - A valid file is required";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Asset upload");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
