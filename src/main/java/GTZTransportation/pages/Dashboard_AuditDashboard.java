package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class Dashboard_AuditDashboard extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='Audit Dashboard']")
	WebElement AuditDashboard;

	@FindBy(xpath = "//label[@for='Login1_UserName']")
	WebElement UserName;

	// Initialization
	public Dashboard_AuditDashboard() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on
	// NextTab
	public void Dashboard_AuditDashboardGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//strong[normalize-space()='Audit Dashboard']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//label[@for='Login1_UserName']")).click();

	}

	// This will Open Account Payable application and search on basis of Carrier
	public void AuditDashboardPage() {
		UserName.click();

		// After Search, This assertion will work
		String actual = driver.findElement(By.xpath("//label[@for='Login1_UserName']")).getText();
		String expected = "User Name:";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify AuditDashboard App");

	}

}
