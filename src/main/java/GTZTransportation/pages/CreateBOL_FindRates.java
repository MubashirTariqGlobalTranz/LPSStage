package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateBOL_FindRates extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[4]/a")
	WebElement FindRates;

	@FindBy(id = "OriginZip")
	WebElement Origin;

	@FindBy(id = "DestinationZip")
	WebElement Destination;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[2]/input")
	WebElement Pieces;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[3]/input")
	WebElement Pallet;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[4]/input")
	WebElement Weight;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[5]/input[2]")
	WebElement Length;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[5]/input[2]")
	WebElement Width;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[10]/div/div[2]/table/tbody/tr[2]/td[5]/input[3]")
	WebElement Height;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[1]/div[16]/button")
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
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("/html/body/form/div[3]/div[3]/div/div[1]/div[20]/div/div[2]/table/tbody/tr[2]/td[6]/a[1]"))
				.click();
		
	}

	// This will create BOL against selected carrier
	public void CreateBOL() {
		Description.sendKeys("Mubashir");
		CompanyName.sendKeys("Test Name");
		Address.sendKeys("Test Address");
		BOLCreate.click();
	}
	

}
