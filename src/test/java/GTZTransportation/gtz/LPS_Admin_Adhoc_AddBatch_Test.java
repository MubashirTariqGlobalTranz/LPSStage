package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_Adhoc_AddBatch;

public class LPS_Admin_Adhoc_AddBatch_Test extends BaseClass {

	// public static WebDriver driver;
	LPS_Admin_Adhoc_AddBatch Admin;

	public LPS_Admin_Adhoc_AddBatch_Test() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Admin = new LPS_Admin_Adhoc_AddBatch();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Admin Section
	 * for LPS: Verify Add Shipments In Batch.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Admin_Adhoc_AddBatch_Tests() {
//This will run all the methods
		Admin.Admin();
		Admin.ChangeBid();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Successfully added 1 shipment(s) to Batch# 201497";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Shipment Added to Batch");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
