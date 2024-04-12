package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.History_FindRates;

public class History_FindRatesTest extends BaseClass {

	// public static WebDriver driver;
	History_FindRates Rates;

	public History_FindRatesTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new History_FindRates();
	}
	/**

	Test case description:
	This test case verifies the History section in Find rates:
	Verify search functionality is working properly.
	Verify details are displayed correctly.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_History_Tests() {
//This will run all the methods
		Rates.openFindRatesHistory();

//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Rate Search History']")).getText();
		String expected = "Rate Search History";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
