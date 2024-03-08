package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateLPSDirectLoad_Award;

public class CreateLPSDirectLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	CreateLPSDirectLoad_Award loadPage;

	public CreateLPSDirectLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateLPSDirectLoad_Award();
	}

	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_QuickLoad_Tests() {

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
