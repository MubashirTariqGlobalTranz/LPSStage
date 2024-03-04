package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KeyRevenue_Admin;

public class KeyRevenue_AdminTest extends BaseClass {
	// public static WebDriver driver;
	KeyRevenue_Admin keyRevenue;

	public KeyRevenue_AdminTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		keyRevenue = new KeyRevenue_Admin();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KeyRevenue_Admin_tests() {
//This will run all the methods

		keyRevenue.keyRevenueGTZ();
		keyRevenue.Admin_Accounts();
		keyRevenue.Admin_SystemUsers();
		keyRevenue.Admin_CustomerConfig();
		keyRevenue.Admin_PaymentTerm();
		keyRevenue.Admin_LineItemBulk();
		keyRevenue.Admin_GLCodes();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='GL Codes']")).getText();
		String expected = "GL Codes";
		Assert.assertEquals(actual, expected);
		// captureScreenShot(driver, "Verify Report - Manual Transfer Summary");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
