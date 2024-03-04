package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class ServiceType_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkServiceTypes")
	WebElement serviceType;

	@FindBy(xpath = "//a[normalize-space()='Cargo']")
	WebElement serviceTypeName;

	// initialization
	public ServiceType_Admin_SpotQuote() {
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

	// This will click on Admin & service types
	public void Open_ServiceTypes_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		serviceType.click();

		captureScreenShot(driver, "Verify Service Types Page - Admin");
	}

// Open service type Details
	public void ServiceType_Admin() {

		serviceTypeName.click();
		captureScreenShot(driver, "Verify ServiceType Details - Admin");
	}

}
