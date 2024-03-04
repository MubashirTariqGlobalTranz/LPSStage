package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class FreightPayment_GTZ_Links extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Pay Bills']")
	WebElement FreightPayment;

	@FindBy(xpath = "//span[normalize-space()='GTZ']")
	WebElement GTZ;

	@FindBy(xpath = "//a[normalize-space()='Budget Tool']")
	WebElement BudgetTool;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	WebElement EditFinan;

	@FindBy(xpath = "//a[normalize-space()='Customers']")
	WebElement Customer;

	@FindBy(xpath = "//a[normalize-space()='Users']")
	WebElement Users;
	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_txtFilterUserID']")
	WebElement UserID;
	@FindBy(xpath = "//input[@id='MainContentHolder_containerFilter_btnFilter']")
	WebElement Filter;
	@FindBy(xpath = "//tbody/tr[@align='center']/td[5]/a[1]")
	WebElement Edit;
	@FindBy(xpath = "//input[@id='MainContentHolder_btnSendReminder']")
	WebElement ResetEmail;

	@FindBy(xpath = "//a[normalize-space()='Welcome Email']")
	WebElement WelocmeEmail;

	@FindBy(xpath = "//a[normalize-space()='Invalid Bank Accounts']")
	WebElement InvalidBank;

	@FindBy(xpath = "//a[normalize-space()='Payment File Details']")
	WebElement PaymentFile;

	@FindBy(xpath = "//a[normalize-space()='Payment Remittance Contacts']")
	WebElement PaymentRemittance;

	@FindBy(xpath = "//a[normalize-space()='Mass Batch Tool']")
	WebElement MassBatchTool;

	// Initialization
	public FreightPayment_GTZ_Links() {
		PageFactory.initElements(driver, this);
	}

	// This will open Account Payable Application & Handle browser to select on Next
	// Tab
	public void GTZ() {
		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//span[normalize-space()='GTZ']")).click();

	}

	// This will Open import
	public void BudgetTool() {
		BudgetTool.click();
		captureScreenShot(driver, "Verify Freight Payment_ BudgetTool");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditFinan.click();
		String actual = driver.findElement(By.xpath("//button[@class='ml10 mt15 btn btn-small btn-primary']"))
				.getText();
		String expected = "Back to Budgets";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ BudgetToolFinancials");

	}

	public void Customer() {
		GTZ.click();
		Customer.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Customers']")).getText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Customers");

	}

	public void Users() {
		GTZ.click();
		Users.click();
		UserID.sendKeys("mubashir.tariq@shiplps.com");
		Filter.click();
		Edit.click();
		ResetEmail.click();
		driver.switchTo().alert().accept();
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Password Reset Email']")).getText();
		String expected = "Password Reset Email";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Users");

	}

	public void WelocmeEmail() {
		GTZ.click();
		WelocmeEmail.click();

		String actual = driver.findElement(By.xpath("//th[normalize-space()='Email Address']")).getText();
		String expected = "Email Address";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ WelocmeEmail");

	}

	public void InvalidBankAccounts() {
		GTZ.click();
		InvalidBank.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Invalid Shipment Bank Accounts']"))
				.getText();
		String expected = "Invalid Shipment Bank Accounts";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ Invalid Shipment Bank Accounts");

	}

	public void PaymentFileDetails() {
		GTZ.click();
		PaymentFile.click();

		String actual = driver.findElement(By.xpath("//a[normalize-space()='Report']")).getText();
		String expected = "Report";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ PaymentFile");

	}

	public void PaymentRemittanceContacts() {
		GTZ.click();
		PaymentRemittance.click();

		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Payment Remittance Contacts']")).getText();
		String expected = "Payment Remittance Contacts";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Payment_ PaymentRemittanceContacts");

	}

	public void MassBatchTool() {
		GTZ.click();
		MassBatchTool.click();

		String actual = driver.findElement(By.xpath("//h1[normalize-space()='Mass Batch Tool']")).getText();
		String expected = "Mass Batch Tool";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify Freight Mass Batch Tool");

	}
}
