package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import GTZTransportation.gtz.BaseClass;

public class Dashboard_GenerateBOL extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='Create BOLs via bulk upload']")
    WebElement GenerateBOL;

    @FindBy(xpath = "//label[@class='no-data']")
    WebElement Jobs;

    // Initialization
    public Dashboard_GenerateBOL() {
        PageFactory.initElements(driver, this);
    }

    public void Dashboard_GenerateBOLGTZ() {
        String currentWindowHandle = driver.getWindowHandle();

        // Click to open new tab
        GenerateBOL.click();

        // Switch to new tab
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // ✅ **Wait up to 40 seconds for the "Jobs" heading to be clickable**
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[1]")));

        System.out.println("New tab fully loaded.");
    }

    public void GenerateBOLPage() {
        Jobs.click();

        // After Search, This assertion will work
        String actual = driver.findElement(By.xpath("//label[@class='no-data']")).getText();
        String expected = "No Jobs Found.";
        Assert.assertEquals(actual, expected);
        captureScreenShot(driver, "Verify Generate BOL App");
    }
}
