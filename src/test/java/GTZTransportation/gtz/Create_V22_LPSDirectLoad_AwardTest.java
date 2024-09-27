package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Create_V22_LPSDirectLoad_Award;

public class Create_V22_LPSDirectLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	Create_V22_LPSDirectLoad_Award loadPage;

	public Create_V22_LPSDirectLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new Create_V22_LPSDirectLoad_Award();
	}
	/**

	Test case description:
	This test case verifies load creation for Mcleod from Spot Quote for V22 Mcleod.
	*/
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_V22_LPSDirect_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.Award_load();

		//After load will be awarded, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]")).getText();
		String expected = "The Load was successfully awarded";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Load awarded to LPS Direct");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
