package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GTZTransportation.gtz.BaseClass;

public class KSXAdmin_ManageUsers extends BaseClass {

    @FindBy(xpath = "//a[normalize-space()='Manage Users']")
    WebElement ManageUsers;

    @FindBy(id = "ctl00_MainContentHolder_SecondaryCustomerDropDown")
    WebElement clientUsers;

    @FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl02_UserNameHyperLink")
    WebElement ClientName;

    @FindBy(xpath = "//tbody/tr[2]/td[8]/a[1]")
    WebElement Edit;

    @FindBy(id = "ctl00_MainContentHolder_btnSave")
    WebElement SaveEdit;

    @FindBy(xpath = "//a[normalize-space()='SAV Users']")
    WebElement savUser;

    @FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl02_UserNameHyperLink")
    WebElement savName;

    @FindBy(xpath = "//a[normalize-space()='Admin Site Users']")
    WebElement adminsiteUser;

    @FindBy(id = "ctl00_MainContentHolder_GridViewUsers_ctl07_UserNameCryptoHyperLink")
    WebElement adminsiteuserName;

    public KSXAdmin_ManageUsers() {
        PageFactory.initElements(driver, this);
    }

    private void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void KSXAdminTab() {
        String currentWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[text()='KSX Admin']")).click();
        
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        
        ManageUsers.click();
        captureScreenShot(driver, "Verify Manage Clients page");
    }

    public void KSXAdminManageUsers_ClientsUser() {
        waitFor(6000);
        ManageUsers.click();
        clientUsers.click();
        waitFor(6000);
        clientUsers.sendKeys(Keys.ARROW_DOWN);
        clientUsers.sendKeys(Keys.ENTER);
        captureScreenShot(driver, "Verify client Users page");
        ClientName.click();
        waitFor(3000);
        SaveEdit.click();
        waitFor(3000);
        
        String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
        String expected = "User saved successfully.";
        Assert.assertEquals(actual, expected);
    }

    public void KSXAdmin_ManageUsers_SAVUsers() {
        waitFor(3000);
        savUser.click();
        clientUsers.click();
        clientUsers.sendKeys(Keys.ARROW_DOWN);
        clientUsers.sendKeys(Keys.ENTER);
        captureScreenShot(driver, "Verify SAV page");
        savName.click();
        waitFor(3000);
        SaveEdit.click();
        
        String actual = driver.findElement(By.id("ctl00_MainContentHolder_ValidationSuccessPanel")).getText();
        String expected = "User saved successfully.";
        Assert.assertEquals(actual, expected);
    }

    public void KSXAdmin_ManageUsers_AdminSiteUser() {
        adminsiteUser.click();
        captureScreenShot(driver, "Verify Adminsite Users page");
        adminsiteuserName.click();
        waitFor(3000);
        SaveEdit.click();
    }
}
