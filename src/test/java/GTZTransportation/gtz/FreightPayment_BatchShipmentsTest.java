package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_BatchShipments;

public class FreightPayment_BatchShipmentsTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_BatchShipments freightPayment;

	public FreightPayment_BatchShipmentsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_BatchShipments();
	}

	/**
	 * 
	 * Test case description: This test case verifies BatchShipment page in
	 * FreightPayment:
	 * 
	 */
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_BatchShipments_test() {
//This will run all the methods

		freightPayment.BatchShipmentGTZ();
		freightPayment.Batchshipments();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Review Confirmation']"))
				.getText();
		String expected = "Shipment Review Confirmation";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify BatchShipment review FreightPayment");

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
