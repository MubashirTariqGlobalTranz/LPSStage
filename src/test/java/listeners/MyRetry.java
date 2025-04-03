package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import GTZTransportation.gtz.BaseClass;

public class MyRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = Integer.parseInt(System.getProperty("maxRetryCount", "3"));

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying " + result.getName() + " again and the count is " + retryCount);
            BaseClass.checkForServerErrors(); // Capture network logs on retry
            return true;
        }
        return false;
    }
}