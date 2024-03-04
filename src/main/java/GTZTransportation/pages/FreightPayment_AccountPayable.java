package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_AccountPayable extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[7]/a")
	WebElement GTZ;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div/div[4]/table/tbody/tr[1]/td/a")
	WebElement AccountPayable;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div[2]/div[2]/div/div[2]/div/div[1]/table/tbody/tr[4]/td/label/input")
	WebElement UnAssigned;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div/div[2]/button[1]")
	WebElement Filter;

	@FindBy(xpath = "//*[text()='Apply']")
	WebElement Details;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button")
	WebElement Save;
	@FindBy(xpath = "//*[text()=' Back to Queue']")
	WebElement Back;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div[2]/div[2]/div/div[2]/div/div[2]/table/tbody/tr[3]/td/input")
	WebElement CarrierSearch;

	// Initialization
	public FreightPayment_AccountPayable() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void AccountPayableGTZ() {
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

	// This will Open Account Payable application and search on basis of Carrier
	public void AccountPayableSearch() {
		GTZ.click();
		AccountPayable.click();
		//UnAssigned.click();
		Filter.click();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Details.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Back.click();
		//UnAssigned.click();
		Filter.click();
		//Save.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CarrierSearch.sendKeys("SEKO Worldwide");
		Filter.click();
	}

}
