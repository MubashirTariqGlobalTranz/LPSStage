package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.VICS_VerifyBOLCreation;


public class VICS_VerifyBOLCreationTest extends BaseClass {
	// public static WebDriver driver;
	VICS_VerifyBOLCreation customer;

	public VICS_VerifyBOLCreationTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		customer = new VICS_VerifyBOLCreation();
	}

	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void VICS_BOLCreation_Tests() {
//This will run all the methods

		customer.VICSTab();
		customer.VICS_ShipmentCriteria();
		customer.VICS_ShipmentRecommendations();
		customer.VICS_BOLCreation();

//On Creation of BOL, This assertion will work
		String actual = driver.findElement(By.className("confirm")).getText();
		String expected = "Bill of Lading successfully generated, click below to download the PDF.";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify VICS & BOL Creation Successfully");
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
