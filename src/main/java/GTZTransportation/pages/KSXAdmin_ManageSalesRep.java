package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageSalesRep extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
	WebElement FreightPayment;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_onlyShowActive")
	WebElement activeCheckbox;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_searchCriteria")
	WebElement SearchBox;

	@FindBy(id = "ctl00_MainContentHolder_containerFilter_btnSearch")
	WebElement SearchButton;

	@FindBy(id = "ctl00_MainContentHolder_GridViewSalesPersons_ctl03_FullNameCryptoHyperLink")
	WebElement SalesRepName;

	@FindBy(id = "ctl00_MainContentHolder_btnSave")
	WebElement SaveSalesRep;

	// Initialization
	public KSXAdmin_ManageSalesRep() {
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
		driver.findElement(By.xpath("//a[normalize-space()='Manage Sales Reps']")).click();
		captureScreenShot(driver, "Verify Manage Sales Rep page");

	}

	// This will Search Sales Rep
	public void KSXAdminManageSalesRepSearch() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		activeCheckbox.click();
		SearchBox.sendKeys("logistics");
		SearchButton.click();

		captureScreenShot(driver, "Verify Sales Rep Search page");

	}

	public void KSXAdmin_ManageSalesRepSearch() {
		SalesRepName.click();
		SaveSalesRep.click();
		
		captureScreenShot(driver, "Verify Sales Rep Details page");

	}

}
