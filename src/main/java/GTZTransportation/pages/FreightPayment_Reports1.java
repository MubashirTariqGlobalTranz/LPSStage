package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class FreightPayment_Reports1 extends BaseClass {

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

	private void waitFor(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void AccountPayableGTZ() {
		String currentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).click();
	}

	public void Report_FreightDataBatches() {
		waitFor(3000);
		Report.click();
		FreightDataBatches.click();
		Refresh.click();
		captureScreenShot(driver, "Verify Report - FreightDataBatches");
	}

	public void Report_FreightDataSearch() {
		waitFor(3000);
		Report.click();
		FreightDataSearch.click();
		ShipmentNo.sendKeys("186457154");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - FreightDataSearch");
	}

	public void Report_AllowedCarriers() {
		waitFor(3000);
		Report.click();
		AllowedCarriers.click();
		Refresh.click();
		captureScreenShot(driver, "Verify Report - AllowedCarriers");
	}

	public void Report_KeyQuoteCarrierCheck() {
		waitFor(3000);
		Report.click();
		KeyQuoteCarrierCheck.click();
		Carrier.sendKeys("1076");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - KeyQuoteCarrierCheck");
	}

	public void Report_ValueMap() {
		waitFor(3000);
		Report.click();
		ValueMap.click();
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - ValueMap");
	}

	public void Report_BatchSummary() {
		waitFor(3000);
		Report.click();
		BatchSummary.click();
		Batches.sendKeys("201481");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - BatchSummary");
	}

	public void Report_AccountingContacts() {
		waitFor(3000);
		Report.click();
		Next.click();
		waitFor(3000);
		AccountingContacts.click();
		Customer.sendKeys("NOKIA (10663)");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - AccountingContacts");
	}

	public void Report_ShipmentAdvanceDetails() {
		waitFor(3000);
		Report.click();
		Next.click();
		waitFor(3000);
		ShipmentAdvanceDetails.click();
		BatchNo.sendKeys("201481");
		ExecuteButton.click();
		captureScreenShot(driver, "Verify Report - ShipmentAdvanceDetails");
	}
}
