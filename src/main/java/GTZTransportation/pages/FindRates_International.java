package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FindRates_International extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(xpath = "//span[normalize-space()='International']")
	WebElement International;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement RateEstimator;

	@FindBy(xpath = "//input[@data-bind='value: weight']")
	WebElement Weight;

	@FindBy(xpath = "//input[@data-bind='value: cubicMeters']")
	WebElement Cubic;

	@FindBy(xpath = "//input[@data-bind='value: itemLength']")
	WebElement Length;

	@FindBy(xpath = "//input[@data-bind='value: itemWidth']")
	WebElement Width;

	@FindBy(xpath = "//input[@data-bind='value: itemHeight']")
	WebElement Height;

	@FindBy(xpath = "//input[@data-bind='value: itemCount']")
	WebElement Unit;

	// Initialization
	public FindRates_International() {
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
		International.click();
	}

	public void Internaltional() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RateEstimator.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Weight.sendKeys("10");
		Cubic.sendKeys("10");
		Length.sendKeys("10");
		Width.sendKeys("10");
		Height.sendKeys("10");
		Unit.sendKeys("10");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//div[normalize-space()='Shipment Details']")).getText();
		String expected = "Shipment Details";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Find Rates International");
	}

}
