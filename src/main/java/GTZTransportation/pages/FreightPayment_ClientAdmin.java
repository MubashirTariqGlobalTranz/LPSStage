package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_ClientAdmin extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Client Admin']")
	WebElement ClientAdmin;

	@FindBy(id = "MainContentHolder_ctl01_grid_linkName_0")
	WebElement FreightDataImport;

	@FindBy(id = "MainContentHolder_linkUsers")
	WebElement user;

	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_txtFilterUserID']")
	WebElement UserID;

	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_btnFilter']")
	WebElement ApplyFilter;

	@FindBy(id = "MainContentHolder_container_grid_linkResetPassword_0")
	WebElement RestEmail;

	// Initialization
	public FreightPayment_ClientAdmin() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void clientAdminGTZ() {
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
		driver.findElement(By.xpath("//span[normalize-space()='Client Admin']")).click();

	}

	// This will open users
	public void clientAdminUser() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.click();
		captureScreenShot(driver, "Verify Client Admin - FreightPayment");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserID.click();
		UserID.sendKeys("mubashir.tariq@globaltranz.com");
		ApplyFilter.click();

	}

// it will send reset email link
	public void resetEmail() {
		RestEmail.click();
		driver.switchTo().alert().accept();

		captureScreenShot(driver, "Verify email confirmation");
	}

}
