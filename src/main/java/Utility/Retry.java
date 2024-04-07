package Utility;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

// Class named Retry that implements the IRetryAnalyzer interface from TestNG

public class Retry implements IRetryAnalyzer {

// Variable to keep track of the number of retries performed for a single test

private int retryCount = 0;

private static final int maxRetryCount = 1;

// Override the retry method from the IRetryAnalyzer interface

@Override

public boolean retry(ITestResult result) {

// Check if the current retry count is less than the maximum allowed retry count
 if (retryCount < maxRetryCount) {

// Increment the retry count

retryCount++;

// Return true to indicate that the test should be retried

return true;

}

// If the maximum retry count has been reached, return false to indicate no further retries

return false;

}

}