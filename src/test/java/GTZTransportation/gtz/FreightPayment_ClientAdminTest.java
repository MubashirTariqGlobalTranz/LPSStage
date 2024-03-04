package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_ClientAdmin;

public class FreightPayment_ClientAdminTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_ClientAdmin freightPayment;

	public FreightPayment_ClientAdminTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_ClientAdmin();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_ClientAdmin_tests() {
//This will run all the methods

		freightPayment.clientAdminGTZ();
		freightPayment.clientAdminUser();
		freightPayment.resetEmail();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='confirm']")).getText();
		String expected = "An email containing password reset instructions was successfully sent.";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}


	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
	
}
