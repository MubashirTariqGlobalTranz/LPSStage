package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LoadBoard_OpenLoads_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Open Loads']")
	WebElement OpenLoads;


	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ctl00']")
	WebElement Filter;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ctl01']")
	WebElement Clear;



	// initialization
	public LoadBoard_OpenLoads_SpotQuote() {
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
	public void All_OpenLoadst() {
		OpenLoads.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
		
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
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Open Loads - BETA TEST MODE']")).getText();
		String expected = "Open Loads - BETA TEST MODE";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify OPenLoads");
	}

	
}
