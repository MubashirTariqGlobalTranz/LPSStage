package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_AccountManager_ActionBilling extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement AccountManagement;

	@FindBy(xpath = "//input[@data-bind='value: searchTextFilter']")
	WebElement SearchActionEvents;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/button[1]")
	WebElement ActionEventDetail;

	@FindBy(xpath = "//button[@class='btn btn-default' and contains(text(), 'Save')]")
	WebElement SaveButton;

	@FindBy(xpath = "//a[contains(@data-bind,'click: $root.goToInvoices')]")
	WebElement Invoices;

	@FindBy(xpath = "//a[normalize-space()='Export']")
	WebElement Export;

	@FindBy(xpath = "//a[normalize-space()='Stops']")
	WebElement Stops;

	@FindBy(xpath = "//a[normalize-space()='Documents']")
	WebElement Documents;

	@FindBy(xpath = "//a[normalize-space()='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//a[normalize-space()='Tracking']")
	WebElement Tracking;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Back;

	// Initialization
	public LPS_AccountManager_ActionBilling() {
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
	

        // Find the "Action Events" link
        WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/ActionEvents/Default.aspx']"));

        // Use JavaScript to click on the "Action Events" link
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will Search action Event
	public void SearchActionEvent() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SearchActionEvents.sendKeys("Test");
		Search.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Action Events");

	}

	// This will click on Shipment & open all the details
	public void ActionEventsDetails() {
		ActionEventDetail.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Action EventDetails");

		// Items Details
		SaveButton.click();
		

	}
	public void BillableManager() {
		AccountManagement.click();
		

        // Find the "Action Events" link
        WebElement billing = driver.findElement(By.xpath("//a[@href='/Billing/Default.aspx']"));

        // Use JavaScript to click on the "Action Events" link
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", billing);
        captureScreenShot(driver, "Verify Billables");
	}
	public void BillableManagerInvocies() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Invoices.click();
		captureScreenShot(driver, "Verify Billing Invoices");
	}
	
	public void BillableManagerExport() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Export.click();
		captureScreenShot(driver, "Verify Billing Export");
	}
}
