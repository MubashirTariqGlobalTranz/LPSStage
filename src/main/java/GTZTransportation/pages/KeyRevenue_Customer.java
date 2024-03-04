package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Customer extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//span[normalize-space()='Customer']")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_linkInvoiceHistory")
	WebElement InvoiceHistory;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer")
	WebElement CustomerSearch;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
	WebElement Filter;

	@FindBy(id = "ContentPlaceHolder1_container_grid_linkInvoiceDetails_0")
	WebElement InvoiceDetails;

	@FindBy(id = "ContentPlaceHolder1_linkSuymmaryInvoiceHistory")
	WebElement StatmentHistory;

	@FindBy(id = "ContentPlaceHolder1_linkPaymentHistory")
	WebElement PaymentHistory;

	@FindBy(xpath = "//a[@id='modalPopuped368378707e45fc8dff599ad2f0d8ab']")
	WebElement View;

	// Initialization
	public KeyRevenue_Customer() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Customer']")).click();

	}

	// This will click on Report & open report
	public void InvoiceHistory() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InvoiceHistory.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomerSearch.sendKeys("Dakota Supply Group (2185)");
		Filter.click();

		captureScreenShot(driver, "Verify Invoice History");
		InvoiceDetails.click();
		captureScreenShot(driver, "Verify Invoice History Details");
	}

	public void StatementHistory() {
		Customer.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StatmentHistory.click();
		captureScreenShot(driver, "Verify Statement History");

	}

	public void PaymentHistory() {
		Customer.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentHistory.click();
		CustomerSearch.sendKeys("Dakota Supply Group");
		Filter.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		captureScreenShot(driver, "Verify Payment History");

	}

}