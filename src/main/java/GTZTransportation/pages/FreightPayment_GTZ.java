package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_GTZ extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='GTZ']")
	WebElement GTZ;

	@FindBy(xpath = "//a[normalize-space()='Import Queue']")
	WebElement ImportQueue;

	@FindBy(xpath = "//a[@id='MainContentHolder_container_grid_linkDetails_0']")
	WebElement ImportQueueEdit;

	@FindBy(xpath = "//a[normalize-space()='Duplicates']")
	WebElement Duplicates;

	@FindBy(xpath = "//a[normalize-space()='Missing Customer']")
	WebElement MissingCustomer;

	@FindBy(xpath = "//a[normalize-space()='Payment Verification']")
	WebElement PaymentVerification;

	@FindBy(xpath = "//a[normalize-space()='Shipment Verification']")
	WebElement ShipmentVerification;

	@FindBy(xpath = "//a[normalize-space()='Audit']")
	WebElement Audit;

	// Initialization
	public FreightPayment_GTZ() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void GTZ() {
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
		driver.findElement(By.xpath("//span[normalize-space()='GTZ']")).click();

	}

	// This will Open import
	public void ImportQueue() {
		ImportQueue.click();
		captureScreenShot(driver, "Verify Freight Payment_ ImportQueue");
		ImportQueueEdit.click();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Import Queue Details']")).getText();
		String expected = "Import Queue Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Import Queue Details");

	}

	public void Duplicates() {
		GTZ.click();
		Duplicates.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Duplicate Shipments']")).getText();
		String expected = "Duplicate Shipments";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Duplicate Shipments");

	}

	public void MissingCustomer() {
		GTZ.click();
		MissingCustomer.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Missing Customer Info']")).getText();
		String expected = "Missing Customer Info";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Missing Customer Info");

	}

	public void Audit() {
		GTZ.click();
		Audit.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Audit Queue']")).getText();
		String expected = "Audit Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Audit Queue");

	}

	public void ShipmentVerification() {
		GTZ.click();
		ShipmentVerification.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Verification']")).getText();
		String expected = "Shipment Verification";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Shipment Verification");

	}

	public void PaymentVerification() {
		GTZ.click();
		PaymentVerification.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Payment Verification Queue']")).getText();
		String expected = "Payment Verification Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Payment Verification Queue");

	}
}
