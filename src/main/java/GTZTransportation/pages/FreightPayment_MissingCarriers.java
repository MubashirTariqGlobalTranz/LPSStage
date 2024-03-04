package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_MissingCarriers extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[7]/a")
	WebElement GTZ;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div/div[2]/table/tbody/tr[4]/td[2]/a")
	WebElement MissingCarriers;

	@FindBy(id = "MainContentHolder_containerFilter_customerSmartSearch_txtCustomer")
	WebElement CustomerSearch;

	@FindBy(id = "MainContentHolder_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "//*[text()='Details']")
	WebElement Details;

	@FindBy(id = "MainContentHolder_back")
	WebElement Back;

	// Initialization
	public FreightPayment_MissingCarriers() {
		PageFactory.initElements(driver, this);
	}

	// This will open FreightPayment Application & Handle browser to select on Next
	// Tab
	public void FreightPaymentGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='Pay Bills']"))
				.click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/ul/li[7]/a")).click();

	}

	// This will Open Missing carrier application and search customer
	public void MissingCarriers() {
		GTZ.click();
		MissingCarriers.click();
		CustomerSearch.sendKeys("Armacell LLC");
		// *CompanyName.sendKeys("Test Name");
		// Address.sendKeys("Test Address");
		Filter.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Details.click();
		Back.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
