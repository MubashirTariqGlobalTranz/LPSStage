package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.KSXAdmin_ManageSalesRep;

public class KSXAdmin_ManageSalesReptTest extends BaseClass {
	// public static WebDriver driver;
	KSXAdmin_ManageSalesRep Shipments;

	public KSXAdmin_ManageSalesReptTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Shipments = new KSXAdmin_ManageSalesRep();
	}
	/**

	Test case description:
	This test case verifies the Manage Sales rep section for KSX admin:
	Verify sales reps can be opened.
	Verify sales rep details are displayed.
	Verify saving sales rep functionality.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void KSXAdmin_ManageSalesRep_Tests() {
//This will run all the methods

		Shipments.KSXAdminTab();
		Shipments.KSXAdminManageSalesRepSearch();
		Shipments.KSXAdmin_ManageSalesRepSearch();

//After Search, This assertion will work
		String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
		String expected = "Sales Person information saved successfully.";
		Assert.assertEquals(actual, expected);

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();

	}
}
