package GTZTransportation.gtz;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CopyLoad_SpotQuote;

public class CopyLoad_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	CopyLoad_SpotQuote loadPage;

	public CopyLoad_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CopyLoad_SpotQuote();
	}
	/**

	Test case description:
	This test case creates a load in the Spot Quote section and verifies that the load is copied properly.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_CopyLoad_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.Copy_load();

		// After load will be Copied, this will compare the text and test will pass/fail
		// accordingly
		String actual = driver.findElement(By.className("success-validation")).getText();
		String expected = "Load successfully copied";
		assertTrue(actual.contains(expected));
		captureScreenShot(driver, "Verify Copy Load");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
