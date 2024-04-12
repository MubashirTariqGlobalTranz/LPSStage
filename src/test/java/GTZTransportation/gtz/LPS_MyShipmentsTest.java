package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_MyShipments;

public class LPS_MyShipmentsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_MyShipments Shipments;

	public LPS_MyShipmentsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Shipments = new LPS_MyShipments();
	}
	/**

	Test case description:
	This test case verifies "My Shipments" for LPS:
	Verify my shipments are displayed.
	Verify search functionality is working.
	Verify shipment details.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_MyshipmentsTest() {
//This will run all the methods
		Shipments.openMyShipments();
		Shipments.SearchShipments();
		Shipments.ShipmentsDetails();
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//span[@id='lblMyShipmentsName']")).getText();
		String expected = "My Shipments";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify My Shipments");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
