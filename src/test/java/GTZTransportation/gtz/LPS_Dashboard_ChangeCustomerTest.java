package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_ChangeCustomer;

public class LPS_Dashboard_ChangeCustomerTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_ChangeCustomer Report;

	public LPS_Dashboard_ChangeCustomerTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Report = new LPS_Dashboard_ChangeCustomer();
	}

	/**
	 * 
	 * Test case description: This test case contains Change customer on Dashboard.
	 * 
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_ChangeCustomer_Tests() {
//This will run all the methods
		Report.selectAndSaveCustomer();
		
		String actual = driver.findElement(By.xpath("//h4[1]"))
				.getText();
		String expected = "Cameron's Coffee";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
