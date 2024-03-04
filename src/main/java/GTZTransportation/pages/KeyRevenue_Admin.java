package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Admin extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkAccounts")
	WebElement Accounts;

	@FindBy(id = "ContentPlaceHolder1_linkSystemUsers")
	WebElement SystemUsers;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtFirstName")
	WebElement FirstName;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "//tbody/tr[2]/td[6]/a[1]")
	WebElement ViewDetails;

	@FindBy(id = "ContentPlaceHolder1_container_btnSave")
	WebElement Save;

	@FindBy(id = "ContentPlaceHolder1_linkCustomerConfig")
	WebElement CustomerConfig;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer")
	WebElement CustomerSearch;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement FilterButton;

	@FindBy(id = "ContentPlaceHolder1_container_grid_linkDefault_0")
	WebElement EditDefaults;

	@FindBy(id = "ContentPlaceHolder1_container_btnSave")
	WebElement SaveButton;

	@FindBy(id = "ContentPlaceHolder1_linkPaymentTerms")
	WebElement PaymentTerm;

	@FindBy(id = "ContentPlaceHolder1_linkLineItemUpdate")
	WebElement LineItemBulk;

	@FindBy(id = "ContentPlaceHolder1_linkGLCodes")
	WebElement GLCodes;

	// Initialization
	public KeyRevenue_Admin() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void keyRevenueGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KeyRevenue']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();

	}

	// This will click on Report & open report
	public void Admin_Accounts() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Accounts.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		captureScreenShot(driver, "Verify Accounts - Key Revenue");

	}

	public void Admin_SystemUsers() {
		Admin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SystemUsers.click();
		FirstName.sendKeys("Test");
		Filter.click();
		captureScreenShot(driver, "Verify SystemUsers");
		ViewDetails.click();
		Save.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//p[@class='margin-bottom-5px']")).getText();
		String expected = "System User successfully updated";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify System user save successfully");

	}

	public void Admin_CustomerConfig() {
		Admin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerConfig.click();
		CustomerSearch.sendKeys("Test");
		FilterButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		captureScreenShot(driver, "Verify Customer Config");
		EditDefaults.click();
		SaveButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//p[@class='margin-bottom-5px']")).getText();
		String expected = "Save Successful";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Customer config save successfully");
	}

	public void Admin_PaymentTerm() {
		Admin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentTerm.click();
		captureScreenShot(driver, "Verify Payment Term -Key Revenue");
	}

	public void Admin_LineItemBulk() {
		Admin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LineItemBulk.click();
		captureScreenShot(driver, "Verify LineItemBulk -Key Revenue");
	}

	public void Admin_GLCodes() {
		Admin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GLCodes.click();
		captureScreenShot(driver, "Verify GLCodes -Key Revenue");
	}
}