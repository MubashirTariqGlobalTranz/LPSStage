package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_OptEvent_CustomerAccount extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement AccountManagement;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")
	WebElement EventDetails;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSave']")
	WebElement Save;

	@FindBy(xpath = "//a[normalize-space()='1234567890']")
	WebElement AccountNo;

	// Initialization
	public LPS_OptEvent_CustomerAccount() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management & Action Events
	public void AccountManagement()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AccountManagement.click();

		// Find the "Optimization Event" link
		WebElement optimizationEventsLink = driver.findElement(By.xpath("//a[@href='/Customer/SavingsEvents.aspx']"));

		// Use JavaScript to click on the "Action Events" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optimizationEventsLink);
	}

	// This will open optimization Event page
	public void OptimizationDetails() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		captureScreenShot(driver, "Verify Optimization Events ");

	}

	public void CustomerAccountNo() {
		AccountManagement.click();

		// Find the "Customer Account" link
		WebElement Customeraccount = driver.findElement(By.xpath("//a[@href='/Billing/AccountNumbers.aspx']"));

		// Use JavaScript to click on the "Action Events" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Customeraccount);
		captureScreenShot(driver, "Verify Customer Account No");
	}

	public void AccountDetails() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AccountNo.click();
		captureScreenShot(driver, "Verify account no details");
	}

}
