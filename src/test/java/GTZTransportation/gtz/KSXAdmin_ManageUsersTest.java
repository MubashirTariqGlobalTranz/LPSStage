package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KSXAdmin_ManageUsers;

public class KSXAdmin_ManageUsersTest extends BaseClass {
	// public static WebDriver driver;
	KSXAdmin_ManageUsers Shipments;

	public KSXAdmin_ManageUsersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Shipments = new KSXAdmin_ManageUsers();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KSXAdmin_ManageUsers_Tests() {
//This will run all the methods

		Shipments.KSXAdminTab();
		Shipments.KSXAdminManageUsers_ClientsUser();
		Shipments.KSXAdmin_ManageUsers_SAVUsers();
		Shipments.KSXAdmin_ManageUsers_AdminSiteUser();

//After Search, This assertion will work
		String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
		String expected = "User saved successfully.";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
