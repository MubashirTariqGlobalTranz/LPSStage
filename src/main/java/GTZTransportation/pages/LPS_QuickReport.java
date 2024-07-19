package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import GTZTransportation.gtz.BaseClass;

public class LPS_QuickReport extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Resources']")
	WebElement Resources;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnFilter']")
	WebElement FilterArticle;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Back;

	// Initialization
	public LPS_QuickReport() {
		PageFactory.initElements(driver, this);
	}

	// This will open Resources
	public void QuickReport()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://my-stage.shiplps.com/QuickData/?fk=KPOutstandingChecks");

		{
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		captureScreenShot(driver, "Verify QuickDataReport");
	}

	// This will open news listing
	public void QuickReportData() {

		String actual = driver.findElement(By.xpath("//th[normalize-space()='ShipmentCount']")).getText();
		String expected = "ShipmentCount";
		Assert.assertEquals(actual, expected);

	}

}
