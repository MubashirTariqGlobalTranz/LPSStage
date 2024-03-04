package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class EmailTemplate_Admin_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(id = "ContentPlaceHolder1_linkEmailTemplates")
	WebElement EmailTemplate;

	@FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_grid\"]/tbody/tr[2]/td[2]/a")
	WebElement EmailName;

	// initialization
	public EmailTemplate_Admin_SpotQuote() {
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

	// This will click on Admin & Email Template
	public void Open_EmailTemplate_Admin() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin.click();
		EmailTemplate.click();

		captureScreenShot(driver, "Verify Email Template Page - Admin");
	}

// Open Email Template Details
	public void TemplateDetail_Admin() {

		EmailName.click();
		captureScreenShot(driver, "Verify Template Details - Admin");
	}

}
