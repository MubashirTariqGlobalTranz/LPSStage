package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Resources_NewsAdmin extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Resources']")
	WebElement Resources;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")
	WebElement EditNews;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Back;

	// Initialization
	public LPS_Resources_NewsAdmin() {
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
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/News/Default.aspx']"));

		// Use JavaScript to click on the "News" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open news listing
	public void NewsItems() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify news items");
		EditNews.click();

		captureScreenShot(driver, "Verify news details");

	}

}
