package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_AdhocChangeCurrency extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Change Currency']")
	WebElement ChangeCurrency;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_inputParameterCustomerId']")
	WebElement CustomerID;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterShipmentNumber$ctl00']")
	WebElement ShipmentNo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	// Initialization
	public LPS_Admin_AdhocChangeCurrency() {
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
	public void ChangeCurrency() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ChangeCurrency.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomerID.sendKeys("10060");

		ShipmentNo.sendKeys("344583369");

		Submit.click();
		driver.switchTo().alert().accept();

	}

}
