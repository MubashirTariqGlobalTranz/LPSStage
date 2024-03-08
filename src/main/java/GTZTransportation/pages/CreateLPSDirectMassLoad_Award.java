package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateLPSDirectMassLoad_Award extends BaseClass {

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

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/input[1]")
	WebElement LoadNo;

	@FindBy(id = "ContentPlaceHolder1_ExecuteAdhoc_inputParameterBid")
	WebElement BidAmount;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[3]/table[2]/tbody[1]/tr[3]/td[1]/input[1]")
	WebElement Submit;

	// initialization
	public CreateLPSDirectMassLoad_Award() {
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
		SourceLPS.sendKeys("LPS-240308-124342");
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

		PickUpWindow.sendKeys("4/11/2023");

		DeliveryWindow.sendKeys("4/11/2023");
		Create.click();
		WebElement K = driver.findElement(By.className("info-validation"));
		String kt = K.getText();
		System.out.println("Original text: " + kt);

		// Removing the specified text
		String textToRemove = "The following loads were successfully created: ";
		String newKt = kt.replace(textToRemove, "");

		System.out.println("Text after removal: " + newKt);
// redirecting to Adhoc tool
		driver.get(
				"https://my-stage.shiplps.com/Adhoc/Execute.aspx?__eqs=LE0uyRpumz8%2fkIx2NETZUIIM1Ed6homYPWEW%2f5bWeRE18Yy5AYYOa5+U3OU5B0Kv5up%2febWoOzQWrAz+OyWBMk2e8tw%2fN3SaWC592aKOVXmSrNWCTRPaLncNlJlmsPC4HRudezU8Cx+GgADX2r4eKg%3d%3d");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadNo.sendKeys(newKt);
		BidAmount.sendKeys("10");
		Submit.click();
		driver.switchTo().alert().accept();

	}
}
