package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class FindRates_CopyLoad extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Find freight rates']")
	WebElement FindRates;

	@FindBy(xpath = "//span[normalize-space()='History']")
	WebElement History;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement Filter;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
	WebElement FilterExp;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_container_grid_linkCopy_24']")
	WebElement copy;
	@FindBy(xpath = "//button[@class='btn btn-large btn-primary']")
	WebElement FindRatesbutton;

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

	// Initialization
	public FindRates_CopyLoad() {
		PageFactory.initElements(driver, this);
	}

	// This will open Find Rate & History Application
	public void openFindRatesHistory()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FindRates.click();
		History.click();
		FilterExp.click();
		Filter.click();
		captureScreenShot(driver, "Verify Find Rate History");
		copy.click();
		String currentWindowHandle = driver.getWindowHandle();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void CopyLoad() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FindRatesbutton.click();
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
	}

}
