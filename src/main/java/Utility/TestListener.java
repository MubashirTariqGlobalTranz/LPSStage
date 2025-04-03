package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import GTZTransportation.gtz.BaseClass;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        Reporting.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
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
        BaseClass.checkForServerErrors(); // Capture network logs at the end of the test suite
        Reporting.flush();
        System.out.println("✅ Network logs saved: " + BaseClass.logFilePath);
    }
}