package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPSCustomer_Carrier_CarrierList;

public class LPSCustomer_Carrier_CarrierListTest extends BaseClass {
	// public static WebDriver driver;
	LPSCustomer_Carrier_CarrierList CustomerCarrier;

	public LPSCustomer_Carrier_CarrierListTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		CustomerCarrier = new LPSCustomer_Carrier_CarrierList();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void CustomerCarriers_CarrierList_tests() {
//This will run all the methods

		CustomerCarrier.CarrierGTZ();
		CustomerCarrier.CarrierList();
		CustomerCarrier.Search();
		CustomerCarrier.CarrierDetails();
		CustomerCarrier.CarrierDetailsLinks();
	

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Carrier Details']")).getText();
		String expected = "Carrier Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Carrier Details");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
