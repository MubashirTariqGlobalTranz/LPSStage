package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import GTZTransportation.gtz.BaseClass;

public class LPS_InboundRouting_Order extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='Inbound Routing Guides']")
	WebElement InboundRouting;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_podWBY1_grid_linkFindRates_9']//span[@class='label label-info'][normalize-space()='GTZship']")
	WebElement Qualitech;

	@FindBy(xpath = "//input[@id='OriginZip']")
	WebElement Origin;

	@FindBy(id = "DestinationZip")
	WebElement Destination;

	@FindBy(xpath = "//input[@placeholder='Pieces']")
	WebElement Pieces;

	@FindBy(xpath = "//input[@placeholder='Pallets']")
	WebElement Pallet;

	@FindBy(xpath = "//input[@placeholder='Weight']")
	WebElement Weight;

	@FindBy(xpath = "//input[@placeholder='Length']")
	WebElement Length;

	@FindBy(xpath = "//input[@placeholder='Width']")
	WebElement Width;

	@FindBy(xpath = "//input[@placeholder='Height']")
	WebElement Height;

	@FindBy(xpath = "//button[@class='btn btn-large btn-primary']")
	WebElement FindRatesButton;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[20]/div/div[2]/table/tbody/tr[2]/td[6]/a[1]")
	WebElement Create;

	@FindBy(xpath = "//input[@id='tr2']")
	WebElement Description;

	@FindBy(xpath = "//div[@data-bind=\"template: { name: 'bolAddressTemplate', data: $root.bol.destination }\"]//input[@placeholder='Company name']")
	WebElement CompanyName;

	@FindBy(xpath = "//div[@data-bind=\"template: { name: 'bolAddressTemplate', data: $root.bol.destination }\"]//input[@id='input3']")
	WebElement Address;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[3]/div[3]/div[2]/ul/li[1]/input")
	WebElement CompanyName1;

	@FindBy(xpath = "//*[@id=\"input3\"]")
	WebElement Address1;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[3]/div[3]/div[3]/ul/li[3]/input[1]")
	WebElement PhoneNo;

	@FindBy(xpath = "//span[@data-bind=\"text:(createBolButtonText()?createBolButtonText():'Create BOL!')\"]")
	WebElement BOLCreate;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div[1]/textarea")
	WebElement Emailtext;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div[1]/button")
	WebElement SendBOL;
	
	 @FindBy(xpath = "//a[@id='navheader_updateActiveCustomer_btnChange']")
	    WebElement Change;

	    @FindBy(xpath = "//a[@id='navheader_updateActiveCustomer_btnSave']")
	    WebElement Save;

	    @FindBy(xpath = "//select[@id='navheader_updateActiveCustomer_lstCustomer']")
	    WebElement customerDropdown;

	// Initialization
	public LPS_InboundRouting_Order() {
		PageFactory.initElements(driver, this);
	}

	// This will open Claim list
	public void InboundRouting()

	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		InboundRouting.click();
	}

	public void OrderCreation() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Qualitech.click();
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		// driver.findElement(By.xpath("//*[text()='KeyRevenue']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}

		}
	}

	public void FindRates() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Origin.clear();
		Origin.sendKeys("30303");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Destination.clear();
		Destination.sendKeys("60606");
		Origin.clear();
		Origin.sendKeys("30303");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pieces.clear();
		Pieces.sendKeys("22");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pallet.clear();
		Pallet.sendKeys("22");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Weight.clear();
		Weight.sendKeys("10");
		Width.clear();
		Width.sendKeys("30");
		Length.clear();
		Length.sendKeys("30");

		Height.clear();

		Height.sendKeys("30");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRatesButton.click();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("/html/body/form/div[3]/div[3]/div/div[1]/div[18]/div/div[2]/table/tbody/tr[2]/td[6]/a[1]"))
				.click();

	}

	// This will create BOL against selected carrier
	public void CreateBOL() {
		Description.sendKeys("Mubashir");
		CompanyName.sendKeys("Test Name");
		Address.sendKeys("Test Address");
		CompanyName1.sendKeys("Test Name");
		Address1.sendKeys("Test Address");
		PhoneNo.sendKeys("1231231234");
		BOLCreate.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Emailtext.sendKeys("mubashir.tariq@globaltranz.com");
		SendBOL.click();
		//Text Compare, This assertion will work
				String actual = driver.findElement(By.xpath("//small[normalize-space()='Bill of Lading']"))
						.getText();
				String expected = "Bill of Lading";
				Assert.assertEquals(actual, expected);
				captureScreenShot(driver,"Verify order InboundRouting;");
	}
	 public void selectAndSaveCustomer() {
	        
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         // Click the Change button
         System.out.println("Clicking Change button...");
         Change.click();

         // Wait for the customer dropdown to be visible
         System.out.println("Waiting for customer dropdown...");
         wait.until(ExpectedConditions.visibilityOf(customerDropdown));

         // Select "Nokia" from the dropdown
         Select customerSelect = new Select(customerDropdown);
         System.out.println("Selecting 'Nokia' from the dropdown...");
         customerSelect.selectByVisibleText("NOKIA");

         // Click Save to save the selection
         System.out.println("Saving the Nokia selection...");
         Save.click();

         // Wait for the page to load before clicking Change again
         System.out.println("Waiting for Change button to be clickable...");
         wait.until(ExpectedConditions.elementToBeClickable(Change));

         // Click the Change button again to change the customer
         Change.click();

         // Wait for the customer dropdown to be visible again
         System.out.println("Waiting for customer dropdown again...");
         wait.until(ExpectedConditions.visibilityOf(customerDropdown));

         // Select "Cameron's Coffee" from the dropdown
         System.out.println("Selecting 'Cameron's Coffee' from the dropdown...");
         customerSelect.selectByVisibleText("Cameron's Coffee");

         // Click Save to save the selection
         System.out.println("Saving the Cameron's Coffee selection...");
         Save.click();
         
         try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}

        
     } 

}
