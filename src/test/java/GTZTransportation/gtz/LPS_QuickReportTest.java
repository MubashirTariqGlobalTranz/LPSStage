package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_QuickReport;

public class LPS_QuickReportTest extends BaseClass {

	// public static WebDriver driver;
	LPS_QuickReport Report;

	public LPS_QuickReportTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_QuickReport();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for Quick Data
	 * Report for LPS: Verify Quick data report is opening. Verify Totals &
	 * Shipments tables
	 * 
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_QuickReport_Tests() {
//This will run all the methods
		Report.QuickReport();
		Report.QuickReportData();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//th[normalize-space()='CustomerName']")).getText();
		String expected = "CustomerName";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
