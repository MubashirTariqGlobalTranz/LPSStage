package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_Claims extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Claims']")
	WebElement Claims;

	// Initialization
	public LPS_Dashboard_Claims() {
		PageFactory.initElements(driver, this);
	}

	// This will open Claim list
	public void ClaimList()

	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Find the "Claim list" link
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[normalize-space()='Claims List']"));

		// Use JavaScript to click on the "claims list" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	
	public void ClaimListPage() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Claims']")).getText();
		String expected = "Claims";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Claims list page");

	}

	// This will click open claim entry form details

	public void AddClaims() {
		Claims.click();

	}

}
