package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LoadBoard_SpotQuote extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "//a[normalize-space()='All']")
	WebElement All;

	@FindBy(xpath = "//a[normalize-space()='New']")
	WebElement New;

	@FindBy(xpath = "//a[normalize-space()='Open']")
	WebElement Open;

	@FindBy(xpath = "//a[normalize-space()='Awarded']")
	WebElement Awarded;

	@FindBy(xpath = "//a[normalize-space()='In Transit']")
	WebElement InTransit;

	@FindBy(xpath = "//a[normalize-space()='Delivered']")
	WebElement Delivered;

	@FindBy(xpath = "//a[normalize-space()='Completed']")
	WebElement Completed;

	@FindBy(xpath = "//a[normalize-space()='Cancelled']")
	WebElement Cancelled;

	@FindBy(xpath = "//a[normalize-space()='Actions']")
	WebElement Actions;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
	WebElement Filter;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnClear']")
	WebElement Clear;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnRefresh']")
	WebElement FilterButton;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnCollapse")
	WebElement FilterCollapse;
	@FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
	WebElement Exception;
	@FindBy(id = "ContentPlaceHolder1_containerFilter_cboLoadCreatedRange")
	WebElement LoadCreated;

	// initialization
	public LoadBoard_SpotQuote() {
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
		FilterButton.click();
		All.click();

		//Filter.click();
		//Clear.click();
		Customer.sendKeys("Armacell LLC");
		Exception.click();
		FilterButton.click();
		All.click();
		FilterCollapse.click();
		// Assertion
		String actual = driver.findElement(By.xpath("//a[normalize-space()='All']")).getText();
		String expected = "All";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - All");
	}

	// It will open Load Board New Tab
	public void New_LoadBoard() {
		New.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='New']")).getText();
		String expected = "New";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - New");
		Filter.click();
		Exception.click();
		LoadCreated.sendKeys("All");
		FilterButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterCollapse.click();

	}

	// It will open Load board New Tab
	public void Open_LoadBoard() {
		Open.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Open']")).getText();
		String expected = "Open";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Open");
	}

	// It will open Load board Awarded Tab
	public void Awarded_LoadBoard() {
		Awarded.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Awarded']")).getText();
		String expected = "Awarded";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Awarded");
	}

	// It will open Load board In transit Tab
	public void InTransit_LoadBoard() {
		InTransit.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='In Transit']")).getText();
		String expected = "In Transit";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - In Transit");
	}

	// It will open Load board Delivered Tab
	public void Delivered_LoadBoard() {
		Delivered.click();
		Filter.click();
		Clear.click();
		FilterButton.click();
		Delivered.click();
		Exception.click();
		//Filter.click();
		//Delivered.click();
		FilterButton.click();
		FilterCollapse.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Delivered']")).getText();
		String expected = "Delivered";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Delivered");
	}

	// It will open Load board Completed Tab
	public void Completed_LoadBoard() {
		Completed.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Completed']")).getText();
		String expected = "Completed";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Completed");
	}

	// It will open Load board Cancelled Tab
	public void Cancelled_LoadBoard() {
		Cancelled.click();
		// Assertion & Screenshot
		String actual = driver.findElement(By.xpath("//a[normalize-space()='Cancelled']")).getText();
		String expected = "Cancelled";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Load Board - Cancelled");
	}

	// It will open Load board Action Tab
	public void Action_LoadBoard() {
		Actions.click();

	}
}
