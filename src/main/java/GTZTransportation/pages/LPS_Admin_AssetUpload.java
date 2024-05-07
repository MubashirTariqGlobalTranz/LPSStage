package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_AssetUpload extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSubmit']")
	WebElement Upload;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtDataEntryShipmentId']")
	WebElement DataEntryShipment;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnLoad']")
	WebElement LoadDataEntryShipment;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtName']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
	WebElement Save;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
	WebElement FilterExpand;

	// Initialization
	public LPS_Admin_AssetUpload() {
		PageFactory.initElements(driver, this);
	}

	// This will open Admin & AssetUplaod
	public void Admin()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Admin.click();

		// Find the "Asset upload" link
		WebElement actionEventsLink = driver
				.findElement(By.xpath("//a[@href='/Admin/AssetUpload.aspx']"));

		// Use JavaScript to click on the "Asset upload" link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
	}

	// This will open asset upload
	public void AssetUpload() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Upload.click();
		
		//captureScreenShot(driver, "Verify Asset upload");

	}

	
}
