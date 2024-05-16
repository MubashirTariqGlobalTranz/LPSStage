package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_AdhocChangePayment extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Change Payment Amount']")
	WebElement ChangePayment;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_inputParameterPaymentId']")
	WebElement PaymentID;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_inputParameterAmount']")
	WebElement Amount;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	// Initialization
	public LPS_Admin_AdhocChangePayment() {
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

	// This will open ChangePayment
	public void ChangePayment() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ChangePayment.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PaymentID.sendKeys("301091");

		Amount.sendKeys("3333");

		Submit.click();
		driver.switchTo().alert().accept();

	}

}
