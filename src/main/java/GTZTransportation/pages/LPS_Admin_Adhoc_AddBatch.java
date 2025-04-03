package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_Adhoc_AddBatch extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Add Shipments In Batch']")
	WebElement AddBatch;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterShipments$ctl00']")
	WebElement ShipmentNo;

	@FindBy(id = "ContentPlaceHolder1_ExecuteAdhoc_inputParameterBatch")
	WebElement Batch;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	// Initialization
	public LPS_Admin_Adhoc_AddBatch() {
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

	// This will open ChangeBid
	public void ChangeBid() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AddBatch.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ShipmentNo.sendKeys("392131025");

		Batch.sendKeys("201497");

		Submit.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
