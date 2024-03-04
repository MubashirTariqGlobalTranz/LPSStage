package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class Carriers_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkCarriers")
	WebElement Carriers;

	@FindBy(id = "ContentPlaceHolder1_txtCarrierName")
	WebElement carrierSearch;

	@FindBy(id = "ContentPlaceHolder1_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "//a[normalize-space()='21851']")
	WebElement CarrierDetails;

	// initialization
	public Carriers_Admin_SpotQuote() {
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

	// This will click on Admin & Carriers
	public void Open_Carriers_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		Carriers.click();

		captureScreenShot(driver, "Verify Carriers Page - Admin");
	}

// Search for User
	public void Search_Carriers_Admin() {
		carrierSearch.sendKeys("1 A TRUCKING LLC C/O APEX");
		Filter.click();
		captureScreenShot(driver, "Verify Carriers Search - Admin");
	}

// Opens User Details
	public void Carrier_Details_Admin() {

		CarrierDetails.click();
		captureScreenShot(driver, "Verify Carrier Details - Admin");
	}

}
