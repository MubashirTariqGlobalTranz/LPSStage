package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class VICS_VerifyBOLCreation extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
	WebElement VICS;

	@FindBy(xpath = "//*[text()='2']")
	WebElement PageNo;

	@FindBy(xpath = "//a[contains(@href,'/Client/Search.aspx?__eqs=O3KiBkncpoqSybBtJzgMEtSckYl229n91pohvz4NIAMb+HBbRVOcUkOy7blnAlZ4ulcukt6vAYEJ62bXcoAuAHQYvzKtB9QFiNYdYE1WyqEMh1FrtzCLjeYasVCMmVvOhbHswGPgxKYVN01XlJFygTUvJCapaCcZBRKHRxZDW/5nOgx+GAhQdq1S2n1tuvL9sWw6TFDG6HYn2rps4RH75CQCZ1iHIWBz1lho3B1nXbI=') and text()='search']")
	WebElement ConEdison;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtPurchaseOrderNumber")
	WebElement PO;

	@FindBy(id = "ctl00_ContentPlaceHolder1_dateRequiredDeliveryDate_txtDate")
	WebElement DeliveryDate;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtOrigin")
	WebElement Origin;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtDestination")
	WebElement Destination;

	@FindBy(id = "ctl00_ContentPlaceHolder1_requestItems_repeater_ctl00_intWeight")
	WebElement Weight;

	@FindBy(id = "ctl00_ContentPlaceHolder1_requestItems_repeater_ctl00_intPallets")
	WebElement Pallets;

	@FindBy(id = "ctl00_ContentPlaceHolder1_requestItems_repeater_ctl00_intPieces")
	WebElement Pieces;

	@FindBy(id = "ctl00_ContentPlaceHolder1_TxtDeclaredValue")
	WebElement DeclaredValue;

	@FindBy(id = "ctl00_ContentPlaceHolder1_Submit")
	WebElement Submit;

	@FindBy(id = "ctl00_ContentPlaceHolder1_LtlGrid_ctl02_btnBillOfLading")
	WebElement Create;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtFromName")
	WebElement ShipFromName;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtFromAddress1")
	WebElement ShipFromAddress;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtFromPhone")
	WebElement ShipFromPhoneNo;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtShipperReferenceNumber")
	WebElement ShipFromRefNo;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtToName")
	WebElement ShipToName;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtToAddress1")
	WebElement ShipToAddress;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtToPhone")
	WebElement ShipToPhoneNo;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtToContactLast")
	WebElement ContactLastName;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtToContactFirst")
	WebElement ContactFirstName;

	@FindBy(id = "ctl00_ContentPlaceHolder1_gridRequestItems_ctl02_txtDescription")
	WebElement Description;

	@FindBy(id = "ctl00_ContentPlaceHolder1_btnGenerate")
	WebElement Generate;

	@FindBy(id = "ctl00_ContentPlaceHolder1_btnGenerate")
	WebElement DownloadPDF;

	// Initialization
	public VICS_VerifyBOLCreation() {
		PageFactory.initElements(driver, this);
	}

	// This will open VICS Application & Handle browser to select on Next
	// Tab
	public void VICSTab() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='VICS']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//*[text()='Customers']")).click();

	}

	// This will Open Shipment criteria form and fill the required fields
	public void VICS_ShipmentCriteria() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// PageNo.click();
		driver.get(
				"http://vics-stage.keyship.net/Client/Search.aspx?__eqs=O3KiBkncpoqSybBtJzgMEtSckYl229n91pohvz4NIAMb+HBbRVOcUkOy7blnAlZ4ulcukt6vAYEJ62bXcoAuAHQYvzKtB9QFiNYdYE1WyqEMh1FrtzCLjeYasVCMmVvOSfrxbyfafMFldhxvoL5efCa2TEodn1ndn0VpGo4sMB9iCzqrnG6SA/IIuIp6rewiG5aYM7ETj4XBG/ruxv1rpJHKKqL9dUfCDEim+Pnl2vA=");
		PO.sendKeys("2233356");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		DeliveryDate.sendKeys(formattedDate);

		Origin.sendKeys("30303");
		Destination.sendKeys("30303");
		Weight.clear();
		Weight.sendKeys("1");
		Pallets.clear();
		Pallets.sendKeys("1");
		Pieces.clear();
		Pieces.sendKeys("1");
		DeclaredValue.sendKeys("100");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Submit.click();
	}

	// This will click on create button for shipment Recommendations
	public void VICS_ShipmentRecommendations() {

		Create.click();

	}

	// On this step, to create BOL, all required fields will be filled out and click
	// on generate BOL along with pdf download
	public void VICS_BOLCreation() {
		ShipFromName.sendKeys("Test Name Ship From");
		ShipFromAddress.sendKeys("Test Address Ship From");
		ShipFromPhoneNo.sendKeys("9101231234");
		ShipFromRefNo.sendKeys("1234567");

		ShipToName.sendKeys("Test Name Ship To");
		ShipToAddress.sendKeys("Test Address Ship To");
		ShipToPhoneNo.sendKeys("9101231234");
		ContactLastName.sendKeys("Last Name");
		ContactFirstName.sendKeys("First Name");
		Description.sendKeys("Vics Testing & BOL Creation");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Generate.click();

		// This will get the text on successful BOL Creation, Confirmation Message
		WebElement K = driver.findElement(By.className("confirm"));
		String Confirm = K.getText();
		System.out.println(Confirm);

		// to download Pdf
		DownloadPDF.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}