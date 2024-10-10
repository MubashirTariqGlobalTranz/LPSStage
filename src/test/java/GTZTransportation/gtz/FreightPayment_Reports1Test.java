package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_Reports1;

public class FreightPayment_Reports1Test extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_Reports1 freightPayment;

	public FreightPayment_Reports1Test() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_Reports1();
	}
	/**

	Test case description:
	This test case verifies the following reports for FreightPayment:
	Freight Data Batches
	Freight Data Search
	Allowed Carriers
	KeyQuote Carrier Check
	Value Map
	Batch Summary
	Accounting Contacts
	Shipment Advanced Detail
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_Report1_tests() {
//This will run all the methods

		freightPayment.AccountPayableGTZ();
		freightPayment.Report_FreightDataBatches();
		freightPayment.Report_FreightDataSearch();
		freightPayment.Report_AllowedCarriers();
		freightPayment.Report_KeyQuoteCarrierCheck();
		freightPayment.Report_ValueMap();
		freightPayment.Report_BatchSummary();
		freightPayment.Report_AccountingContacts();
		freightPayment.Report_ShipmentAdvanceDetails();
		

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Shipment Advanced Detail - By Batch']"))
				.getText();
		String expected = "Report - Shipment Advanced Detail - By Batch";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
