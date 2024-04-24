package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_ProductCatalog_MyTeam;

public class LPS_ProductCatalog_MyTeamTest extends BaseClass {

	// public static WebDriver driver;
	LPS_ProductCatalog_MyTeam AccountManager;

	public LPS_ProductCatalog_MyTeamTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		AccountManager = new LPS_ProductCatalog_MyTeam();
	}
	/**

	Test case description:
	This test case contains test cases for account Management for LPS:
	Verify product catalog.
	Verify My team.

	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_AccountManagement_Tests() {
//This will run all the methods
		AccountManager.AccountManagement();
		AccountManager.ProductCatalog();
		AccountManager.MyTeam();
		
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h1[normalize-space()='E-mail Your Support Team']")).getText();
		String expected = "E-mail Your Support Team";
		Assert.assertEquals(actual, expected);
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
