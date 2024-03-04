package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPSCustomer_Carrier_CarrierImport extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Client Admin']")
	WebElement ClientAdmin;

	@FindBy(xpath = "//a[@id='ctl00_TopHeader_linkCarrierListCryptoHeader']")
	WebElement Carrier;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[5]/span[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	WebElement CompanyName;

	// Initialization
	public LPSCustomer_Carrier_CarrierImport() {
		PageFactory.initElements(driver, this);
	}

	// Tab
	public void CarrierGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='Customer/Carrier']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		WebElement customersMenuItem = driver.findElement(By.id("tab3"));

		// Hover over the "Customers" menu item to make the sub-menu visible
		// This is necessary as the "Prospect Queue" link is in a sub-menu
		org.openqa.selenium.interactions.Actions builder = new org.openqa.selenium.interactions.Actions(driver);
		builder.moveToElement(customersMenuItem).build().perform();

		// Find and click the "Prospect Queue" link
		WebElement CarrierImport = driver.findElement(By.id("ctl00_TopHeader_linkCarrierImport"));
		CarrierImport.click();

	}

	// This will open users
	public void CarrierImport() {

		captureScreenShot(driver, "Verify Carrier Import");

	}

	public void ImportDetails() {
		CompanyName.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Carrier ImportDetails");
	}

}
