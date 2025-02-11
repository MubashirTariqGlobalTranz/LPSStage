package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Report_SpotQuote;

public class Report_SpotQuoteTest extends BaseClass {
	// public static WebDriver driver;
	Report_SpotQuote Report;

	public Report_SpotQuoteTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new Report_SpotQuote();
	}
	/**

	Test case description:
	This test case contains test cases for the following reports in the Spot Quote app:
	LinkedLoad
	CarrierList
	CarrierGroup
	AwardLoad
	EdiFileTrackingList
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void spotQuote_Reports_Tests() {

		// This will run all the methods
		Report.openSpotQuote();
		Report.Report_LinkedLoad();
		Report.Report_CarrierList();
		Report.Report_CarrierGroup();
		Report.Report_AwardLoad();
		/*Report.Report_EdiFileTrackingList();

		// Assertion & Screenshot on action Tab
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Edi File Tracking List']"))
				.getText();
		String expected = "Report - Edi File Tracking List";
		Assert.assertEquals(actual, expected);*/

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
