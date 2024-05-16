package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_AdhocAssignCarrier extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Assign Carrier']")
	WebElement AssignCarrier;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_inputParameterCarrierId']")
	WebElement CarrierID;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterGroups$ctl00']")
	WebElement Groups;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	// Initialization
	public LPS_Admin_AdhocAssignCarrier() {
		PageFactory.initElements(driver, this);
	}

	// This will open Admin & adhoc
	public void Admin()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Admin.click();

		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/Adhoc/Default.aspx']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open assign carrier
	public void AssignCarrier() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AssignCarrier.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CarrierID.sendKeys("10639");

		Groups.sendKeys("144");

		Submit.click();
		driver.switchTo().alert().accept();

	}

}
