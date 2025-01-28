package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import GTZTransportation.gtz.BaseClass;

import java.time.Duration;

public class LPS_Dashboard_ChangeCustomer extends BaseClass {

    @FindBy(xpath = "//a[@id='navheader_updateActiveCustomer_btnChange']")
    WebElement Change;

    @FindBy(xpath = "//a[@id='navheader_updateActiveCustomer_btnSave']")
    WebElement Save;

    @FindBy(xpath = "//select[@id='navheader_updateActiveCustomer_lstCustomer']")
    WebElement customerDropdown;

    // Initialization
    public LPS_Dashboard_ChangeCustomer() {
        PageFactory.initElements(driver, this);
    }

    // Method to handle selecting customers
    public void selectAndSaveCustomer() {
        
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click the Change button
            System.out.println("Clicking Change button...");
            Change.click();

            // Wait for the customer dropdown to be visible
            System.out.println("Waiting for customer dropdown...");
            wait.until(ExpectedConditions.visibilityOf(customerDropdown));

            // Select "Nokia" from the dropdown
            Select customerSelect = new Select(customerDropdown);
            System.out.println("Selecting 'Nokia' from the dropdown...");
            customerSelect.selectByVisibleText("NOKIA");

            // Click Save to save the selection
            System.out.println("Saving the Nokia selection...");
            Save.click();

            // Wait for the page to load before clicking Change again
            System.out.println("Waiting for Change button to be clickable...");
            wait.until(ExpectedConditions.elementToBeClickable(Change));

            // Click the Change button again to change the customer
            Change.click();

            // Wait for the customer dropdown to be visible again
            System.out.println("Waiting for customer dropdown again...");
            wait.until(ExpectedConditions.visibilityOf(customerDropdown));

            // Select "Cameron's Coffee" from the dropdown
            System.out.println("Selecting 'Cameron's Coffee' from the dropdown...");
            customerSelect.selectByVisibleText("Cameron's Coffee");

            // Click Save to save the selection
            System.out.println("Saving the Cameron's Coffee selection...");
            Save.click();
            
            try {
    			Thread.sleep(3000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

           
        } 
        
    
}
