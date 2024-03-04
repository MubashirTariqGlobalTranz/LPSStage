package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class User_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkUsers")
	WebElement User;

	@FindBy(id = "ContentPlaceHolder1_txtFirstName")
	WebElement userSearch;

	@FindBy(id = "ContentPlaceHolder1_btnFilter")
	WebElement Filter;

	@FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_grid\"]/tbody/tr[2]/td[8]/a")
	WebElement userDetails;

	// initialization
	public User_Admin_SpotQuote() {
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

	// This will click on Admin & Users
	public void Open_Users_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		User.click();

		captureScreenShot(driver, "Verify Users Page - Admin");
	}

// Search for User
	public void Search_Users_Admin() {
		userSearch.sendKeys("Test");
		Filter.click();
		captureScreenShot(driver, "Verify User Search - Admin");
	}

// Opens User Details
	public void User_Details_Admin() {

		userDetails.click();
		captureScreenShot(driver, "Verify User Details - Admin");
	}

}
