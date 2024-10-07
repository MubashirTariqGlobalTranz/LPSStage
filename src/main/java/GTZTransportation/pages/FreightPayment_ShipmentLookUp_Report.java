package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_ShipmentLookUp_Report extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Report;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_7")
	WebElement ShipmentLookup;

	@FindBy(id = "ctl00_MainContentHolder_controlShipmentNumbers")
	WebElement ShipmentNo;

	@FindBy(id = "ctl00_MainContentHolder_controlInvoiceNumbers")
	WebElement InvoiceNumber;

	@FindBy(id = "MainContentHolder_btnExecute")
	WebElement Execute;

	@FindBy(id = "MainContentHolder_btnClear")
	WebElement Clear;

	// Initialization
	public FreightPayment_ShipmentLookUp_Report() {
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
	public void Report_ShipmentLookup() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Report.click();
		ShipmentLookup.click();

	}

	public void Lookup_ShipmentNo() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ShipmentNo.sendKeys("413157814");
		Execute.click();

		captureScreenShot(driver, "Verify Lookup-ShipmentNo");
		Clear.click();
	}

	public void LookUp_Invoice() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InvoiceNumber.sendKeys("4439084");
		Execute.click();

		captureScreenShot(driver, "Verify Lookup-InvoiceNo");
	}

}
