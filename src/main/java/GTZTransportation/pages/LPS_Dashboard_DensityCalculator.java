package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_DensityCalculator extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='L']")
	WebElement Length;

	@FindBy(xpath = "//input[@placeholder='W']")
	WebElement Width;

	@FindBy(xpath = "//input[@placeholder='H']")
	WebElement Height;

	@FindBy(xpath = "//input[@placeholder='LBS']")
	WebElement LBS;
	
	@FindBy(xpath = "//h3[normalize-space()='Density Calculator']")
	WebElement Calc;

	// Initialization
	public LPS_Dashboard_DensityCalculator() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Management
	public void DensityCalulator()

	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Length.sendKeys("2");
		Width.sendKeys("2");
		Height.sendKeys("2");
		LBS.sendKeys("2");
		Calc.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//span[normalize-space()='432.00']")).getText();
		String expected = "432.00";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Density Calculator");

	}

}
