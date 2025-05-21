package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_ReviewShipments extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Review Shipments']")
	WebElement batchShipments;

	@FindBy(xpath = "//a[@id='MainContentHolder_container_grid_ctl00_0']")
	WebElement Shipmentno;

	@FindBy(xpath = "//a[@id='MainContentHolder_back']")
	WebElement Back;

	@FindBy(xpath = "//a[normalize-space()='View Details']")
	WebElement ViewDetails;

	// Initialization
	public FreightPayment_ReviewShipments() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on
	// NextTab
	public void ReviewShipmentGTZ() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Review Shipments']")).click();

	}

	// This will open users
	public void Reviewshipments() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Shipmentno.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Back.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ViewDetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Details']")).getText();
		String expected = "Shipment Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify ReviewShipment FreightPayment");

	}

}
