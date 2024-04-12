package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPSCustomer_Carrier_CustomerList;

public class LPSCustomer_Carrier_CustomerListTest extends BaseClass {
	// public static WebDriver driver;
	LPSCustomer_Carrier_CustomerList CustomerCarrier;

	public LPSCustomer_Carrier_CustomerListTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		CustomerCarrier = new LPSCustomer_Carrier_CustomerList();
	}
	/**

	Test case description:
	This test case contains test cases for customer list for the customer/carrier app:
	Verify customer list.
	Verify customers can be searched.
	Verify customer details open.
	Verify customer details contain Contacts, Location, Savings, Rates, Insurance, Manager.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void CustomerCarriers_CustomerList_tests() {
//This will run all the methods

		CustomerCarrier.clientAdminGTZ();
		CustomerCarrier.clientAdminUser();
		CustomerCarrier.Contacts();
		CustomerCarrier.Location();
		CustomerCarrier.Savings();
		CustomerCarrier.Rates();
		CustomerCarrier.Insurance();
		CustomerCarrier.Managers();
		CustomerCarrier.CustomerDetails();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Customer List']")).getText();
		String expected = "Customer List";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify CustomerList");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}

}
