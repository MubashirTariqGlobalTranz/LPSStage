package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_MissingCarriers;

public class FreightPayment_MissingCarriersTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_MissingCarriers freightPayment;

	public FreightPayment_MissingCarriersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_MissingCarriers();
	}
	/**

	Test case description:
	This test case verifies Missing carrier for FreightPayment:
	Verify search functionality.
	Verify missing carrier details are displayed and can be opened.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_Missing_Carriers() {
//This will run all the methods

		freightPayment.FreightPaymentGTZ();
		freightPayment.MissingCarriers();
//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//*[text()='Missing Carrier Info']")).getText();
		String expected = "Missing Carrier Info";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Missing Carriers");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
