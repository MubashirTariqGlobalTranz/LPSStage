package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        // Initialize the report
        Reporting.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a test entry in the report
        Reporting.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporting.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporting.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporting.getTest().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the report at the end of the suite
        Reporting.flush();
    }
}
