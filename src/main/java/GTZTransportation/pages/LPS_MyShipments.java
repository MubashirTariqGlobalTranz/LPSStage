package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LPS_MyShipments extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='My Shipments']")
	WebElement MyShipments;

	@FindBy(id = "ctl00_ContentPlaceHolder1_pickupRange_ctl03_txtDate")
	WebElement PickupDate;

	@FindBy(xpath = "//button[@class='btn btn-medium btn-primary']")
	WebElement Filter;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	WebElement ShipmentNo;

	@FindBy(xpath = "//a[normalize-space()='Details']")
	WebElement Details;

	@FindBy(xpath = "//a[normalize-space()='Items']")
	WebElement Items;

	@FindBy(xpath = "//a[normalize-space()='Accessorials']")
	WebElement Accessorials;

	@FindBy(xpath = "//a[normalize-space()='Stops']")
	WebElement Stops;

	@FindBy(xpath = "//a[normalize-space()='Documents']")
	WebElement Documents;

	@FindBy(xpath = "//a[normalize-space()='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//a[normalize-space()='Tracking']")
	WebElement Tracking;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Back;

	// Initialization
	public LPS_MyShipments() {
		PageFactory.initElements(driver, this);
	}

	// This will open My Shipments Application
	public void openMyShipments()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MyShipments.click();
	}

	// This will Search the Shipments & show
	public void SearchShipments() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PickupDate.clear();
		PickupDate.sendKeys("11/26/2021");
		Filter.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments");

	}

	// This will click on Shipment & open all the details
	public void ShipmentsDetails() {
		ShipmentNo.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Details");

		// Items Details
		Items.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Items");

		// Accessorials Details
		Accessorials.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Accessorials");

		// Stop Details
		Stops.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Stops");

		// Document Details
		Documents.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Documents");

		// Comment Details
		Comments.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Comments");

		// Tracking Details
		Tracking.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify My Shipments Tracking");

		Back.click();

	}

}
