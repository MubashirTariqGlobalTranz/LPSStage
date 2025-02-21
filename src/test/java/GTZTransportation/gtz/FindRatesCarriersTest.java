package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.FindRatesCarriers;

public class FindRatesCarriersTest extends BaseClass {
	// public static WebDriver driver;
	FindRatesCarriers loadPage;

	public FindRatesCarriersTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		loadPage = new FindRatesCarriers();
	}
	/**

	Test case description:
	Find Rates Result:
	Verify carrier Rates are displayed.
	Verify DiscountedPrice Detail
	Verify Carrier Details page
	*/
	@Test(priority = 1, groups = ("Regression"),retryAnalyzer = listeners.MyRetry.class)
	public void FindRates_Carriers_Tests() {
//This will run all the methods
		loadPage.openFindRates();
		loadPage.FindRates();
		loadPage.DiscountedPriceDetails();
		loadPage.CarrierDetails();
		
//After creating BOL, This assertion will work
		String actual = driver.findElement(By.xpath("//div[@class='body-fixed']//small[contains(text(),'CARRIER INFORMATION')]")).getText();
		String expected = "CARRIER INFORMATION";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Find Rates CarrierDetails");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
