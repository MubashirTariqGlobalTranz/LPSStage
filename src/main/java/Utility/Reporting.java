package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;

public class Reporting {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getInstance() {
        if (extent == null) {
            // Adding date and time to the filename
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            
            // Get the current working directory
            String workingDir = System.getProperty("user.dir");
            
            // Construct the report path
            String reportPath = workingDir + File.separator + "Reports" + File.separator + "extent-report_" + timestamp + ".html";
            
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            
            // Set the heading text for the report
            sparkReporter.config().setDocumentTitle("GTZ Manage Test Automation Report");
            sparkReporter.config().setReportName("GTZ Manage Test Automation Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        test = getInstance().createTest(testName);
        return test;
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
