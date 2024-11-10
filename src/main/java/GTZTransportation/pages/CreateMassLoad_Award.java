package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateMassLoad_Award extends BaseClass {

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

	// initialization
	public CreateMassLoad_Award() {
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
		SourceLPS.sendKeys("LPS-230120-151152");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadCount.clear();
		LoadCount.sendKeys("2");
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
		WebElement K = driver.findElement(By.className("info-validation"));
		String kt = K.getText();
		System.out.println(kt);

	}
}
