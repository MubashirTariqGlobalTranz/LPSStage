package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageShipment extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
	WebElement FreightPayment;

	@FindBy(id = "ctl00_MainContentHolder_btnFilter")
	WebElement Filter;

	@FindBy(id = "ctl00_MainContentHolder_txtSearchTerm")
	WebElement Search;

	@FindBy(id = "ctl00_MainContentHolder_btnClearFilter")
	WebElement Clear;

	@FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select[1]/option[3]")
	WebElement SortBy;

	@FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/select/option[3]")
	WebElement CustomerRouted;

	@FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select/option[2]")
	WebElement Team;
	@FindBy(xpath = "//*[text()=' Back to Queue']")
	WebElement Back;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div[2]/div[2]/div/div[2]/div/div[2]/table/tbody/tr[3]/td/input")
	WebElement CarrierSearch;
	@FindBy(id = "Dispatched")
	WebElement Dispatch;

	@FindBy(id = "InTransit")
	WebElement InTransit;

	@FindBy(id = "Delivered")
	WebElement Delivered;

	@FindBy(id = "Exception")
	WebElement Exception;

	@FindBy(id = "All")
	WebElement All;

	@FindBy(xpath = "//*[text()='Customers']")
	WebElement Customer;

	@FindBy(xpath = "//*[text()='Carriers']")
	WebElement Carriers;

	@FindBy(id = "ctl00_MainContentHolder_btnExport")
	WebElement Export;
	
	@FindBy(id = "ctl00_MainContentHolder_linkBillOfLadingSearch")
	WebElement AdvanceSearch;
	
	@FindBy(id = "ctl00_MainContentHolder_txtSearchTerm")
	WebElement SearchTerm;

	@FindBy(id = "ctl00_MainContentHolder_btnSearch")
	WebElement SearchClick;
	
	// Initialization
	public KSXAdmin_ManageShipment() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void KSXAdminTab() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KSX Admin']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//*[text()='Manage Shipments']")).click();

	}

	// This will Open Account Payable application and search on basis of Carrier
	public void KSXAdmin_ManageShipmentSearch() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
		captureScreenShot(driver, "Verify Records are showing on KSX Admin");

		Team.click();
		Filter.click();
		Clear.click();

		Search.sendKeys("918187670");
		Filter.click();
		captureScreenShot(driver, "Verify Records For Search_KSX Admin");
		Clear.click();

		SortBy.click();
		Filter.click();
		Clear.click();

		CustomerRouted.click();
		Filter.click();
		captureScreenShot(driver, "Verify Records For CustomerRouted_KSX Admin");
		Clear.click();
		Filter.click();

	}

	public void KSXAdmin_ManageShipmentTab() {
		Dispatch.click();

		InTransit.click();

		Delivered.click();

		Exception.click();

		All.click();
		String actual4 = driver.findElement(By.id("All")).getText();
		String expected4 = "All";
		Assert.assertEquals(actual4, expected4);
		System.out.println("Tab is opened :  " + actual4);

	}

	public void KSXAdmin_ManageShipmentContextFilter() {
		Customer.click();

		Carriers.click();
		String actual3 = driver.findElement(By.xpath("//*[text()='Carriers']")).getText();
		String expected3 = "Carriers";
		Assert.assertEquals(actual3, expected3);
		System.out.println("Context Filter is opened :  " + actual3);
	}

	public void KSXAdmin_ManageShipmentExport() {
		Export.click();

		
	}
	public void KSXAdmin_ManageShipmentAdvanceSearch() {
		AdvanceSearch.click();
		SearchTerm.sendKeys("Test");
		SearchClick.click();
		captureScreenShot(driver, "Verify Advance Search for Manage Shipments");
	}
}
