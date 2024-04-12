package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue_Invoicegeneral;

public class KeyRevenue_InvoicegeneralTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue_Invoicegeneral keyRevenue;

	public KeyRevenue_InvoicegeneralTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue_Invoicegeneral();
	}
	/**

	Test case description:
	This test case verifies the Invoice & Shipment section for Key Revenue:
	Verify billable invoices.
	Verify invoice payments.
	Verify invoice file review module, search for files.
	Verify Shipments.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_InvoiceGeneral_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.Invoice_Billable();
		keyRevenue.Invoice_Payment();
		keyRevenue.Invoice_FileReview();
		keyRevenue.Shipments();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Pending Shipments']")).getText();
		String expected = "Pending Shipments";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
