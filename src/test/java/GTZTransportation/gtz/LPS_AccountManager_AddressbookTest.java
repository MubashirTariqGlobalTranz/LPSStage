package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_AccountManager_AddressBook;

public class LPS_AccountManager_AddressbookTest extends BaseClass {

	// public static WebDriver driver;
	LPS_AccountManager_AddressBook AccountManager;

	public LPS_AccountManager_AddressbookTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		AccountManager = new LPS_AccountManager_AddressBook();
	}
	/**

	Test case description:
	This test case contains test cases for account Management for LPS:
	Verify address book.
	Verify addressbook details.

	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_AccountManagement_Addresses_Tests() {
//This will run all the methods
		AccountManager.AccountManagement();
		AccountManager.SearchAddress();
		AccountManager.AddressDetails();
		
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Addresses']")).getText();
		String expected = "Addresses";
		Assert.assertEquals(actual, expected);
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
