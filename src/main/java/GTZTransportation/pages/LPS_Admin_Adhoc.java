package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_Adhoc extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Copy User']")
	WebElement CopyUser;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterCopyFromEmailAddress$ctl00']")
	WebElement CopyFrom;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterEmailAddress$ctl00']")
	WebElement Emailaddress;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterFirstName$ctl00']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterLastName$ctl00']")
	WebElement LastName;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	// Initialization
	public LPS_Admin_Adhoc() {
		PageFactory.initElements(driver, this);
	}

	// This will open Admin & adhoc
	public void Admin()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Admin.click();

		// Find the "Data entry expression" link
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/Adhoc/Default.aspx']"));

		// Use JavaScript to click on the "Data entry expression" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open data entry Expression
	public void CopyUser() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CopyUser.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CopyFrom.sendKeys("mubashir.tariq@globaltranz.com");
		// Emailaddress.sendKeys("dempseytestingformorgan2@shiplps.com ");
		Random randomEmail = new Random();
		int randomInt = randomEmail.nextInt(1000);

		// Construct a random email address
		String randomEmailStr = "username" + randomInt + "@lps.com";

		// Use the generated email
		CopyFrom.sendKeys(randomEmailStr);
		Emailaddress.sendKeys(randomEmailStr);
		
		FirstName.sendKeys("Test");
		LastName.sendKeys("LPS");
		Submit.click();
		driver.switchTo().alert().accept();

	}

}
