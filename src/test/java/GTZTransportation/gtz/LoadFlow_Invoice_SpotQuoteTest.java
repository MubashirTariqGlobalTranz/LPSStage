package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoadFlow_Invoice_SpotQuote;

public class LoadFlow_Invoice_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	LoadFlow_Invoice_SpotQuote loadPage;

	public LoadFlow_Invoice_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new LoadFlow_Invoice_SpotQuote();
	}
	/**

	Test case description:
	This test case verifies the complete load flow end-to-end in Spot Quote.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Complete_Load_Invoice_Flow_Tests() {
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
		loadPage.InvoiceCreation();
		// After load will be awarded, this will compare the text and test will
		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "Invoice successfully created";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Load & Invoice created Successfully");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
