package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateDirectLoad_Award;

public class CreateDirectLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	CreateDirectLoad_Award loadPage;

	public CreateDirectLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateDirectLoad_Award();
	}

	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_DirectLoad_Tests() {
		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.load_Award();
		loadPage.Search_Load();
		//After load will be awarded, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.className("success-validation")).getText();
		String expected = "The Load was successfully awarded";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Direct Load");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
