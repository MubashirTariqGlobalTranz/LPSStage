package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.VICS_VeiwOrders;



public class VICS_VeiwOrdersTest extends BaseClass {
	// public static WebDriver driver;
	VICS_VeiwOrders customer;

	public VICS_VeiwOrdersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		customer = new VICS_VeiwOrders();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void VICS_ViewOrders_Tests() {
//This will run all the methods

		customer.VICSTab();
		customer.VICS_App();
		

//This will  verify Vics Orders , This assertion will work
		String actual = driver.findElement(By.className("guidetitle")).getText();
		String expected = "Inbound Shipping and Routing Guide";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify VICS App & Orders showing");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
