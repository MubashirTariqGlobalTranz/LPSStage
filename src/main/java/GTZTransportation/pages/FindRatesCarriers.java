package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.Assert;
import GTZTransportation.gtz.BaseClass;

public class FindRatesCarriers extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='Find freight rates']")
    WebElement FindRates;

    @FindBy(id = "OriginZip")
    WebElement Origin;

    @FindBy(id = "DestinationZip")
    WebElement Destination;

    @FindBy(xpath = "//input[@placeholder='Pieces']")
    WebElement Pieces;

    @FindBy(xpath = "//input[@placeholder='Pallets']")
    WebElement Pallet;

    @FindBy(xpath = "//input[@placeholder='Weight']")
    WebElement Weight;

    @FindBy(xpath = "//input[@placeholder='Length']")
    WebElement Length;

    @FindBy(xpath = "//input[@placeholder='Width']")
    WebElement Width;

    @FindBy(xpath = "//input[@placeholder='Height']")
    WebElement Height;

    @FindBy(xpath = "//button[@class='btn btn-large btn-primary']")
    WebElement FindRatesButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[20]/div/div[2]/table/tbody/tr[2]/td[6]/a[1]")
    WebElement Create;

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[8]/span/input")
    WebElement Description;

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[4]/div[3]/div[2]/ul/li[1]/input")
    WebElement CompanyName;

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[4]/div[3]/div[2]/ul/li[2]/input")
    WebElement Address;

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div[2]/div[11]/a[1]")
    WebElement BOLCreate;

    @FindBy(xpath = "(//td[contains(@class, 'price')]/a)[1]")
    WebElement DiscountedPrice;

    @FindBy(xpath = "//div[@class='body-fixed']//a[@class='btn btn-primary'][normalize-space()='Back to Results']")
    WebElement Back;

    @FindBy(xpath = "(//td[contains(@class, 'carrier')]/span/a)[1]")
    WebElement CarrierLink;

    // Initialization
    public FindRatesCarriers() {
        PageFactory.initElements(driver, this);
    }

    // This will open Find Rate Application
    public void openFindRates() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FindRates.click();
    }

    // This will fill the find rate fields and click on find rates button & Create Button
    public void FindRates() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        retryingFindSendKeys(Origin, "55379");  // Clear and send new keys
        retryingFindSendKeys(Destination, "30303");
        retryingFindSendKeys(Pieces, "11");
        retryingFindSendKeys(Pallet, "11");
        retryingFindSendKeys(Weight, "100");
        retryingFindSendKeys(Length, "11");
        retryingFindSendKeys(Width, "11");
        retryingFindSendKeys(Height, "11");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        retryingFindClick(FindRatesButton);
        try {
            Thread.sleep(13000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void DiscountedPriceDetails() {
        retryingFindClick(DiscountedPrice);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actual = driver.findElement(By.xpath("//div[@class='body-fixed']//div[@data-bind=\"'if': activeSection() == 'carrierCharges'\"]//div//h2[contains(text(),'SEARCH CRITERIA')]")).getText();
        String expected = "SEARCH CRITERIA";
        Assert.assertEquals(actual, expected);
        captureScreenShot(driver, "Verify Discounted Price Details");
    }

    public void CarrierDetails() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindClick(Back);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retryingFindClick(CarrierLink);
        try {
            Thread.sleep(2000);
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
                wait.until(ExpectedConditions.visibilityOf(element));
                element.clear();  // Clear the field before sending new text
                element.sendKeys(keys);
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
