package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPSCustomer_Carrier_CarrierList extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Client Admin']")
	WebElement ClientAdmin;

	@FindBy(xpath = "//a[@id='ctl00_TopHeader_linkCarrierListCryptoHeader']")
	WebElement Carrier;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_txtCarrierName")
	WebElement SearchCarrier;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_carrierMcNumber")
	WebElement McNumber;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_btnSearch")
	WebElement SearchButton;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_btnClear")
	WebElement ClearAll;

	@FindBy(id = "ctl00_MainContentHolder_container_grid_ctl02_linkDetails")
	WebElement CarrierId;

	@FindBy(id = "ctl00_MainContentHolder_container_btnSave")
	WebElement Save;

	@FindBy(id = "ctl00_MainContentHolder_linkRepresentatives")
	WebElement Representatives;

	@FindBy(id = "ctl00_MainContentHolder_linkModes")
	WebElement Modes;

	@FindBy(id = "ctl00_MainContentHolder_linkModeServiceLevels")
	WebElement ModeServiceLevels;

	@FindBy(id = "ctl00_MainContentHolder_linkBanks")
	WebElement Banks;

	// Initialization
	public LPSCustomer_Carrier_CarrierList() {
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

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//a[@id='ctl00_TopHeader_linkCustomerListCryptoHeader']")).click();
		Carrier.click();
	}

	// This will open users
	public void CarrierList() {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify CarrierList");

	}

	public void Search() {
		SearchCarrier.sendKeys("Test");
		SearchButton.click();

		captureScreenShot(driver, "Verify Carrier Search");
	}

	public void CarrierDetails() {

		CarrierId.click();
		Save.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Carrier Info Save");

	}

	public void CarrierDetailsLinks() {

		Representatives.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Representatives");
		driver.navigate().back();

		Modes.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Modes");
		driver.navigate().back();

		ModeServiceLevels.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify ModeServiceLevels");
		driver.navigate().back();

		Banks.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Banks");
		driver.navigate().back();
	}

}
