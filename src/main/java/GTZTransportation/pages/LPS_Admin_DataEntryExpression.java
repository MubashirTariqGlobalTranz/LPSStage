package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import GTZTransportation.gtz.BaseClass;

public class LPS_Admin_DataEntryExpression extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement Admin;

    @FindBy(xpath = "//a[normalize-space()='Expression Help']")
    WebElement ExpressionHelp;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtDataEntryShipmentId']")
    WebElement DataEntryShipment;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnLoad']")
    WebElement LoadDataEntryShipment;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_txtName']")
    WebElement Name;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_btnFilter']")
    WebElement Save;

    @FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
    WebElement FilterExpand;

    // Initialization
    public LPS_Admin_DataEntryExpression() {
        PageFactory.initElements(driver, this);
    }

    // This will open Admin & Data Entry Expressions
    public void Admin() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Admin.click();

        // Find the "Data entry expression" link
        WebElement actionEventsLink = driver
                .findElement(By.xpath("//a[@href='/DataEntry/Shipment/Expressions/default.aspx']"));

        // Use JavaScript to click on the "Data entry expression" link
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionEventsLink);
    }

    // This will open data entry Expression
    public void DataEntryExpression() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        retryingFindClick(ExpressionHelp);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        retryingFindSendKeys(DataEntryShipment, "Test");
        retryingFindClick(LoadDataEntryShipment);
        captureScreenShot(driver, "Verify Data Entry Expression Help");
    }

    // This will search Expression
    public void SearchExpression() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindClick(FilterExpand);
        retryingFindSendKeys(Name, "ValidateCurrency");
        retryingFindClick(Save);

        captureScreenShot(driver, "Verify Search Data Expression");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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