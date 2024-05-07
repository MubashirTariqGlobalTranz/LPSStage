package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_Adhoc extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Expression Help']")
	WebElement ExpressionHelp;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtDataEntryShipmentId']")
	WebElement DataEntryShipment;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnLoad']")
	WebElement LoadDataEntryShipment;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtName']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
	WebElement Save;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
	WebElement FilterExpand;

	// Initialization
	public LPS_Admin_Adhoc() {
		PageFactory.initElements(driver, this);
	}

	// This will open Admin & Data Entry Expressions
	public void Admin()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Admin.click();

		// Find the "Data entry expression" link
		WebElement actionEventsLink = driver
				.findElement(By.xpath("//a[@href='/DataEntry/Shipment/Expressions/default.aspx']"));

		// Use JavaScript to click on the "Data entry expression" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open data entry Expression
	public void DataEntryExpression() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExpressionHelp.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DataEntryShipment.sendKeys("Test");
		LoadDataEntryShipment.click();
		captureScreenShot(driver, "Verify Data Entry Expression Help");

	}

	// This will search Expression
	public void SearchExpression() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterExpand.click();
		Name.sendKeys("ValidateCurrency");
		Save.click();

		captureScreenShot(driver, "Verify Search Data Expression");

	}

}
