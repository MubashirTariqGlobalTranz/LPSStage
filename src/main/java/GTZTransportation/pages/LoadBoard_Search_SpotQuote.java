package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

public class LoadBoard_Search_SpotQuote extends BaseClass {

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

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer']")
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

    // Constructor to initialize elements
    public LoadBoard_Search_SpotQuote() {
        PageFactory.initElements(driver, this);
    }

    // Helper method to pause execution
    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            e.printStackTrace();
        }
    }

    // Opens Spot Quote system
    public void openSpotQuote() {
        sleep(5000);
        SpotQuote.click();
    }

    // Clicks on Load Board All and applies filters
    public void All_LoadBoard() {
        sleep(3000);
        Filter.click();
        Clear.click();
        sleep(2000);
        Exception.click();
        sleep(2000);
        performSearch(Customer, "Armacell LLC", "Verify Search - Customer");

        performSearch(Carrier, "FedEx Freight Economy (1485)", "Verify Search - Carrier");
        performSearch(LoadSearch, "LPS-231201-082733", "Verify Search - LPSNo");
        performSearch(LoadOwner, "mubashir.tariq@shiplps.com", "Verify Search - Load Owner");
        performSearch(Origin, "Golden Services, LLC", "Verify Search - Origin");
        performSearch(Destination, "REFRIGERATION SUPPLIES", "Verify Search - Destination");
        performSearch(CreatedBy, "mubashir.tariq@shiplps.com", "Verify Search - CreatedBy");
        performSearch(BusinessUnit, "IntegratedLogistics", "Verify Search - Business Unit");
    }

    // Common method for performing searches and taking screenshots
    private void performSearch(WebElement element, String value, String screenshotName) {
        Clear.click();
        sleep(2000);
        FilterButton.click();
        sleep(2000);
        All.click();
        sleep(2000);
        element.sendKeys(value);
        FilterButton.click();
        sleep(2000);
        scrollToBottom();
        captureScreenShot(driver, screenshotName);
    }

    // Scroll to the bottom of the page
    private void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
