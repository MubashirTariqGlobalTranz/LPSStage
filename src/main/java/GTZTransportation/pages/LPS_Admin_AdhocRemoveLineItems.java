package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_AdhocRemoveLineItems extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[1]/a/span")
	WebElement createLoadPage;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[2]/ul/li[4]/a/span")
	WebElement Massload;

	@FindBy(id = "ContentPlaceHolder1_txtSource")
	WebElement SourceLPS;

	@FindBy(id = "ContentPlaceHolder1_txtLoadCount")
	WebElement LoadCount;

	@FindBy(id = "ContentPlaceHolder1_timePickupWindow_dateSelection_0_txtDate")
	WebElement PickUpWindow;

	@FindBy(id = "ContentPlaceHolder1_timeDeliveryWindow_dateSelection_0_txtDate")
	WebElement DeliveryWindow;

	@FindBy(id = "ContentPlaceHolder1_createButton")
	WebElement Create;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ExecuteAdhoc$inputParameterLoadReferenceNumber$ctl00']")
	WebElement LoadNo;

	@FindBy(xpath = "//textarea[@id='ContentPlaceHolder1_ExecuteAdhoc_txtNotes']")
	WebElement Notes;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_ExecuteAdhoc_btnExecute']")
	WebElement Submit;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//a[normalize-space()='Remove Load Items']")
	WebElement RemoveLineItem;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement Logout;

	// initialization
	public LPS_Admin_AdhocRemoveLineItems() {
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

	// This will click on Create Mass load page & Fill all the required fields. Load
	// will be create
	public void Create_Load() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createLoadPage.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Massload.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SourceLPS.sendKeys("LPS-230120-151152"); // LPS-240308-124342 , Cameroncoffee LPS-240819-131931, ConEdison
													// LPS-240814-050350
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadCount.clear();
		LoadCount.sendKeys("1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		PickUpWindow.sendKeys(formattedDate);
		DeliveryWindow.sendKeys(formattedDate);

		Create.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement K = driver.findElement(By.className("info-validation"));
		String kt = K.getText();
		System.out.println("Original text: " + kt);

		// Removing the specified text
		String textToRemove = "The following loads were successfully created: ";
		String newKt = kt.replace(textToRemove, "");

		System.out.println("Text after removal: " + newKt);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Logout.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		Admin.click();

		WebElement actionEventsLink = driver.findElement(By.xpath("//a[@href='/Adhoc/Default.aspx']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RemoveLineItem.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadNo.sendKeys(newKt);
		Notes.sendKeys("Test");
		Submit.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
