package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class Report_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_0")
	WebElement LinkedLoads;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_5")
	WebElement CarrierList;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_6")
	WebElement CarrierGroups;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_12")
	WebElement AwardHistory;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_18")
	WebElement EdiFileTrackingList;

	@FindBy(id = "ContentPlaceHolder1_btnExecute")
	WebElement ExecuteButton;

	// initialization
	public Report_SpotQuote() {
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
	public void Report_LinkedLoad() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		LinkedLoads.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - Linked Loads");
	}

	public void Report_CarrierList() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		CarrierList.click();
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - CarrierList");
	}

	public void Report_CarrierGroup() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		CarrierGroups.click();
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - Carrier Group");
	}

	public void Report_AwardLoad() {

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

	public void Report_EdiFileTrackingList() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		EdiFileTrackingList.click();
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - EDI Tracking List");
	}

}
