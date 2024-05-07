package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_Security extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_linkRoles']")
	WebElement Roles;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_linkUsers']")
	WebElement Users;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtFirstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
	WebElement Filter;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/a[1]")
	WebElement Details;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
	WebElement FilterExpand;

	// Initialization
	public LPS_Admin_Security() {
		PageFactory.initElements(driver, this);
	}

	// This will open Admin & Security
	public void Admin()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Admin.click();

		// Find the "Roles" link
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/Security']"));

		// Use JavaScript to click on the "Roles" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open data entry Expression
	public void Roles() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Roles.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Roles']")).getText();
		String expected = "Roles";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Roles");

	}

	// This will search Expression
	public void Users() {
		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/Security']"));

		// Use JavaScript to click on the "Users" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FirstName.sendKeys("Mubashir");
		Filter.click();
		captureScreenShot(driver, "Verify Users");
		Details.click();

	}

}
