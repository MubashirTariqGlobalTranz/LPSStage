package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_ShipmentLookUp_Report;

public class FreightPayment_ShipmentLookUp_ReportTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_ShipmentLookUp_Report freightPayment;

	public FreightPayment_ShipmentLookUp_ReportTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_ShipmentLookUp_Report();
	}
	/**

	Test case description:
	This test case verifies the following shipment lookup for FreightPayment:
	Verify by shipment no search
	Verify by Invoice no search
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_ShipmentLookUp_tests() {
//This will run all the methods

		freightPayment.AccountPayableGTZ();
		freightPayment.Report_ShipmentLookup();
		freightPayment.Lookup_ShipmentNo();
		freightPayment.LookUp_Invoice();
		
//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Report - Shipment Lookup']"))
				.getText();
		String expected = "Report - Shipment Lookup";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
