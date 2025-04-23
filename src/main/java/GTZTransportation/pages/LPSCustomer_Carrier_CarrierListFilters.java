package GTZTransportation.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;
import GTZTransportation.gtz.BaseClass;

public class LPSCustomer_Carrier_CarrierListFilters extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='Client Admin']")
    WebElement ClientAdmin;

    @FindBy(xpath = "//a[@id='ctl00_TopHeader_linkCarrierListCryptoHeader']")
    WebElement Carrier;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_txtCarrierName")
    WebElement SearchCarrier;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_carrierMcNumber")
    WebElement McNumber;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_btnSearch")
    WebElement SearchButton;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_btnClear")
    WebElement ClearAll;

    @FindBy(id = "ctl00_MainContentHolder_container_grid_ctl02_linkDetails")
    WebElement CarrierId;

    @FindBy(id = "ctl00_MainContentHolder_container_btnSave")
    WebElement Save;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_carrierDotNumber")
    WebElement DotNumber;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_carrierScacCode")
    WebElement SCAC;

    @FindBy(id = "ctl00_MainContentHolder_containerFilter_carrierActive")
    WebElement Active;

    @FindBy(id = "ctl00_MainContentHolder_linkBanks")
    WebElement Banks;

    // Initialization
    public LPSCustomer_Carrier_CarrierListFilters() {
        PageFactory.initElements(driver, this);
    }

    // Tab
    public void CarrierGTZ() {
        String currentWindowHandle = driver.getWindowHandle();

        // Click on an element that opens a new tab
        driver.findElement(By.xpath("//*[text()='Customer/Carrier']")).click();

        // Loop through all the available window handles
        for (String windowHandle : driver.getWindowHandles()) {
            // If it's not the current window handle, switch to it
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Now you're on the new tab, you can perform actions on it
        driver.findElement(By.xpath("//a[@id='ctl00_TopHeader_linkCustomerListCryptoHeader']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Carrier)).click();
    }

    // This will open users
    public void CarrierList() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        captureScreenShot(driver, "Verify CarrierList");
    }

    public void Search() {
        retryingFindSendKeys(SearchCarrier, "Test");
        retryingFindClick(SearchButton);
        captureScreenShot(driver, "Verify Carrier Search");
        retryingFindClick(ClearAll);

        retryingFindSendKeys(McNumber, "1234567");
        retryingFindClick(SearchButton);
        retryingFindClick(ClearAll);

        retryingFindSendKeys(DotNumber, "9876543");
        retryingFindClick(SearchButton);
        retryingFindClick(ClearAll);

        retryingFindSendKeys(SCAC, "HYTI");
        retryingFindClick(SearchButton);
        retryingFindClick(ClearAll);

        retryingFindClick(Active);
        retryingFindClick(SearchButton);
    }

    private void retryingFindSendKeys(WebElement element, String keys) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 3) {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(element))
                    .sendKeys(keys);
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException: Retrying sendKeys for element");
            }
            attempts++;
        }
        if (!result) {
            throw new RuntimeException("Failed to send keys to element after 3 attempts");
        }
    }

    private void retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 3) {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(element))
                    .click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException: Retrying click for element");
            }
            attempts++;
        }
        if (!result) {
            throw new RuntimeException("Failed to click element after 3 attempts");
        }
    }
}

