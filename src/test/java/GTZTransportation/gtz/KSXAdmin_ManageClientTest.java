package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KSXAdmin_ManageClient;

public class KSXAdmin_ManageClientTest extends BaseClass {
	// public static WebDriver driver;
	KSXAdmin_ManageClient Shipments;

	public KSXAdmin_ManageClientTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Shipments = new KSXAdmin_ManageClient();
	}
	/**

	Test case description:
	This test case verifies the Manage clients section for KSX admin:
	Verify Manage client opens successfully.
	Verify client details are displayed & edit.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KSXAdmin_ManageClient_Tests() {
//This will run all the methods

		Shipments.KSXAdminTab();
		Shipments.KSXAdminManageClient();
		Shipments.KSXAdmin_ManageclientEdit();

//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//h1[normalize-space()='Manage Clients']")).getText();
		String expected = "Manage Clients";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();

	}
}
