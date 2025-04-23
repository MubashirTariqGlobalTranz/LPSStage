package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FindRates_HeavyHaul extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(xpath = "//span[normalize-space()='Heavy Haul']")
	WebElement HeavyHual;

	// Initialization
	public FindRates_HeavyHaul() {
		PageFactory.initElements(driver, this);
	}

	// This will open Find Rate Application
	public void openFindRates()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRates.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HeavyHual.click();
	}

	public void HeavyHual() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h1[normalize-space()='Service Commitments']")).getText();
		String expected = "Service Commitments";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Find Rates HeavyHual");
	}

}
