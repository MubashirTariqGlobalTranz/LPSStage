package GTZTransportation.pages;

import GTZTransportation.gtz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.time.Duration;

public class Dashboard_DieselPrice extends BaseClass {

    @FindBy(xpath = "//select[@id='ContentPlaceHolder1_ctl05_ctl06_ddlDieselRegion']")
    WebElement DieselRegionSelect;

    public Dashboard_DieselPrice() {
        PageFactory.initElements(driver, this);
    }

    public void DieselPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Wait for the dropdown to be visible and interactable
            wait.until(ExpectedConditions.visibilityOf(DieselRegionSelect));

            // Fetch the dropdown options
            Select dropdown = new Select(DieselRegionSelect);

            // Wait for the options to load, and select the second option (index 1)
            WebElement secondOption = dropdown.getOptions().get(1);  // Index 1 refers to the second option
            wait.until(ExpectedConditions.elementToBeClickable(secondOption));  // Wait until the second option is clickable

            dropdown.selectByVisibleText(secondOption.getText());

            System.out.println("Selected option: " + secondOption.getText());

            // Assertion to confirm the second option is selected
            String selectedText = dropdown.getFirstSelectedOption().getText().trim();
            Assert.assertEquals(selectedText, secondOption.getText().trim(), "Mismatch in selected region!");

            // Optional: Take a screenshot after selection
            captureScreenShot(driver, "Diesel_Region_" + secondOption.getText().replaceAll(" ", "_"));

        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            System.out.println("Stale element reference error occurred. Retrying...");
            // Handle stale element exception: re-fetch the dropdown element and retry the action
            DieselRegionSelect = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ctl05_ctl06_ddlDieselRegion']"));
            DieselPrice(); // Retry the method after re-fetching the element
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
