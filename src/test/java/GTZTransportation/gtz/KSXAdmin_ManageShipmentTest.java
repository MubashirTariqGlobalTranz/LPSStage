package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KSXAdmin_ManageShipment;

public class KSXAdmin_ManageShipmentTest extends BaseClass {
	// public static WebDriver driver;
	KSXAdmin_ManageShipment Shipments;

	public KSXAdmin_ManageShipmentTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Shipments = new KSXAdmin_ManageShipment();
	}
	/**

	Test case description:
	This test case verifies the Manage Shipments section for KSX admin:
	Manage Shipment Filters:
	Verify Manage shipment page is functional.
	Verify filters operate correctly.
	Manage Shipment Advance Search:
	Verify Advance search functionality and search results.
	Manage Shipment Tabs:
	Verify Manage Shipments Tabs functionality.
	Verify Dispatch Tab operation.
	Verify In Transit Tab functionality.
	Verify Delivered Tab operation.
	Verify Exception Tab functionality.
	Verify All Tab operation.
	Verify Context filters functionality: Customer, Carriers.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KSXAdmin_ManageShipment_Tests() {
//This will run all the methods

		Shipments.KSXAdminTab();
		Shipments.KSXAdmin_ManageShipmentSearch();
		Shipments.KSXAdmin_ManageShipmentTab();
		Shipments.KSXAdmin_ManageShipmentContextFilter();
		Shipments.KSXAdmin_ManageShipmentExport();
		Shipments.KSXAdmin_ManageShipmentAdvanceSearch();
//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//*[text()='Managed Freight']")).getText();
		String expected = "Managed Freight";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify KSX Admin Manage Shipments");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
