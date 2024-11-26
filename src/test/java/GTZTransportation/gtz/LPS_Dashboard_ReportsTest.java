package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_Reports;

public class LPS_Dashboard_ReportsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_Reports Report;

	public LPS_Dashboard_ReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_Reports();
	}

	/**
	 * 
	 * Test case description: This test case contains test cases for reports on
	 * dashboard: Verify Application Error Details.
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_Reports_Tests() {
//This will run all the methods
		Report.Report();
		Report.SearchReport();

//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Error#']")).getText();
		String expected = "Error#";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
