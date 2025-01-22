package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRates_CancelLoad;

public class FindRates_CancelLoadTest extends BaseClass {

	// public static WebDriver driver;
	FindRates_CancelLoad Rates;

	public FindRates_CancelLoadTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new FindRates_CancelLoad();
	}
	/**

	Test case description:
	This test case verifies the Cancel Load in Find rates:
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_CancelLoad_Tests() {
//This will run all the methods
		Rates.openFindRatesHistory();

//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("//h1[normalize-space()='Rate Search Result']")).getText();
		String expected = "Rate Search Result";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
