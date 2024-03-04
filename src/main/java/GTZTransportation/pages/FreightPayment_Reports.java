package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_Reports extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_0")
	WebElement FreightDataImport;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_1")
	WebElement FreightDataDetails;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_3")
	WebElement LineItemCodes;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_10")
	WebElement CarrierShipmentSummary;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_13")
	WebElement FeeCheck;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_15")
	WebElement ZipList;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_20")
	WebElement LoadMasterOrder;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_21")
	WebElement PayableHistory;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_23")
	WebElement AccessorialCodes;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_10")
	WebElement EricssonGLCodes;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_14")
	WebElement CarrierSummaryTransfer;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_15")
	WebElement ManualTransferDetails;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_16")
	WebElement ManualTransferSummary;

	@FindBy(xpath = "//a[normalize-space()='Next']")
	WebElement Next;

	@FindBy(id = "MainContentHolder_btnExecute")
	WebElement ExecuteButton;

	// Initialization
	public FreightPayment_Reports() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void AccountPayableGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();

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

	}

	// This will click on Report & open report
	public void Report_FreightDataImport() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FreightDataImport.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - FreightDataImport");
	}

	
	public void Report_FreightDataDetails() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FreightDataDetails.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - FreightDataDetails");
	}


	public void Report_LineItemCodes() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		LineItemCodes.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - LineItemCodes");
	}

	public void Report_CarrierShipmentSummary() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		CarrierShipmentSummary.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - CarrierShipmentSummary");
	}

	public void Report_FeeCheck() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FeeCheck.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - FeeCheck");
	}

	public void Report_ZipList() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		ZipList.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ZipList");
	}

	public void Report_LoadMasterOrder() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		LoadMasterOrder.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - LoadMasterOrder");
	}

	public void Report_PayableHistory() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		PayableHistory.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - PayableHistory");
	}

	public void Report_AccessorialCodes() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		AccessorialCodes.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - AccessorialCodes");
	}

	public void Report_EricssonGLCodes() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		EricssonGLCodes.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - EricssonGLCodes");
	}

	public void Report_CarrierSummaryTransfer() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		CarrierSummaryTransfer.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - CarrierSummaryTransfer");
	}

	public void Report_ManualTransferDetails() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		ManualTransferDetails.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ManualTransferDetails");
	}

	public void Report_ManualTransferSummary() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		ManualTransferSummary.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ManualTransferSummary");
	}
}
