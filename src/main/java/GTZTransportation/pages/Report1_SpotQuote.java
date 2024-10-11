package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class Report1_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_7")
	WebElement FixedLoad;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_16")
	WebElement CurrentLoadActivity;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_12")
	WebElement AwardHistory;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_17")
	WebElement LoadPastDue;

	@FindBy(id = "ContentPlaceHolder1_btnExecute")
	WebElement ExecuteButton;

	@FindBy(id = "ctl00_ContentPlaceHolder1_controlStartDate_txtDate")
	WebElement StartDate;

	@FindBy(id = "ctl00_ContentPlaceHolder1_controlEndDate_txtDate")
	WebElement EndDate;

	@FindBy(id = "ctl00_ContentPlaceHolder1_controlCustomerId_txtCustomer")
	WebElement Customer;

	// initialization
	public Report1_SpotQuote() {
		PageFactory.initElements(driver, this);
	}

	// This will open spot quote application
	public void openSpotQuote()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SpotQuote.click();

	}

	// This will click on load Board All & Filtered records
	public void Report_FixedLoad() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FixedLoad.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - FixedLoad");
	}

	public void Report_CurrentLoadActivity() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		CurrentLoadActivity.click();
		StartDate.clear();
		StartDate.sendKeys("10/3/2019");

		EndDate.clear();
		EndDate.sendKeys("10/11/2024");
		Customer.clear();
		Customer.sendKeys("Cameron's Coffee (10310)");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - CurrentLoadActivity");
	}

	public void Report_AwardHistory() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		AwardHistory.click();
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - Award History");
	}

	public void Report_LoadPastDue() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		LoadPastDue.click();
		Customer.clear();
		Customer.sendKeys("Cameron's Coffee (10310)");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - LoadPastDue");
	}

}
