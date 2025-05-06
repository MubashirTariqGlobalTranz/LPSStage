package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_CodeShipments extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Code Shipments']")
	WebElement CodeShipments;

	// Initialization
	public FreightPayment_CodeShipments() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on
	// NextTab
	public void codeshipmentGTZ() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Code Shipments']")).click();

	}

	// This will open users
	public void CodeShipment() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Coding Queue']")).getText();
		String expected = "Shipment Coding Queue";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Code Shipment- FreightPayment");

	}

}
