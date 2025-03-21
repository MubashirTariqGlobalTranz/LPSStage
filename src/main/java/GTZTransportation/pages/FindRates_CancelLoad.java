package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FindRates_CancelLoad extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(xpath = "//span[normalize-space()='History']")
	WebElement History;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
	WebElement FilterExp;

	@FindBy(id = "//a[@id='ContentPlaceHolder1_container_grid_btnCancel_1']")
	WebElement cancel;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/span[2]/div/div/div/div/table/tbody/tr[2]/td[2]/a")
	WebElement Loadno;

	// Initialization
	public FindRates_CancelLoad() {
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
		//captureScreenShot(driver, "Verify Find Rate History");
		//cancel.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Loadno.click();
		String currentWindowHandle = driver.getWindowHandle();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		//captureScreenShot(driver, "Verify Loadno");
	}}

}
