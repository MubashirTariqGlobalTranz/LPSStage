package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageClient extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
	WebElement FreightPayment;

	@FindBy(id = "ctl00_MainContentHolder_GridViewSecondaryCustomers_ctl02_ClientNameCryptoHyperLink")
	WebElement ClientName;

	@FindBy(xpath = "//tbody/tr[2]/td[8]/a[1]")
	WebElement Edit;

	@FindBy(id = "ctl00_MainContentHolder_btnSave")
	WebElement SaveEdit;

	// Initialization
	public KSXAdmin_ManageClient() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void KSXAdminTab() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KSX Admin']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//a[normalize-space()='Manage Clients']")).click();
		captureScreenShot(driver, "Verify Manage Clients page");

	}

	// This will Open Account Payable application and search on basis of Carrier
	public void KSXAdminManageClient() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClientName.click();
		captureScreenShot(driver, "Verify client details page");

	}

	public void KSXAdmin_ManageclientEdit() {
		driver.navigate().back();
		Edit.click();
		captureScreenShot(driver, "Verify client Edit page");
		driver.navigate().back();

	}

}
