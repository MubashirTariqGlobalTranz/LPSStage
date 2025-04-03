package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Invoice extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//*[text()='Invoice']")
	WebElement Invoice;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_drDateRange_ctl03_txtDate")
	WebElement DateRange;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_linkAdd']")
	WebElement CreateInvoice;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_smartCustomer_txtCustomer']")
	WebElement CustomerName;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/th[1]")
	WebElement Customer;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtAddress1']")
	WebElement Address;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtCity']")
	WebElement City;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtState']")
	WebElement State;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtPostalCode']")
	WebElement PostalCode;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_btnSave']")
	WebElement Save;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtInvoiceId']")
	WebElement InvoiceNo;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	WebElement InvoiceDetails;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_btnSend']")
	WebElement SendInvoice;

	@FindBy(id = "ContentPlaceHolder1_containerDetails_BtnCancel")
	WebElement CancelInvoice;

	// Initialization
	public KeyRevenue_Invoice() {
		PageFactory.initElements(driver, this);
	}

	// This will open Key Revenue Application & Handle browser to select on Next
	
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
		driver.findElement(By.xpath("//span[normalize-space()='Invoice']")).click();

	}

	// This will create an invoice
	public void Create_Invoice() {

		CreateInvoice.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomerName.sendKeys("Test Account (1590)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Customer.click();
		Address.sendKeys("Test");
		City.sendKeys("Test");
		State.sendKeys("US");
		PostalCode.sendKeys("3306");
		Save.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// search Invoice
	public void Search_Invoice() {
		WebElement L = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/h2[1]"));
		String st = L.getText();
		System.out.println(st);
		Invoice.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InvoiceNo.sendKeys(st);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.ARROW_LEFT);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		InvoiceNo.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
	}

// Send Invoice
	public void Send_Invoice() {
		InvoiceDetails.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SendInvoice.click();
		driver.switchTo().alert().accept();
		captureScreenShot(driver, "Verify Invoice Send ");
	}

//cancel Invoice
	public void Cancel_Invoice() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CancelInvoice.click();
		driver.switchTo().alert().accept();
		captureScreenShot(driver, "Verify Invoice Cancelled");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}