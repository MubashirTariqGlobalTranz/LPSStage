package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class Customer_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkCustomers")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_txtCustomerName")
	WebElement customerSearch;

	@FindBy(id = "ContentPlaceHolder1_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "//a[normalize-space()='10637']")
	WebElement CustomerDetails;


	// initialization
	public Customer_Admin_SpotQuote() {
		PageFactory.initElements(driver, this);
	}

	// This will open spot quote application
	public void openSpotQuote()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SpotQuote.click();

	}

	// This will click on Admin & Customer
	public void Open_Customer_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		Customer.click();

		captureScreenShot(driver, "Verify Customer Page - Admin");
	}

// Search for Customer
	public void Search_Customer_Admin() {
		customerSearch.sendKeys("Armacell LLC");
		Filter.click();
		captureScreenShot(driver, "Verify Customer Search - Admin");
	}

// Opens Customer Details
	public void Customer_Details_Admin() {

		CustomerDetails.click();
		captureScreenShot(driver, "Verify CustomerDetails - Admin");
	}

}
