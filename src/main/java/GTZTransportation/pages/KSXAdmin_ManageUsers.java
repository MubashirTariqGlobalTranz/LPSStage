package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageUsers extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
	WebElement FreightPayment;

	@FindBy(xpath = "//a[normalize-space()='Manage Users']")
	WebElement ManageUsers;

	@FindBy(id = "ctl00_MainContentHolder_SecondaryCustomerDropDown")
	WebElement clientUsers;

	@FindBy(id = "ctl00_MainContentHolder_SecondaryCustomerDropDown")
	WebElement All;

	@FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl02_UserNameHyperLink")
	WebElement ClientName;

	@FindBy(xpath = "//tbody/tr[2]/td[8]/a[1]")
	WebElement Edit;

	@FindBy(id = "ctl00_MainContentHolder_btnSave")
	WebElement SaveEdit;

	@FindBy(xpath = "//a[normalize-space()='SAV Users']")
	WebElement savUser;

	@FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl02_UserNameHyperLink")
	WebElement savName;

	@FindBy(xpath = "//a[normalize-space()='Admin Site Users']")
	WebElement adminsiteUser;

	@FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl07_UserNameCryptoHyperLink")
	WebElement adminsiteuserName;

	// Initialization
	public KSXAdmin_ManageUsers() {
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
		driver.findElement(By.xpath("//a[normalize-space()='Manage Users']")).click();
		captureScreenShot(driver, "Verify Manage Clients page");

	}

	// This will Open Client user & Save
	public void KSXAdminManageUsers_ClientsUser() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ManageUsers.click();
		clientUsers.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clientUsers.sendKeys(Keys.ARROW_DOWN);
		clientUsers.sendKeys(Keys.ENTER);

		captureScreenShot(driver, "Verify client Users page");

		ClientName.click();
		SaveEdit.click();
		String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
		String expected = "User saved successfully.";
		Assert.assertEquals(actual, expected);

	}

	// This will Open SAV user & Save
	public void KSXAdmin_ManageUsers_SAVUsers() {
		savUser.click();
		clientUsers.click();
		clientUsers.sendKeys(Keys.ARROW_DOWN);
		clientUsers.sendKeys(Keys.ENTER);

		captureScreenShot(driver, "Verify SAV page");
		savName.click();
		SaveEdit.click();
		String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
		String expected = "User saved successfully.";
		Assert.assertEquals(actual, expected);

	}

	// This will Open Admin user & Save
	public void KSXAdmin_ManageUsers_AdminSiteUser() {

		adminsiteUser.click();
		captureScreenShot(driver, "Verify Adminsite Users page");
		adminsiteuserName.click();
		SaveEdit.click();

	}

}
