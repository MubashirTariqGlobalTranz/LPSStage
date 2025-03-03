package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateBOL_FindRates extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(id = "OriginZip")
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
	
	//Initialization
	public CreateBOL_FindRates() {
		PageFactory.initElements(driver, this);
	}
      
	//This will open Find Rate Application
	public void openFindRates()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRates.click();
	}
  
	//This will fill the find rate fields and click on find rates button & Create Button
	public void FindRates() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Origin.clear();
		Origin.sendKeys("55379");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Destination.clear();
		Destination.sendKeys("30303");
	
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
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]/div[18]/div/div[2]/table/tbody/tr[2]/td[6]/a[1]")).click();
		
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
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Emailtext.sendKeys("mubashir.tariq@globaltranz.com");
		SendBOL.click();
	}
	

}
