package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class VICS_VeiwOrders extends BaseClass {

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
	
	@FindBy(xpath = "//tbody/tr[15]/td[5]/a[1]")
	WebElement ViewOrders;

	
	// Initialization
	public VICS_VeiwOrders() {
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
	public void VICS_App() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PageNo.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ViewOrders.click();
		//driver.get("http://vics-stage.keyship.net/Client/History.aspx?__eqs=GIAnrvUT1Y+7JCvSkeClXdAXPyy350Bo79FEMfuyZaD3lMRst64X6qfwC0cxBwcCUQOvWojZb1Rq47mpuQxeUOpTwFKXDK4JjDHjTRSXvT79WCKNlcujPWaGs0j1wmFiinfprJcNeP0iR5Fi1E0FmHG3Z8aTjCkzhEQXACeTx1+nVHIf4UssRh3dsQ7N1qWKSAecc2IooXRsNjboMX9rfJBvYADPPv6bxZL8yFQzBCw=");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}