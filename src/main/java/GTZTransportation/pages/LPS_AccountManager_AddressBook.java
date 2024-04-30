package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_AccountManager_AddressBook extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement AccountManagement;
	
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
	WebElement Filteroptions;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtName']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
	WebElement Filter;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	WebElement AddresstDetail;

	@FindBy(xpath = "//div[@id='TB_overlay']")
	WebElement click;

	

	// Initialization
	public LPS_AccountManager_AddressBook() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management & Address
	public void AccountManagement()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AccountManagement.click();
	

        // Find the "Address book" link
        WebElement addressbookLink = driver.findElement(By.xpath("//a[@href='/AddressBook/Addresses.aspx']"));

        // Use JavaScript to click on the "addressbook" link
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addressbookLink);
	}

	// This will Search address
	public void SearchAddress() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filteroptions.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Name.sendKeys("Amazon");
		Filter.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Addressed");

	}

	// This will click on address details
	public void AddressDetails() {
		AddresstDetail.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify address Details");

		
		

	}
	
}
