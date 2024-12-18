package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_All_Reports extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Reports;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl00_txtName']")
	WebElement SearchReport;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ctl00_btnFilter']")
	WebElement Filter;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_0']")
	WebElement KeyPaymentInvoices;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_3']")
	WebElement ResourceRequest;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_10']")
	WebElement UserResourceRequest;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_22']")
	WebElement KSXSiteActivityReport;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_4']")
	WebElement ApplicationErrorsReport;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_20']")
	WebElement TrackableCountsReport;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnExecute']")
	WebElement Execute;

	// Initialization
	public LPS_Dashboard_All_Reports() {
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

	public void KeyPaymentInvoicesReport() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KeyPaymentInvoices.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify KeyPaymentInvoices Report");
	}
	
	public void ResourceRequestReport() {
		Reports.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResourceRequest.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify ResourceRequest Report");
	}
	
	
	public void UserResourceRequestReport() {
		Reports.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserResourceRequest.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify UserResourceRequest Report");
	}
	
	public void KSXSiteActivityReport() {
		Reports.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KSXSiteActivityReport.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify KSXSiteActivityReport Report");
	}
	
	public void ApplicationErrorsReport() {
		Reports.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationErrorsReport.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify ApplicationErrorsReport Report");
	}
	
	public void TrackableCountsReport() {
		Reports.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrackableCountsReport.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Execute.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify TrackableCountsReport Report");
	}

}
