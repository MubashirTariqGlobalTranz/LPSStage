package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class Orders_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Orders']")
	WebElement Orders;

	@FindBy(xpath = "//button[contains(@class,'btn btn-medium btn-primary')]")
	WebElement Search;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement PO;

	@FindBy(xpath = "//a[normalize-space()='ORIGIN']")
	WebElement Origin;

	@FindBy(xpath = "//a[normalize-space()='DESTINATION']")
	WebElement Destination;

	@FindBy(xpath = "//a[normalize-space()='ITEM']")
	WebElement Item;

	@FindBy(xpath = "//a[normalize-space()='NOTES']")
	WebElement Notes;

	@FindBy(xpath = "//a[normalize-space()='IMPORT (31)']")
	WebElement Imports;

	@FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
	WebElement Back;

	@FindBy(xpath = "//a[normalize-space()='HOLD']")
	WebElement Hold;

	@FindBy(xpath = "//a[normalize-space()='LOAD CREATED']")
	WebElement LoadCreated;

	@FindBy(xpath = "//a[normalize-space()='COMPLETED']")
	WebElement Completed;

	@FindBy(xpath = "//a[normalize-space()='CANCELLED']")
	WebElement Cancelled;

	@FindBy(xpath = "//a[normalize-space()='ALL']")
	WebElement All;

	// initialization
	public Orders_SpotQuote() {
		PageFactory.initElements(driver, this);
	}

	// This will open spot quote application
	public void openSpotQuote()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SpotQuote.click();

	}

	// This will click on load Board All & Filtered records
	public void All_Orders() {
		Orders.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement customerDropdown = driver.findElement(By.cssSelector("select.input-large"));
		customerDropdown.click(); // Click to open dropdown

		// Locate the specific option (Arizona Public Service Co) and click it
		WebElement customerOption = driver.findElement(By.xpath("//option[text()='Arizona Public Service Co']"));
		customerOption.click(); // Select the option
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Search.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PO.click();
		captureScreenShot(driver, "VerifyPO_Orders");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Origin.click();
		captureScreenShot(driver, "VerifyOrigin_Orders");
		Destination.click();
		captureScreenShot(driver, "VerifyDestination_Orders");
		Item.click();
		captureScreenShot(driver, "VerifyItem_Orders");
		Notes.click();
		captureScreenShot(driver, "VerifyNotes_Orders");
		Imports.click();
		captureScreenShot(driver, "VerifyImports_Orders");
		// Assertion
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Import Entries']")).getText();
		String expected = "Import Entries";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify PO Details");
		Back.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void All_Orders_Tabs() {
		Hold.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadCreated.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Completed.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cancelled.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		All.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Assertion
		String actual = driver.findElement(By.xpath("//div[@class='colt1 kgHeaderText']")).getText();
		String expected = "Status";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify PO Tabs");
	}
}
