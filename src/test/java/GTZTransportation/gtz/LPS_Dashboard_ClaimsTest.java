package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_Claims;

public class LPS_Dashboard_ClaimsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_Claims Claims;

	public LPS_Dashboard_ClaimsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Claims = new LPS_Dashboard_Claims();
	}
	/**

	Test case description:
	This test case contains test cases for Claims for LPS:
	Verify Claims List.
	Verify Claims.

	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_Claims_Tests() {
//This will run all the methods
		Claims.ClaimList();
		Claims.ClaimListPage();
	    Claims.AddClaims();
	
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//b[@id='bClaimEntryForm']")).getText();
		String expected = "Claim Entry Form";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Claim Entry Form");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
