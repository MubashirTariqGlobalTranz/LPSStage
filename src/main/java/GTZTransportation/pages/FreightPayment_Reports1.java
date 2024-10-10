package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_Reports1 extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_4")
	WebElement FreightDataBatches;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_5")
	WebElement FreightDataSearch;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_11")
	WebElement AllowedCarriers;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_12")
	WebElement KeyQuoteCarrierCheck;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_16")
	WebElement ValueMap;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_18")
	WebElement BatchSummary;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_1")
	WebElement AccountingContacts;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_11")
	WebElement ShipmentAdvanceDetails;


	@FindBy(xpath = "//a[normalize-space()='Next']")
	WebElement Next;

	@FindBy(id = "MainContentHolder_btnExecute")
	WebElement ExecuteButton;
	
	@FindBy(id = "MainContentHolder_btnExecute")
	WebElement Refresh;
	
	@FindBy(id = "ctl00_MainContentHolder_controlShipmentNumber")
	WebElement ShipmentNo;
	
	@FindBy(id = "ctl00_MainContentHolder_controlCarrierId")
	WebElement Carrier;

	@FindBy(id = "ctl00_MainContentHolder_controlBatches")
	WebElement Batches;
	
	@FindBy(id = "ctl00_MainContentHolder_controlCustomerId_txtCustomer")
	WebElement Customer;
	
	@FindBy(id = "ctl00_MainContentHolder_controlBatchNumber")
	WebElement BatchNo;

	// Initialization
	public FreightPayment_Reports1() {
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
	public void Report_FreightDataBatches() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FreightDataBatches.click();
		Refresh.click();

		captureScreenShot(driver, "Verify Report - FreightDataBatches");
	}

	
	public void Report_FreightDataSearch() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		FreightDataSearch.click();
		ShipmentNo.sendKeys("186457154");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - FreightDataSearch");
	}


	public void Report_AllowedCarriers() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		AllowedCarriers.click();
		Refresh.click();

		captureScreenShot(driver, "Verify Report - AllowedCarriers");
	}

	public void Report_KeyQuoteCarrierCheck() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		KeyQuoteCarrierCheck.click();
		Carrier.sendKeys("1076");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - KeyQuoteCarrierCheck");
	}

	public void Report_ValueMap() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		ValueMap.click();
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ValueMap");
	}

	public void Report_BatchSummary() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		BatchSummary.click();
		Batches.sendKeys("201481");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - BatchSummary");
	}

	

	public void Report_AccountingContacts() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		AccountingContacts.click();
		Customer.sendKeys("NOKIA (10663)");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - AccountingContacts");
	}

	public void Report_ShipmentAdvanceDetails() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		Next.click();
		ShipmentAdvanceDetails.click();
		BatchNo.sendKeys("201481");
		ExecuteButton.click();

		captureScreenShot(driver, "Verify Report - ShipmentAdvanceDetailsr");
	}

	
}
