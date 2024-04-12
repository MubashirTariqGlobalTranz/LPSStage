package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CancelLoad_SpotQuote;

public class CancelLoad_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	CancelLoad_SpotQuote loadPage;

	public CancelLoad_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CancelLoad_SpotQuote();
	}

	/**
	Test case description:
	This test case creates a load in the Spot Quote section and verifies that the load is canceled properly.
	*/
	
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_CancelLoad_Tests() {
		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.Search_Load();
		//After load will be Cancelled, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.xpath("//*[text()='Cancelled']")).getText();
		String expected = "Cancelled";
		// for scrol the page
		Assert.assertEquals(actual, expected);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver,"Load Successfully Cancelled");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
