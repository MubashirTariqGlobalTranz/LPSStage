package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LoadBoard_LoadManagement_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Load Management']")
	WebElement LoadManagement;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtInput")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtOrigin")
	WebElement Origin;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtDestination")
	WebElement Destination;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnClearFilter")
	WebElement Clear;



	// initialization
	public LoadBoard_LoadManagement_SpotQuote() {
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

	// This will click on load Board All & Filtered records
	public void All_LoadManagement() {
		LoadManagement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Customer.sendKeys("Cameron's Coffee");
		Filter.click();
		captureScreenShot(driver, "Verify customer loads");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Clear.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Assertion
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Load #']")).getText();
		String expected = "Load #";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Management");
	}

	
}
