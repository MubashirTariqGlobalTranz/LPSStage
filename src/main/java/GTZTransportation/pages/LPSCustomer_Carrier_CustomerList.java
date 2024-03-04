package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPSCustomer_Carrier_CustomerList extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Client Admin']")
	WebElement ClientAdmin;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_txtCustomerName")
	WebElement SearchCustomer;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_btnSearch")
	WebElement SearchClick;

	@FindBy(id = "ctl00_MainContentHolder_container_grid_ctl02_linkDetails")
	WebElement CustomerID;

	@FindBy(id = "ctl00_MainContentHolder_container_btnSave")
	WebElement Save;

	@FindBy(id = "ctl00_MainContentHolder_container_grid_ctl02_linkContacts")
	WebElement Contacts;

	@FindBy(xpath = "//a[@id='ctl00_MainContentHolder_container_grid_ctl02_linkLocations']")
	WebElement LocationLink;

	@FindBy(id = "ctl00_MainContentHolder_linkLocationAccounts")
	WebElement LocationAccount;

	@FindBy(xpath = "//a[@id='ctl00_MainContentHolder_container_grid_ctl02_linkSavings']")
	WebElement Saving;

	@FindBy(xpath = "//a[@id='ctl00_TopHeader_linkCustomerListCryptoHeader']")
	WebElement heading;

	@FindBy(xpath = "//a[@id='ctl00_MainContentHolder_container_grid_ctl02_linkRates']")
	WebElement Rates;

	@FindBy(xpath = "//a[normalize-space()='Insurance Rates']")
	WebElement Insurance;

	@FindBy(xpath = "//a[@id='ctl00_MainContentHolder_container_grid_ctl02_linkAccountManagers']")
	WebElement Managers;

	// Initialization
	public LPSCustomer_Carrier_CustomerList() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void clientAdminGTZ() {
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

	}

	// This will open users
	public void clientAdminUser() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchCustomer.sendKeys("Airways Freight Corporation");
		SearchClick.click();

		captureScreenShot(driver, "Verify Customer in customer list");

	}

	public void Contacts() {
		Contacts.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer Contacts");
		driver.navigate().back();
	}

	public void Location() {
		LocationLink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer Location");
		driver.navigate().back();
	}

	public void Savings() {

		Saving.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer savings");
		driver.navigate().back();
	}

	public void Rates() {
		Rates.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer Rates");
		driver.navigate().back();
	}

	public void Insurance() {
		Insurance.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer Insurance");
		driver.navigate().back();
	}

	public void Managers() {

		Managers.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Customer managers");
		driver.navigate().back();
	}

	public void CustomerDetails() {
		CustomerID.click();
		captureScreenShot(driver, "Verify Customer details");
		Save.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
	

	}

}
