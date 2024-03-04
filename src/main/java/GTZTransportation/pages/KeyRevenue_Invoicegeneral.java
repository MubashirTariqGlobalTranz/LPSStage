package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Invoicegeneral extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//*[text()='Invoice']")
	WebElement Invoice;

	@FindBy(xpath = "//span[normalize-space()='Billables']")
	WebElement Billables;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[6]/a[1]")
	WebElement BillableDescription;

	@FindBy(xpath = "//span[normalize-space()='Payments']")
	WebElement Payments;

	@FindBy(xpath = "//span[normalize-space()='File Review']")
	WebElement FileReview;

	@FindBy(xpath = "//input[@data-bind='checked: $root.filterVerified']")
	WebElement HideVerified;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement Search;
	
	@FindBy(xpath = "//span[normalize-space()='Shipments']")
	WebElement Shipments;
	
	@FindBy(id = "ContentPlaceHolder1_containerFilter_chkHasMyComments")
	WebElement MyComment;
	
	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement FilterButton;

	// Initialization
	public KeyRevenue_Invoicegeneral() {
		PageFactory.initElements(driver, this);
	}

	// This will open Key Revenue Application & Handle browser to select on Next

	public void keyRevenueGTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KeyRevenue']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//span[normalize-space()='Invoice']")).click();

	}

	// This will open billables
	public void Invoice_Billable() {

		Billables.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Billable invoices");

		BillableDescription.click();
		captureScreenShot(driver, "Verify Billable Details");
	}

// open invoice payment
	public void Invoice_Payment() {

		Payments.click();
		captureScreenShot(driver, "Verify Invoice Payment");

	}

// open file review
	public void Invoice_FileReview() {
		FileReview.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HideVerified.click();
		Search.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify invoice file review");
		//assertion
		String actual = driver.findElement(By.xpath("//th[contains(text(),'File Name')]")).getText();
		String expected = "File Name";
		Assert.assertEquals(actual, expected);
	}
	public void Shipments() {
		Shipments.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyComment.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		captureScreenShot(driver, "Verify Shipments for Key Revenue");
	}
}