package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_ProductCatalog_MyTeam extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement AccountManagement;

	@FindBy(xpath = "//input[@data-bind='value: searchTextFilter']")
	WebElement SearchActionEvents;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	// Initialization
	public LPS_ProductCatalog_MyTeam() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management
	public void AccountManagement()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AccountManagement.click();

		// Find the "product catalog" link
		WebElement productcatalog = driver.findElement(By.xpath("//a[@href='/ProductCatalog/Default.aspx']"));

		// Use JavaScript to click on the "product catalog" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", productcatalog);
	}

	public void ProductCatalog() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify Product Catalog");

	}

	public void MyTeam() {
		AccountManagement.click();

		// Find the "my team" link
		WebElement myTeam = driver.findElement(By.xpath("//a[@href='/Customer/Team.aspx']"));

		// Use JavaScript to click on the "my team" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", myTeam);
		captureScreenShot(driver, "Verify myTeam");
	}

}
