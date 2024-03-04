package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPSCustomer_Carrier_ProspectQueue extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='Client Admin']")
	WebElement ClientAdmin;

	@FindBy(xpath = "/html/body/form/div[5]/section[2]/div/div/div/div/div[4]/div/div[2]/table/tbody/tr[1]/td[10]/button")
	WebElement Edit;

	@FindBy(xpath = "//button[text()='Save this tab']")
	WebElement SaveTab;

	@FindBy(xpath = "//button[contains(text(), 'Back to List')]")
	WebElement BacktoList;

	@FindBy(xpath = "//input[@placeholder='Filter by Name']")
	WebElement InputSearch;

	@FindBy(xpath = "//button[@data-bind='click: applyFilter' and text()='Search']")
	WebElement Search;

	@FindBy(xpath = "//button[@data-bind='click: clearFilter' and text()='Clear']")
	WebElement Clear;

	@FindBy(xpath = "//div[@id='statusButtons']//button[text()='New']")
	WebElement New;

	@FindBy(xpath = "//div[@id='statusButtons']//button[text()='Submitted']")
	WebElement Submitted;

	@FindBy(xpath = "//div[@id='statusButtons']//button[text()='Assigned']")
	WebElement Assigned;

	@FindBy(xpath = "//div[@id='statusButtons']//button[text()='Cancelled']")
	WebElement Cancelled;

	@FindBy(xpath = "//a[normalize-space()='Insurance Rates']")
	WebElement Insurance;

	@FindBy(xpath = "//a[@id='ctl00_MainContentHolder_container_grid_ctl02_linkAccountManagers']")
	WebElement Managers;

	// Initialization
	public LPSCustomer_Carrier_ProspectQueue() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void clientAdminGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='Customer/Carrier']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		WebElement customersMenuItem = driver.findElement(By.id("tab2"));

		// Hover over the "Customers" menu item to make the sub-menu visible
		// This is necessary as the "Prospect Queue" link is in a sub-menu
		org.openqa.selenium.interactions.Actions builder = new org.openqa.selenium.interactions.Actions(driver);
		builder.moveToElement(customersMenuItem).build().perform();

		// Find and click the "Prospect Queue" link
		WebElement prospectQueueLink = driver.findElement(By.id("ctl00_TopHeader_linkProspectQueueCrypto"));
		prospectQueueLink.click();

	}

	// This will Edit Queues
	public void EditQueue() {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Edit.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SaveTab.click();

		captureScreenShot(driver, "Verify Queue Save Successfully");
		BacktoList.click();
	}

	public void Search() {
		InputSearch.sendKeys("Test");

		Search.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Queue Search");
		Clear.click();
	}

	public void New() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		New.click();
		captureScreenShot(driver, "Verify New Tab for Prospect Queue");

	}

	public void Submitted() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Submitted.click();
		captureScreenShot(driver, "Verify Submitted Tab for Prospect Queue");
	}

	public void Assigned() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assigned.click();
		captureScreenShot(driver, "Verify Assigned Tab for Prospect Queue");
	}

	public void Cancelled() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cancelled.click();
		captureScreenShot(driver, "Verify Cancelled Tab for Prospect Queue");
	}

}
