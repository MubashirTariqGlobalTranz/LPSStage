package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Reports extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_0")
	WebElement KeyPaymentInvoices;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_1")
	WebElement AccountsReceivableAging;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_3")
	WebElement ResourceRequest;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_17")
	WebElement MarketingPartners;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_18")
	WebElement KSXMPListing;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_19")
	WebElement InvoiceHistory;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_20")
	WebElement PastDueInvoices;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_21")
	WebElement AutoLinkDetail;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_23")
	WebElement VarianceSummaryByCarrier;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_31")
	WebElement Customers;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_grid_linkName_34']")
	WebElement PendingBillables;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_37")
	WebElement PendingJobs;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_38")
	WebElement LoadAuditSummary;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_44")
	WebElement LoadAuditErrorRollup;

	@FindBy(xpath = "//a[normalize-space()='Next']")
	WebElement Next;

	@FindBy(id = "ContentPlaceHolder1_containerParameters_btnExecute")
	WebElement ExecuteButton;

	@FindBy(xpath = "//input[@value='25']")
	WebElement Input;

	@FindBy(xpath = "//td[normalize-space()='Page size:']")
	WebElement Inputclick;

	// Initialization
	public KeyRevenue_Reports() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void keyRevenueGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KeyRevenue']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
		Input.clear();
		Input.sendKeys("50");
		Inputclick.click();
	}

	// This will click on Report & open report
	public void Report_KeyPaymentInvoices() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		KeyPaymentInvoices.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - KeyPaymentInvoices");
	}

	public void Report_ResourceRequest() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		ResourceRequest.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ResourceRequest");
	}

	public void Report_MarketingPartners() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		MarketingPartners.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - MarketingPartners");
	}

	public void Report_KSXMPListing() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		KSXMPListing.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - KSXMPListing");
	}

	public void Report_InvoiceHistory() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		InvoiceHistory.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - InvoiceHistory");
	}

	public void Report_PastDueInvoices() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		PastDueInvoices.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - PastDueInvoices");
	}

	public void Report_AutoLinkDetail() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		AutoLinkDetail.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - AutoLinkDetail");
	}

	public void Report_VarianceSummaryByCarrier() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		VarianceSummaryByCarrier.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - VarianceSummaryByCarrier");
	}

	public void Report_Customers() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Customers.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - Customers");
	}

	public void Report_PendingBillables() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		PendingBillables.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - PendingBillables");
	}

	public void Report_PendingJobs() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();

		PendingJobs.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - PendingJobs");
	}

	public void Report_LoadAuditSummary() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();

		LoadAuditSummary.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - LoadAuditSummary");
	}

	public void Report_LoadAuditErrorRollup() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();

		LoadAuditErrorRollup.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - LoadAuditErrorRollup");
	}
}
