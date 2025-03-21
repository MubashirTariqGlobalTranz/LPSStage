package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class History_FindRates extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(xpath = "//span[normalize-space()='History']")
	WebElement History;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
	WebElement FilterExp;

	@FindBy(id = "ContentPlaceHolder1_container_grid_linkCopy_0")
	WebElement copy;

	// Initialization
	public History_FindRates() {
		PageFactory.initElements(driver, this);
	}

	// This will open Find Rate & History Application
	public void openFindRatesHistory()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRates.click();
		History.click();
		FilterExp.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
		captureScreenShot(driver, "Verify Find Rate History");
		// copy.click();
	}

}
