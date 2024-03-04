package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class Requirment_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkRequirements")
	WebElement Requirment;

	@FindBy(xpath = "//tbody/tr[4]/td[1]/a[1]")
	WebElement requirmentName;

	// initialization
	public Requirment_Admin_SpotQuote() {
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

	// This will click on Admin & requirments
	public void Open_Requirment_Carrier_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		Requirment.click();

		captureScreenShot(driver, "Verify Requirments Page - Admin");
	}

// Open requirment Details
	public void Requirment_Details_Admin() {

		requirmentName.click();
		captureScreenShot(driver, "Verify Requirment Details - Admin");
	}

}
