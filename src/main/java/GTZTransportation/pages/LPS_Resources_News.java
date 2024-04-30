package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Resources_News extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Resources']")
	WebElement Resources;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnFilter']")
	WebElement FilterArticle;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Back;

	// Initialization
	public LPS_Resources_News() {
		PageFactory.initElements(driver, this);
	}

	// This will open Resources
	public void Resources()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Resources.click();

		// Find the "News" link
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/News/History.aspx']"));

		// Use JavaScript to click on the "News" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open news listing
	public void NewsEvent() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FilterArticle.click();

		captureScreenShot(driver, "Verify News Listing");

	}

}
