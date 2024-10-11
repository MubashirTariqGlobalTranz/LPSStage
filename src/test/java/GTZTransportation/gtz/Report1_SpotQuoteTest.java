package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Report1_SpotQuote;

public class Report1_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Report1_SpotQuote Report;

	public Report1_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new Report1_SpotQuote();
	}
	/**

	Test case description:
	This test case contains test cases for the following reports in the customer/carrier app:
	FixedLoad
	CurrentLoadActivity
	AwardLoad
	LoadPastDue
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Reports_Tests() {

		// This will run all the methods
		Report.openSpotQuote();
		Report.Report_FixedLoad();
		Report.Report_CurrentLoadActivity();
		Report.Report_AwardHistory();
		Report.Report_LoadPastDue();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Load Past Due']"))
				.getText();
		String expected = "Report - Load Past Due";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
