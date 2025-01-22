package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRates_CopyLoad;

public class FindRates_CopyLoadTest extends BaseClass {

	// public static WebDriver driver;
	FindRates_CopyLoad Rates;

	public FindRates_CopyLoadTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new FindRates_CopyLoad();
	}

	/**
	 * 
	 * Test case description: This test case verifies the Copy Load in Find
	 * rates: Verify copy load functionality is working properly.
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_CopyLoad_Tests() {
//This will run all the methods
		Rates.openFindRatesHistory();
		Rates.CopyLoad();
		Rates.CreateBOL();
//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("//small[normalize-space()='Bill of Lading']")).getText();
		String expected = "Bill of Lading";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Find Rates Copy Load");

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
