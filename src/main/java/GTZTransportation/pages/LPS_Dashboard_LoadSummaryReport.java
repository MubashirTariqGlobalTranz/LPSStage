package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_LoadSummaryReport extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl02_ctl05_txtIdInput']")
	WebElement LoadNo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl02_ctl05_btnGenerate']")
	WebElement Generate;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl02_ctl05_linkReport']")
	WebElement Download;


	// Initialization
	public LPS_Dashboard_LoadSummaryReport() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management
	public void LoadSummaryReport()

	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LoadNo.sendKeys("LPS-241223-060348");
		Generate.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_ctl02_ctl05_linkReport']")).getText();
		String expected = "Download";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Laod Summary Report");

		Download.click();

	}

}
