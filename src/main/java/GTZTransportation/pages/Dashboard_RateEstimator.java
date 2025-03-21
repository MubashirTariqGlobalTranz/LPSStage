package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import GTZTransportation.gtz.BaseClass;

public class Dashboard_RateEstimator extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='Rate Estimator']")
	WebElement RateEstimator;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement origin;

	@FindBy(xpath = "//tbody/tr[2]/td[1]/input[1]")
	WebElement destination;

	@FindBy(xpath = "//button[@class='btn btn-primary bold mt5']")
	WebElement Search;

	// Initialization
	public Dashboard_RateEstimator() {
		PageFactory.initElements(driver, this);
	}

	// This will open Claim list
	public void RateEstimator()

	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RateEstimator.click();
	}

	public void RateEstimatorSearch() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		origin.sendKeys("30303");
		destination.sendKeys("60606");
		Search.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Rate Estimator']")).getText();
		String expected = "Rate Estimator";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify RateEstimator Page");
	}

}
