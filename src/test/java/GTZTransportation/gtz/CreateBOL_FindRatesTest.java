package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.CreateBOL_FindRates;

public class CreateBOL_FindRatesTest extends BaseClass {
	

	// public static WebDriver driver;
	CreateBOL_FindRates Rates;

	public CreateBOL_FindRatesTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Rates = new CreateBOL_FindRates();
	}

	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_BOL_Creation_Tests() {
//This will run all the methods
		Rates.openFindRates();
		Rates.FindRates();
		Rates.CreateBOL();
//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("//small[normalize-space()='Bill of Lading']"))
				.getText();
		String expected = "Bill of Lading";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Find Rates for Normal BOL");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
