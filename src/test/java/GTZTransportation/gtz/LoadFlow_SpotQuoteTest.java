package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadFlow_SpotQuote;

public class LoadFlow_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadFlow_SpotQuote loadPage;

	public LoadFlow_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadFlow_SpotQuote();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_CompleteLoadFlow_Tests() {
		// This will run all the tests
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.load_Award();
		loadPage.Search_Load();
		loadPage.PickUpETA();
		loadPage.PickUpConfirmation();
		loadPage.DestinationETA();
		loadPage.DestinationConfirmation();
		loadPage.LoadCompleteFlow();
		// After load will be awarded, this will compare the text and test will
		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Completed']")).getText();
		String expected = "Completed";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Load Completed Successfully");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
