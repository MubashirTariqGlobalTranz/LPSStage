package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_CarrierPortalRemittance extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Carrier Portal']")
	WebElement CarrierPortal;

	@FindBy(xpath = "//a[@id='MainContentHolder_linkRemittance']")
	WebElement RemittanceInfo;

	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_carrierSelection_txtCarrier']")
	WebElement Carrier;

	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_btnFilter']")
	WebElement Filter;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[4]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/a[1]")
	WebElement ViewShipments;

	

	// Initialization
	public FreightPayment_CarrierPortalRemittance() {
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
	public void Remittance_Info() {
		RemittanceInfo.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Carrier.sendKeys("AAA Cooper Transportation (1449)");
		Filter.click();
		// Assertion
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Deposits']")).getText();
		String expected = "Deposits";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ RemittanceInfo");

	}

	public void RemittanceInformationDetails() {
		ViewShipments.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Freight Payment_ Remittance InfoDetail");
	}

	
}
