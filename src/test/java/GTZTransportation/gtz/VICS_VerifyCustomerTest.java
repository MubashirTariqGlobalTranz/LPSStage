package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.VICS_VerifyCustomer;

public class VICS_VerifyCustomerTest extends BaseClass {
	// public static WebDriver driver;
	VICS_VerifyCustomer customer;

	public VICS_VerifyCustomerTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		customer = new VICS_VerifyCustomer();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void VICS_CustomersList_Tests() {
//This will run all the methods

		customer.VICSTab();
		customer.VICS_App();
		

//This will  verify Vics App , This assertion will work
		String actual = driver.findElement(By.xpath("//*[text()='Customers']")).getText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify VICS App & Customers showing");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
