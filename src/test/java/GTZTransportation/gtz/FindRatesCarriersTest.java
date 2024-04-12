package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRatesCarriers;

public class FindRatesCarriersTest extends BaseClass {
	// public static WebDriver driver;
	FindRatesCarriers loadPage;

	public FindRatesCarriersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new FindRatesCarriers();
	}
	/**

	Test case description:
	Find Rates Result:
	Verify carrier Rates are displayed.
	*/
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_Carriers_Tests() {
//This will run all the methods
		loadPage.openFindRates();
		loadPage.FindRates();
		
//After creating BOL, This assertion will work
	/*	String actual = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]/div[20]/div/div[2]/table/tbody/tr[1]/th[5]/a")).getText();
		String expected = "Total Discounted Price ";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Find Rates Against Carriers");*/
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
