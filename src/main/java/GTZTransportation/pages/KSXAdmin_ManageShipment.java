package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageShipment extends BaseClass {

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[12]/a")
    WebElement FreightPayment;

    @FindBy(id = "ctl00_MainContentHolder_btnFilter")
    WebElement Filter;

    @FindBy(id = "ctl00_MainContentHolder_txtSearchTerm")
    WebElement Search;

    @FindBy(id = "ctl00_MainContentHolder_btnClearFilter")
    WebElement Clear;

    @FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select[1]/option[3]")
    WebElement SortBy;

    @FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/select/option[3]")
    WebElement CustomerRouted;

    @FindBy(xpath = "/html/body/form/div[3]/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select/option[2]")
    WebElement Team;

    @FindBy(xpath = "//*[text()=' Back to Queue']")
    WebElement Back;

    @FindBy(xpath = "/html/body/form/div[3]/div[4]/div/div[2]/div[2]/div/div[2]/div/div[2]/table/tbody/tr[3]/td/input")
    WebElement CarrierSearch;

    @FindBy(id = "Dispatched")
    WebElement Dispatch;

    @FindBy(id = "InTransit")
    WebElement InTransit;

    @FindBy(id = "Delivered")
    WebElement Delivered;

    @FindBy(id = "Exception")
    WebElement Exception;

    @FindBy(id = "All")
    WebElement All;

    @FindBy(xpath = "//*[text()='Customers']")
    WebElement Customer;

    @FindBy(xpath = "//*[text()='Carriers']")
    WebElement Carriers;

    @FindBy(id = "ctl00_MainContentHolder_btnExport")
    WebElement Export;

    @FindBy(id = "ctl00_MainContentHolder_linkBillOfLadingSearch")
    WebElement AdvanceSearch;

    @FindBy(id = "ctl00_MainContentHolder_txtSearchTerm")
    WebElement SearchTerm;

    @FindBy(id = "ctl00_MainContentHolder_btnSearch")
    WebElement SearchClick;

    // Constructor for PageFactory initialization
    public KSXAdmin_ManageShipment() {
        PageFactory.initElements(driver, this);
    }

    private void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void KSXAdminTab() {
        System.out.println("Navigating to KSX Admin tab...");
        String currentWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[text()='KSX Admin']")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println("Switched to KSX Admin window.");

        driver.findElement(By.xpath("//*[text()='Manage Shipments']")).click();
        System.out.println("Navigated to Manage Shipments.");
    }

    public void KSXAdmin_ManageShipmentSearch() {
        System.out.println("Starting Manage Shipment Search...");
        waitFor(3000);
        Filter.click();
        System.out.println("Clicked Filter button.");
        captureScreenShot(driver, "Verify Records are showing on KSX Admin");
        waitFor(3000);

        Team.click();
        System.out.println("Selected Team.");
        waitFor(3000);

        Filter.click();
        System.out.println("Clicked Filter again.");
        waitFor(3000);

        Clear.click();
        System.out.println("Cleared search.");
        waitFor(3000);

        Search.sendKeys("918187670");
        System.out.println("Entered search term.");
        waitFor(3000);

        Filter.click();
        System.out.println("Clicked Filter after search.");
        captureScreenShot(driver, "Verify Records For Search_KSX Admin");
        Clear.click();
        waitFor(3000);

        SortBy.click();
        System.out.println("Sorted by option.");
        waitFor(3000);

        Filter.click();
        Clear.click();
        waitFor(3000);

        CustomerRouted.click();
        System.out.println("Clicked Customer Routed.");
        Filter.click();
        captureScreenShot(driver, "Verify Records For CustomerRouted_KSX Admin");

        System.out.println("Manage Shipment Search Completed.");
    }

    public void KSXAdmin_ManageShipmentTab() {
        System.out.println("Navigating through Shipment Tabs...");
        Dispatch.click();
        System.out.println("Clicked Dispatch.");
        waitFor(1000);

        InTransit.click();
        System.out.println("Clicked In Transit.");
        waitFor(1000);

        Delivered.click();
        System.out.println("Clicked Delivered.");
        waitFor(1000);

        Exception.click();
        System.out.println("Clicked Exception.");
        waitFor(1000);

        All.click();
        System.out.println("Clicked All.");
        
        String actual4 = driver.findElement(By.id("All")).getText();
        String expected4 = "All";
        Assert.assertEquals(actual4, expected4);
        System.out.println("Tab is opened: " + actual4);
    }

    public void KSXAdmin_ManageShipmentContextFilter() {
        System.out.println("Opening Context Filters...");
        waitFor(3000);
        Customer.click();
        System.out.println("Clicked Customer filter.");
        waitFor(3000);
        
        Carriers.click();
        System.out.println("Clicked Carriers filter.");

        String actual3 = driver.findElement(By.xpath("//*[text()='Carriers']")).getText();
        String expected3 = "Carriers";
        Assert.assertEquals(actual3, expected3);
        System.out.println("Context Filter is opened: " + actual3);
    }

    public void KSXAdmin_ManageShipmentExport() {
        System.out.println("Exporting shipment data...");
        Export.click();
    }

    public void KSXAdmin_ManageShipmentAdvanceSearch() {
        System.out.println("Performing Advanced Search...");
        AdvanceSearch.click();
        System.out.println("Clicked Advanced Search.");
        
        SearchTerm.sendKeys("Test");
        System.out.println("Entered Search Term: Test");
        
        SearchClick.click();
        System.out.println("Clicked Search.");
        
        captureScreenShot(driver, "Verify Advance Search for Manage Shipments");
        waitFor(2000);
    }
}
