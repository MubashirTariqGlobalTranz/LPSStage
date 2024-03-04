package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

public class LoadBoard_Search_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//a[normalize-space()='All']")
	WebElement All;

	@FindBy(xpath = "//a[normalize-space()='Open']")
	WebElement Open;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
	WebElement Filter;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnClear']")
	WebElement Clear;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnRefresh']")
	WebElement FilterButton;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCarrier_txtCarrier")
	WebElement Carrier;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtSearchNumber")
	WebElement LoadSearch;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_ddlLoadOwner")
	WebElement LoadOwner;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtOriginName")
	WebElement Origin;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtDestinationName")
	WebElement Destination;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_ddlCreatedBy")
	WebElement CreatedBy;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_ddlBusinessUnit")
	WebElement BusinessUnit;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
	WebElement Exception;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnCollapse")
	WebElement FilterCollapse;

	// initialization
	public LoadBoard_Search_SpotQuote() {
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

	// This will click on load Board All & Filtered records
	public void All_LoadBoard() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filter.click();
		//All.click();
//It will search on basis of Customer field & Get screenshot
		//Filter.click();
		Clear.click();
		Exception.click();
		Customer.sendKeys("Armacell LLC");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Customer");

		// It will search on basis of Carrier field & Get screenshot
		Clear.click();
		//Filter.click();
		FilterButton.click();
		All.click();
		Carrier.sendKeys("FedEx Freight Economy (1485)");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Carrier");

		// It will search on basis of Load No & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		LoadSearch.sendKeys("LPS-231201-082733");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - LPSNo");

		//// It will search on basis of Load Owner & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		LoadOwner.sendKeys("mubashir.tariq@shiplps.com");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Load Owner");

		// It will search on basis of Origin field & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		Origin.sendKeys("Golden Services, LLC");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Origin");

		// It will search on basis of Destination field & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		Destination.sendKeys("REFRIGERATION SUPPLIES");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Destination");

		// It will search on basis of Created By & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		CreatedBy.sendKeys("mubashir.tariq@shiplps.com");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - CreatedBy");

		// It will search on basis of Business Unit & Get screenshot
		Clear.click();
		FilterButton.click();
		All.click();
		BusinessUnit.sendKeys("IntegratedLogistics");
		FilterButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Search - Business Unit");

	}

}
