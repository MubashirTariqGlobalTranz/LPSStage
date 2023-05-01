package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateBOL_FindRates;

public class CreateBOL_FindRatesTest extends BaseClass {
	// public static WebDriver driver;
	CreateBOL_FindRates loadPage;

	public CreateBOL_FindRatesTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new CreateBOL_FindRates();
	}

	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void FindRatesTest() {
//This will run all the methods
		loadPage.openFindRates();
		loadPage.FindRates();
		loadPage.CreateBOL();
//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[3]/div[1]/h1/small"))
				.getText();
		String expected = "Bill of Lading";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Find Ratesfor Normal BOL");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
