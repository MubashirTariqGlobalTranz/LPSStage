package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FindRatesCarriers extends BaseClass {

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

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[8]/span/input")
	WebElement Description;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[4]/div[3]/div[2]/ul/li[1]/input")
	WebElement CompanyName;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[4]/div[3]/div[2]/ul/li[2]/input")
	WebElement Address;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[11]/a[1]")
	WebElement BOLCreate;
	
	@FindBy(xpath = "(//td[contains(@class, 'price')]/a)[1]")
	WebElement DiscountedPrice;
	
	@FindBy(xpath = "//div[@class='body-fixed']//a[@class='btn btn-primary'][normalize-space()='Back to Results']")
	WebElement Back;
	
	@FindBy(xpath = "(//td[contains(@class, 'carrier')]/span/a)[1]")
	WebElement CarrierLink;

	// Initialization
	public FindRatesCarriers() {
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
	}

	// This will fill the find rate fields and click on find rates button & Create
	// Button
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
		;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pieces.clear();
		Pieces.sendKeys("11");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pallet.clear();
		Pallet.sendKeys("11");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Weight.clear();
		Weight.sendKeys("100");
		Length.clear();
		Length.sendKeys("11");

		Height.clear();

		Height.sendKeys("11");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRatesButton.click();
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void DiscountedPriceDetails() {
		DiscountedPrice.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//div[@class='body-fixed']//div[@data-bind=\"'if': activeSection() == 'carrierCharges'\"]//div//h2[contains(text(),'SEARCH CRITERIA')]")).getText();
		String expected = "SEARCH CRITERIA";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver,"Verify Discounted Price Details");
	}
	
	public void CarrierDetails() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Back.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CarrierLink.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
