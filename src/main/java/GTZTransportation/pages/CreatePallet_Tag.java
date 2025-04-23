package GTZTransportation.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class CreatePallet_Tag extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//span[normalize-space()='Create Load']")
	WebElement createLoadPage;

	@FindBy(xpath = "//span[normalize-space()='Pallet Tags']")
	WebElement PalletTags;

	@FindBy(xpath = "//input[@placeholder='Load Reference Number']")
	WebElement Loadno;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "//input[@data-bind=\"value:poNumber,watermark: 'PO #'\"]")
	WebElement PO;

	@FindBy(xpath = "//input[@placeholder='SO #']")
	WebElement SO;

	@FindBy(xpath = "//input[@placeholder='Description']")
	WebElement Description;

	@FindBy(xpath = "//button[normalize-space()='Generate Pallet Tags']")
	WebElement Generate;

	@FindBy(xpath = "//a[@class='big_link']")
	WebElement Download;

	// initialization
	public CreatePallet_Tag() {
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
	public void Pallet_Tag() {

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
		PalletTags.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Loadno.sendKeys("LPS-230120-151152");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Search.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PO.sendKeys("123");
		SO.sendKeys("123");
		Description.sendKeys("Test");
		Generate.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// After load will be Created, this will compare the text and test will
		// pass/fail accordingly
		String actual = driver.findElement(By.xpath("//th[normalize-space()='Download']")).getText();
		String expected = "Download";
		assertTrue(actual.contains(expected));
		captureScreenShot(driver, "Verify Pallet Tag");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Pallet_TagPDF() {
		Download.click();
		String currentWindowHandle = driver.getWindowHandle();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Wait until URL contains “Pallet”
			driver.getCurrentUrl().contains("Pallet");

			// Assert
			String currentUrl = driver.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("Pallet"), "Expected URL to contain 'Pallet' but was: " + currentUrl);
			captureScreenShot(driver, "Verify_Pallet_PDF_URL");
		}
	}
}
