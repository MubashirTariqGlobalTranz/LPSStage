package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue1_Reports extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_1")
	WebElement AccountsReceivableAging;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_12")
	WebElement BillableDeliveryReceipts;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_27")
	WebElement BillableSearch;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_28")
	WebElement BillingRules;

	@FindBy(id = "ContentPlaceHolder1_ctl01_grid_linkName_41")
	WebElement LoadAuditInvoiceErrors;

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

	@FindBy(id = "ctl00_ContentPlaceHolder1_containerParameters_controlCustomerId_txtCustomer")
	WebElement Customer;

	@FindBy(xpath = "//a[normalize-space()='Next']")
	WebElement Next;

	@FindBy(id = "ContentPlaceHolder1_containerParameters_btnExecute")
	WebElement ExecuteButton;

	@FindBy(xpath = "//input[@value='25']")
	WebElement Input;

	@FindBy(xpath = "//td[normalize-space()='Page size:']")
	WebElement Inputclick;

	// Initialization
	public KeyRevenue1_Reports() {
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
	public void Report_AccountsReceivableAging() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		AccountsReceivableAging.click();
		Customer.clear();
		Customer.sendKeys("NOKIA (10663)");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - AccountsReceivableAging");
	}

	public void Report_BillableDeliveryReceipts() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		BillableDeliveryReceipts.click();
		Customer.clear();
		Customer.sendKeys("NOKIA (10663)");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - BillableDeliveryReceipts");
	}

	public void Report_BillableSearch() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		BillableSearch.click();
		Customer.clear();
		Customer.sendKeys("NOKIA (10663)");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - BillableSearch");
	}

	public void Report_BillingRules() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		BillingRules.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - BillingRules");
	}

	public void Report_LoadAuditInvoiceErrors() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		LoadAuditInvoiceErrors.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - LoadAuditInvoiceErrors");
	}

}
