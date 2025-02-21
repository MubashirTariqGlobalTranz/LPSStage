package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import GTZTransportation.gtz.BaseClass;

public class LPS_InboundRouting extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='Inbound Routing Guides']")
	WebElement InboundRouting;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_podWBY1_grid_linkVICS_9']")
	WebElement Qualitech;

	@FindBy(xpath = "//span[normalize-space()='WOODBURY 1']")
	WebElement WoodBury;

	@FindBy(xpath = "//span[normalize-space()='ENERGY']")
	WebElement Energy;
	// Initialization
	public LPS_InboundRouting() {
		PageFactory.initElements(driver, this);
	}

	// This will open Claim list
	public void InboundRouting()

	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		InboundRouting.click();
	}

	
	public void InboundRoutingPage() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String actual = driver.findElement(By.xpath("//span[normalize-space()='WOODBURY 1']")).getText();
		String expected = "WOODBURY 1";
		Assert.assertEquals(actual, expected);

	}

	
	

}
