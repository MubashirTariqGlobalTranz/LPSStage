package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import GTZTransportation.gtz.BaseClass;

public class FindRates_CopyLoad extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='Find freight rates']")
    WebElement FindRates;

    @FindBy(xpath = "//span[normalize-space()='History']")
    WebElement History;

    @FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
    WebElement Filter;

    @FindBy(id = "ContentPlaceHolder1_containerFilter_btnExpand")
    WebElement FilterExp;

    @FindBy(xpath = "//a[@id='ContentPlaceHolder1_container_grid_linkCopy_24']")
    WebElement copy;

    @FindBy(xpath = "//button[@class='btn btn-large btn-primary']")
    WebElement FindRatesbutton;

    @FindBy(xpath = "(//tr[contains(@class, 'even')]//td[contains(@class, 'create-bol')]//a[contains(text(), 'Create')])[1]")
    WebElement Create;

    @FindBy(xpath = "//input[@id='tr2']")
    WebElement Description;

    @FindBy(xpath = "//div[@data-bind=\"template: { name: 'bolAddressTemplate', data: $root.bol.destination }\"]//input[@placeholder='Company name']")
    WebElement CompanyName;

    @FindBy(xpath = "//div[@data-bind=\"template: { name: 'bolAddressTemplate', data: $root.bol.destination }\"]//input[@id='input3']")
    WebElement Address;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[3]/div[3]/div[2]/ul/li[1]/input")
    WebElement CompanyName1;

    @FindBy(xpath = "//*[@id=\"input3\"]")
    WebElement Address1;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[3]/div[3]/div[3]/ul/li[3]/input[1]")
    WebElement PhoneNo;

    @FindBy(xpath = "//span[@data-bind=\"text:(createBolButtonText()?createBolButtonText():'Create BOL!')\"]")
    WebElement BOLCreate;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div[1]/textarea")
    WebElement Emailtext;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div[1]/button")
    WebElement SendBOL;

    // Initialization
    public FindRates_CopyLoad() {
        PageFactory.initElements(driver, this);
    }

    // This will open Find Rate & History Application
    public void openFindRatesHistory() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FindRates.click();
        History.click();
        retryingFindClick(FilterExp);
        retryingFindClick(Filter);
        captureScreenShot(driver, "Verify Find Rate History");
        retryingFindClick(copy);
        String currentWindowHandle = driver.getWindowHandle();

        // Loop through all the available window handles
        for (String windowHandle : driver.getWindowHandles()) {
            // If it's not the current window handle, switch to it
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void CopyLoad() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindClick(FindRatesbutton);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindClick(Create);
    }

    // This will create BOL against selected carrier
    public void CreateBOL() {
        retryingFindSendKeys(Description, "Mubashir");
        retryingFindSendKeys(CompanyName, "Test Name");
        retryingFindSendKeys(Address, "Test Address");
        retryingFindSendKeys(CompanyName1, "Test Name");
        retryingFindSendKeys(Address1, "Test Address");
        retryingFindSendKeys(PhoneNo, "1231231234");
        retryingFindClick(BOLCreate);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindSendKeys(Emailtext, "mubashir.tariq@globaltranz.com");
        retryingFindClick(SendBOL);
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