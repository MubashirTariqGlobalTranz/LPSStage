package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_Reports extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Reports;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl00_txtName']")
	WebElement SearchReport;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl00_btnFilter']")
	WebElement Filter;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_0']")
	WebElement ApplicationErrorReport;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_containerFilter_controlStartDate_txtDate']")
	WebElement StartDate;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnExecute']")
	WebElement Execute;

	// Initialization
	public LPS_Dashboard_Reports() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management
	public void Report()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Reports.click();

	}

	public void SearchReport() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchReport.sendKeys("Application Error Detail");
		Filter.click();
		ApplicationErrorReport.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StartDate.sendKeys("11/1/2024");
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Application Error Report");
	}

}
