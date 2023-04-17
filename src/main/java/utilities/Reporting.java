package utilities;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	
	public class BaseTest {
		
		  public ExtentReports report;
		  public ExtentTest logger;
		 
		  @BeforeSuite
		 
			  public void beforeSuite() {
			  report = new ExtentReports();
				    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent.html");
				    report.attachReporter(htmlReporter);
				    report.setSystemInfo("OS", System.getProperty("os.name"));
				    report.setSystemInfo("Browser", "Chrome");
				  
		  }

		  @BeforeMethod
		  public void beforeMethod(Method method) {
		    test = extent.createTest(method.getName());
		  }

		  @AfterMethod
		  public void afterMethod(ITestResult result) {
		    if (result.getStatus() == ITestResult.FAILURE) {
		      test.fail(result.getThrowable());
		    } else if (result.getStatus() == ITestResult.SKIP) {
		      test.skip(result.getThrowable());
		    } else {
		      test.pass("Test passed");
		    }
		  }

		  @AfterSuite
		  public void afterSuite() {
		    extent.flush();
		  }

		  public void log(String message) {
		    test.info(message);
		  }

		  public void logFailure(String message) {
		    test.fail(message);
		  }

		  public void logSuccess(String message) {
		    test.pass(message);
		  }

}}
