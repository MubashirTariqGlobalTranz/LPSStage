package GTZTransportation.gtz;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateMassLoad_Award;

public class CreateMassLoad_AwardTest extends BaseClass {
	// public static WebDriver driver;
	CreateMassLoad_Award loadPage;

	public CreateMassLoad_AwardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateMassLoad_Award();
	}
	/**

	Test case description:
	Create Mass Copy in Spot Quote app:
	Verify Quick Load creation is successful.
	*/
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_MassLoad_Tests() {

		// This will run all the methods
		loadPage.openSpotQuote();
		loadPage.Create_Load();

		//After load will be Created, this will compare the text and test will pass/fail accordingly
		String actual = driver.findElement(By.className("info-validation")).getText();
		String expected = "The following loads were successfully created";
		assertTrue(actual.contains(expected));
		captureScreenShot(driver,"Verify Mass Load");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
