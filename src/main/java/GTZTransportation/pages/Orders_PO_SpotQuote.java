package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class Orders_PO_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Orders']")
	WebElement Orders;

	@FindBy(xpath = "//button[@class=' mt15 ml10 left btn btn-success btn-mini']")
	WebElement Create;

	@FindBy(xpath = "//input[@placeholder='PO #']")
	WebElement PO;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	WebElement DeliveryDate;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")
	WebElement CompletionDate;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")
	WebElement AvailableDate;

	@FindBy(xpath = "//input[@id='referenceNumber']")
	WebElement RefernceNo;

	@FindBy(xpath = "//input[@id='purchasingCompanyName']")
	WebElement PurchasingCompany;

	@FindBy(xpath = "//input[@id='companyName']")
	WebElement Company;

	@FindBy(xpath = "//input[@id='contactFirstName']")
	WebElement ContactFirstName;

	@FindBy(xpath = "//input[@id='contactLastName']")
	WebElement ContactLastName;

	@FindBy(xpath = "//input[@id='contactPhone']")
	WebElement Phone;

	@FindBy(xpath = "//input[@placeholder='email@domain.com']")
	WebElement Email;

	@FindBy(xpath = "//button[@data-bind='click:$root.submitPOSaveAction, enable:needsToBeSaved() && $root.pickedRootSaving() ==false']")
	WebElement Submit;

	// initialization
	public Orders_PO_SpotQuote() {
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
	public void PO_Creation() {
		Orders.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Create.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String randomPONumber = "PO-" + UUID.randomUUID().toString().substring(0, 8);
		PO.sendKeys(randomPONumber); // Set random PO number

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Get the current date

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		DeliveryDate.sendKeys(formattedDate);

		// Set the Completion Date (1 day after the current date)
		CompletionDate.sendKeys(currentDate.plusDays(1).format(formatter));

		// Set the Available Date (current date)
		AvailableDate.sendKeys(formattedDate);

		// Enter Reference Number
		RefernceNo.sendKeys("REF123456");

		// Enter Purchasing Company Name
		PurchasingCompany.sendKeys("Arizona Public Service Co");

		// Enter Company Name
		Company.sendKeys("GTZ Transportation");

		// Enter Contact First Name
		ContactFirstName.sendKeys("John");

		// Enter Contact Last Name
		ContactLastName.sendKeys("Doe");

		// Enter Phone Number
		Phone.sendKeys("123-456-7890");

		// Enter Email
		Email.sendKeys("johndoe@example.com");

		// Click on Submit to create the PO
		Submit.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Validate the PO creation by checking some element or message
		String actualMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-success mt20')]")).getText();
		String expectedMessage = "Success! Save completed!";
		Assert.assertEquals(actualMessage, expectedMessage);

		captureScreenShot(driver, "Verify PO Added");
	}

}
