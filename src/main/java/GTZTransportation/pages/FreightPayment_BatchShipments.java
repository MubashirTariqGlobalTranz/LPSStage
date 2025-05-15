package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_BatchShipments extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Batch Shipments']")
	WebElement batchShipments;

	@FindBy(xpath = "//input[@id='MainContentHolder_container_carrierSelection_txtCarrier']")
	WebElement Carrier;

	@FindBy(xpath = "//input[@id='MainContentHolder_container_btnFilter']")
	WebElement Filter;

	@FindBy(xpath = "//tbody/tr[2]/td[16]/a[1]")
	WebElement Details;

	@FindBy(xpath = "//a[@id='MainContentHolder_back']")
	WebElement Back;

	@FindBy(xpath = "//a[@id='MainContentHolder_container_grid_ctl00_0']")
	WebElement ShipmentDetail;

	// Initialization
	public FreightPayment_BatchShipments() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on
	// NextTab
	public void BatchShipmentGTZ() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Batch Shipments']")).click();

	}

	// This will open users
	public void Batchshipments() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Carrier.sendKeys("XPO LTL (1469)");
		Filter.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Details.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Shipment Details']")).getText();
		String expected = "Shipment Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify BatchShipment FreightPayment");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Back.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ShipmentDetail.click();

	}

}
