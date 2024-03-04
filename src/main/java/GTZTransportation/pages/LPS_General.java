package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class LPS_General extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='L']")
	WebElement Length;

	@FindBy(xpath = "//input[@placeholder='W']")
	WebElement Width;

	@FindBy(xpath = "//input[@placeholder='H']")
	WebElement Height;

	@FindBy(xpath = "//input[@placeholder='LBS']")
	WebElement LBS;

	@FindBy(xpath = "//strong[normalize-space()='Glossary']")
	WebElement Glossay;

	@FindBy(xpath = "//strong[normalize-space()='Inbound Routing Guides']")
	WebElement RoutingGuides;

	@FindBy(xpath = "//strong[normalize-space()='Prospects']")
	WebElement Prospects;

	@FindBy(xpath = "//a[@title='Profile']")
	WebElement Profile;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetials_btnSave']")
	WebElement SaveProfile;

	@FindBy(xpath = "//a[@title='My Team']")
	WebElement MyTeam;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement Reports;

	@FindBy(xpath = "//span[normalize-space()='Data Entry']")
	WebElement DataEntry;

	@FindBy(xpath = "//span[normalize-space()='Resources']")
	WebElement Resources;

	@FindBy(xpath = "//span[normalize-space()='Home']")
	WebElement Home;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_0']")
	WebElement MissingCustomer;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_1']")
	WebElement MissingCarrier;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_2']")
	WebElement Audit;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_3']")
	WebElement Duplicate;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_4']")
	WebElement Verification;

	@FindBy(xpath = "//div[@class='tool-container']//a[text()='GTZmanage']")
	WebElement GTZManage;

	// initialization
	public LPS_General() {
		PageFactory.initElements(driver, this);
	}

	// This will calculate density
	public void LPS_Density_Calculator() {

		Length.sendKeys("10");
		Width.sendKeys("10");
		Height.sendKeys("10");
		LBS.sendKeys("10");
// Assertion 
		String actual = driver.findElement(By.xpath("//div[contains(text(),'=')]")).getText();
		String expected = "17.28";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify LPSDensityCalculator");

	}

	// Load will be create
	public void LPS_Glossay() {
		Glossay.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
// assertion
		String actual = driver.findElement(By.xpath("//a[@name='a']")).getText();
		String expected = "A";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify LPS_Glossay");
		Home.click();
	}

	public void LPS_RoutingGuides() {
		RoutingGuides.click();
// assertion 
		String actual = driver.findElement(By.xpath("//span[normalize-space()='WOODBURY 1']")).getText();
		String expected = "WOODBURY 1";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify LPS_RoutingGuides");
		Home.click();
	}

	public void LPS_Prospects() {
		Prospects.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Prospect']")).getText();
		String expected = "Prospect";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify LPS_Prospect");
		Home.click();

	}

	public void LPS_MyProfile() {
		Profile.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SaveProfile.click();
		String actual = driver.findElement(By.xpath("//h1[normalize-space()='Profile']")).getText();
		String expected = "Profile";
		Assert.assertEquals(actual, expected);
		captureScreenShot(driver, "Verify LPS_My Profile");

	}

	public void LPS_MyTeam() {
		MyTeam.click();
		captureScreenShot(driver, "Verify LPS_My Team");

	}

	public void LPS_DataEntry() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataEntry.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureScreenShot(driver, "Verify LPS_Data Entry");
	}

	public void LPS_Resources() {
		Resources.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h1[@class='underline']")).getText();
		String expected = "Resources";

		Assert.assertEquals(actual, expected);

		captureScreenShot(driver, "LPS Resources");
	}

	public void Queue_Summary_MissingCustomerInfo() {
		Home.click();
		// MissingCustomer.click();

		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_ctl01_ctl04_grid_link_0']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.findElement(By.xpath("//h2[normalize-space()='Missing Customer Info']")).getText();
		String expected = "Missing Customer Info";

		Assert.assertEquals(actual, expected);

		captureScreenShot(driver, "Verify Home Queue - Missing Customer Info");

	}

}
