package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue_Invoice;

public class KeyRevenue_InvoiceTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue_Invoice keyRevenue;

	public KeyRevenue_InvoiceTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue_Invoice();
	}
	/**

	Test case description:
	This test case verifies Invoice for Key Revenue:
	Verify Invoice creation.
	Verify Invoice search.
	Verify Invoice sending.
	Verify Invoice canceling.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_Invoice_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.Create_Invoice();
		keyRevenue.Search_Invoice();
		keyRevenue.Send_Invoice();
		keyRevenue.Cancel_Invoice();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='notify-success']")).getText();
		String expected = "The status for this invoice has been updated to \"Cancelled\".";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
