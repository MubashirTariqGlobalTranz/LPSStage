package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FreightPayment_AccountPayable;

public class FreightPayment_AccountPayableTest extends BaseClass {
	// public static WebDriver driver;
	FreightPayment_AccountPayable freightPayment;

	public FreightPayment_AccountPayableTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		freightPayment = new FreightPayment_AccountPayable();
	}
	/**

	Test case description:
	Account payable Tool Search Filters for FreightPayment app:
	Verify Account payable page opens successfully.
	Verify filters function correctly on account payable.
	Verify Details page opens and works properly.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void FreightPayment_Account_Payable() {
//This will run all the methods

		freightPayment.AccountPayableGTZ();
		freightPayment.AccountPayableSearch();
//After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//*[text()='Pending Invoices']")).getText();
		String expected = "Pending Invoices";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ AccountPayable Tool");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
