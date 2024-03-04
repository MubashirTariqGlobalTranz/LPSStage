package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadBoard_Search_SpotQuote;

public class LoadBoard_Search_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadBoard_Search_SpotQuote loadPage;

	public LoadBoard_Search_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadBoard_Search_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadBoard_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.All_LoadBoard();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//a[normalize-space()='All']")).getText();
		String expected = "All";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - All");
	}

@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
