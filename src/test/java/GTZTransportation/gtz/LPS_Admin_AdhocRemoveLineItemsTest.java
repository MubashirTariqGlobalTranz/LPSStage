package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Admin_AdhocRemoveLineItems;

public class LPS_Admin_AdhocRemoveLineItemsTest extends BaseClass {
	// public static WebDriver driver;
	LPS_Admin_AdhocRemoveLineItems loadPage;

	public LPS_Admin_AdhocRemoveLineItemsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LPS_Admin_AdhocRemoveLineItems();
	}

	/**
	 * 
	 * Test case description: This test case verifies load creation of Mass load.
	 * and after removing line items from Adhoc tool.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LPSAdhocRemoveLineItems_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();

		// After load will be Created, this will compare the text and test will
		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Load items successfully removed";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load items successfully removed");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
