package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class FreightPayment_Reports extends BaseClass {

    @FindBy(xpath = "//*[text()='Pay Bills']")
    WebElement FreightPayment;

    @FindBy(xpath = "//span[normalize-space()='Reports']")
    WebElement Report;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_0")
    WebElement FreightDataImport;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_1")
    WebElement FreightDataDetails;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_3")
    WebElement LineItemCodes;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_10")
    WebElement CarrierShipmentSummary;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_13")
    WebElement FeeCheck;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_15")
    WebElement ZipList;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_20")
    WebElement LoadMasterOrder;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_21")
    WebElement PayableHistory;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_23")
    WebElement AccessorialCodes;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_10")
    WebElement EricssonGLCodes;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_14")
    WebElement CarrierSummaryTransfer;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_15")
    WebElement ManualTransferDetails;

    @FindBy(id = "MainContentHolder_ctl01_grid_linkName_16")
    WebElement ManualTransferSummary;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement Next;

    @FindBy(id = "MainContentHolder_btnExecute")
    WebElement ExecuteButton;

    // Constructor
    public FreightPayment_Reports() {
        PageFactory.initElements(driver, this);
    }

    // Common sleep method
    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Open Account Payable Application & switch to new tab
    public void AccountPayableGTZ() {
        String currentWindowHandle = driver.getWindowHandle();
        FreightPayment.click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Report.click();
    }

    // Generic method for executing reports
    private void executeReport(WebElement reportElement, String reportName) {
        sleep(3000);
        Report.click();
        reportElement.click();
        ExecuteButton.click();
        captureScreenShot(driver, "Verify Report - " + reportName);
    }

    public void Report_FreightDataImport() {
        executeReport(FreightDataImport, "FreightDataImport");
    }

    public void Report_FreightDataDetails() {
        executeReport(FreightDataDetails, "FreightDataDetails");
    }

    public void Report_LineItemCodes() {
        executeReport(LineItemCodes, "LineItemCodes");
    }

    public void Report_CarrierShipmentSummary() {
        executeReport(CarrierShipmentSummary, "CarrierShipmentSummary");
    }

    public void Report_FeeCheck() {
        executeReport(FeeCheck, "FeeCheck");
    }

    public void Report_ZipList() {
        executeReport(ZipList, "ZipList");
    }

    public void Report_LoadMasterOrder() {
        executeReport(LoadMasterOrder, "LoadMasterOrder");
    }

    public void Report_PayableHistory() {
        executeReport(PayableHistory, "PayableHistory");
    }

    public void Report_AccessorialCodes() {
        executeReport(AccessorialCodes, "AccessorialCodes");
    }

    public void Report_EricssonGLCodes() {
        sleep(3000);
        Report.click();
        Next.click();
        sleep(3000);
        executeReport(EricssonGLCodes, "EricssonGLCodes");
    }

    public void Report_CarrierSummaryTransfer() {
        sleep(3000);
        Report.click();
        Next.click();
        sleep(3000);
        executeReport(CarrierSummaryTransfer, "CarrierSummaryTransfer");
    }

    public void Report_ManualTransferDetails() {
        sleep(3000);
        Report.click();
        Next.click();
        sleep(3000);
        executeReport(ManualTransferDetails, "ManualTransferDetails");
    }

    public void Report_ManualTransferSummary() {
        sleep(3000);
        Report.click();
        Next.click();
        sleep(3000);
        executeReport(ManualTransferSummary, "ManualTransferSummary");
    }
}
