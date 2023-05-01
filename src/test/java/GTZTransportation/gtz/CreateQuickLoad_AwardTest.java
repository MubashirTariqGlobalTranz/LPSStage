package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateQuickLoad_Award;

public class CreateQuickLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	CreateQuickLoad_Award loadPage;

	public CreateQuickLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateQuickLoad_Award();
	}

	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuoteTest() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();
		loadPage.Award_load();

		//After load will be awarded, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]")).getText();
		String expected = "The Load was successfully awarded";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Quick Load");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
