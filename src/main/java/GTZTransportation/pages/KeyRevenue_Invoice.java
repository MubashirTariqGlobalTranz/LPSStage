package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import GTZTransportation.gtz.BaseClass;

public class KeyRevenue_Invoice extends BaseClass {

    @FindBy(xpath = "//*[text()='KeyRevenue']")
    WebElement KeyRevenue;

    @FindBy(xpath = "//*[text()='Invoice']")
    WebElement Invoice;

    @FindBy(id = "ContentPlaceHolder1_containerFilter_drDateRange_ctl03_txtDate")
    WebElement DateRange;

    @FindBy(xpath = "//a[@id='ContentPlaceHolder1_linkAdd']")
    WebElement CreateInvoice;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_smartCustomer_txtCustomer']")
    WebElement CustomerName;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/th[1]")
    WebElement Customer;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtAddress1']")
    WebElement Address;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtCity']")
    WebElement City;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtState']")
    WebElement State;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtPostalCode']")
    WebElement PostalCode;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_btnSave']")
    WebElement Save;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtInvoiceId']")
    WebElement InvoiceNo;

    @FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
    WebElement Filter;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
    WebElement InvoiceDetails;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_btnSend']")
    WebElement SendInvoice;

    @FindBy(id = "ContentPlaceHolder1_containerDetails_BtnCancel")
    WebElement CancelInvoice;

    // Initialization
    public KeyRevenue_Invoice() {
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

    // This will create an invoice
    public void Create_Invoice() {
        retryingFindClick(CreateInvoice);
        retryingFindSendKeys(CustomerName, "Test Account (1590)");
        retryingFindClick(Customer);
        retryingFindSendKeys(Address, "Test");
        retryingFindSendKeys(City, "Test");
        retryingFindSendKeys(State, "US");
        retryingFindSendKeys(PostalCode, "3306");
        retryingFindClick(Save);
    }

    // Search Invoice
    public void Search_Invoice() {
        WebElement L = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/h2[1]"));
        String st = L.getText();
        System.out.println(st);
        retryingFindClick(Invoice);
        retryingFindSendKeys(InvoiceNo, st);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.ARROW_LEFT);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        InvoiceNo.sendKeys(Keys.BACK_SPACE);
        retryingFindClick(Filter);
    }

    // Send Invoice
    public void Send_Invoice() {
        retryingFindClick(InvoiceDetails);
        retryingFindClick(SendInvoice);
        driver.switchTo().alert().accept();
        captureScreenShot(driver, "Verify Invoice Send ");
    }

    // Cancel Invoice
    public void Cancel_Invoice() {
        retryingFindClick(CancelInvoice);
        driver.switchTo().alert().accept();
        captureScreenShot(driver, "Verify Invoice Cancelled");
    }

    private void retryingFindSendKeys(WebElement element, String keys) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(keys);
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
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
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