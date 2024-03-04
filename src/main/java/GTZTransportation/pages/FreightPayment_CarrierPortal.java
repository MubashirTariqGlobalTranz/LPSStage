package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_CarrierPortal extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Carrier Portal']")
	WebElement CarrierPortal;

	@FindBy(xpath = "//a[@id='MainContentHolder_linkSearch']")
	WebElement InvoiceSearch;

	@FindBy(xpath = "//input[@id='MainContentHolder_btnSearch']")
	WebElement SearchButton;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")
	WebElement ShipmentNo;

	@FindBy(xpath = "//a[@id='MainContentHolder_linkRemittance']")
	WebElement Remittance;

	@FindBy(xpath = "//span[normalize-space()='Code Shipments']")
	WebElement CodeShipments;
	@FindBy(xpath = "//span[normalize-space()='Review Shipments']")
	WebElement ReviewShipments;

	@FindBy(xpath = "//span[normalize-space()='Batch Shipments']")
	WebElement batchShipments;

	@FindBy(xpath = "//span[normalize-space()='Batch Approval']")
	WebElement BatchApproval;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	WebElement BatchDetails;

	@FindBy(xpath = "//span[normalize-space()='Confirm Payment']")
	WebElement ConfirmPayment;

	// Initialization
	public FreightPayment_CarrierPortal() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void CarrierPortal() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Carrier Portal']")).click();

	}

	// This will Open Account Payable application and search on basis of Carrier
	public void Invoice_Search() {
		InvoiceSearch.click();
		captureScreenShot(driver, "Verify Freight Payment_ Invoice Search");
		SearchButton.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ShipmentNo.click();
		// Assertion
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Details']")).getText();
		String expected = "Shipment Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Shipment Details_invoice search");

	}

	public void RemittanceInformation() {
		CarrierPortal.click();
		Remittance.click();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Remittance Information']")).getText();
		String expected = "Remittance Information";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Remittance Information");
	}

	public void CodeShipments() {
		CodeShipments.click();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Coding Queue']")).getText();
		String expected = "Shipment Coding Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Shipment Coding Queue");

	}

	public void ReviewShipments() {
		ReviewShipments.click();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Review Queue']")).getText();
		String expected = "Shipment Review Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Shipment Review Queue");

	}

	public void BatchShipments() {
		batchShipments.click();
		BatchApproval.click();
		BatchDetails.click();
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Batch Details']")).getText();
		String expected = "Batch Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Batch Details");

	}

	public void ConfirmPayment() {
		ConfirmPayment.click();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Payment Confirmation Queue']")).getText();
		String expected = "Payment Confirmation Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Payment Confirmation Queue");

	}

}
