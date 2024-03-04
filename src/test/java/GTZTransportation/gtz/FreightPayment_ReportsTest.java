package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_Reports;

public class FreightPayment_ReportsTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_Reports freightPayment;

	public FreightPayment_ReportsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_Reports();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_Report_tests() {
//This will run all the methods

		freightPayment.AccountPayableGTZ();
		freightPayment.Report_FreightDataImport();
		freightPayment.Report_FreightDataDetails();
		freightPayment.Report_LineItemCodes();
		freightPayment.Report_CarrierShipmentSummary();
		freightPayment.Report_FeeCheck();
		freightPayment.Report_ZipList();
		freightPayment.Report_LoadMasterOrder();
		//freightPayment.Report_PayableHistory();
		freightPayment.Report_AccessorialCodes();
		freightPayment.Report_EricssonGLCodes();
		freightPayment.Report_CarrierSummaryTransfer();
		freightPayment.Report_ManualTransferDetails();
		freightPayment.Report_ManualTransferSummary();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Manual Transfer Summary']"))
				.getText();
		String expected = "Report - Manual Transfer Summary";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
