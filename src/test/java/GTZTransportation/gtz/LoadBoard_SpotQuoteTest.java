package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadBoard_SpotQuote;

public class LoadBoard_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadBoard_SpotQuote loadPage;

	public LoadBoard_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadBoard_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LoadBoard_Search_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.All_LoadBoard();
		loadPage.New_LoadBoard();
		loadPage.Open_LoadBoard();
		loadPage.Awarded_LoadBoard();
		loadPage.InTransit_LoadBoard();
		loadPage.Delivered_LoadBoard();
		loadPage.Completed_LoadBoard();
		loadPage.Cancelled_LoadBoard();
		loadPage.Action_LoadBoard();

		//Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Actions']")).getText();
		String expected = "Actions";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Actions");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
