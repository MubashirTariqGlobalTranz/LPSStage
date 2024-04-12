package GTZTransportation.gtz;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateLPSDirectMassLoad_Award;

public class CreateLPSDirectMassLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	CreateLPSDirectMassLoad_Award loadPage;

	public CreateLPSDirectMassLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateLPSDirectMassLoad_Award();
	}
	/**

	Test case description:
	This test case verifies load creation for Mcleod from Spot Quote with Mass load.
	This process will be done using the Adhoc tool.
	*/
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_LPSDirect_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();

		//After load will be Created, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.className("notify-success")).getText();
		String expected = "Bid awarded to Carrier 10071";
		assertTrue(actual.contains(expected));
		captureScreenShot(driver,"Verify Load awarded to LPS Direct");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
