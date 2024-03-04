package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.testng.ITestContext;

import org.testng.ITestResult;

import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.markuputils.ExtentColor;

import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {

	public ExtentSparkReporter sparkReporter;

	public ExtentReports extentReport;

	public ExtentTest extentlogger;

	public void onStart(ITestContext testContext) {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String repName = "Test-Report-" + timeStamp + ".html";

		//sparkReporter = new ExtentSparkReporter("./Reports/" + repName);

		// sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +
		// "./Reports/" + repName);

		extentReport = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./Reports/" + repName );
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("OS", "Windows");
		extentReport.setSystemInfo("Browser", "Chrome");

		extentReport.attachReporter(sparkReporter);

		extentReport.setSystemInfo("Host Name", "localhost");
		extentReport.setSystemInfo("Environment", "Dev");

		extentReport.setSystemInfo("user", "Mubashir Tariq");

		sparkReporter.config().setDocumentTitle("GTZ Manage Automation");

		sparkReporter.config().setReportName("GTZ Manage Automation Report");

		sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, HH:mm:ss a '('zzz')'");

		sparkReporter.config().setTheme(Theme.STANDARD);
	}

	public void onTestSuccess(ITestResult tr) {

		extentlogger = extentReport.createTest(tr.getName());

		extentlogger.log(Status.PASS, MarkupHelper.createLabel(tr.getName() + " PASSED", ExtentColor.GREEN));

	}

	// For Test fail Event

	public void onTestFailure(ITestResult tr) {

		extentlogger = extentReport.createTest(tr.getName());

		extentlogger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName() + " FAILED", ExtentColor.RED));
		extentlogger.log(Status.FAIL, "Testcase failed: " + tr.getThrowable());

		extentlogger.fail(tr.getThrowable());

		String screenshotPath = System.getProperty("user.dir") + "/Screenshots/" + tr.getName() + ".png";

		File f = new File(screenshotPath);

		if (f.exists()) {

			try {
				extentlogger.fail("Screenshot is: " + extentlogger.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}// For test Skipped function

	public void onTestSkipped(ITestResult tr) {

		extentlogger = extentReport.createTest(tr.getName());

		extentlogger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName() + " SKIPPED", ExtentColor.YELLOW));

	}

	public void onFinish(ITestContext testContext) {

		extentReport.flush();

	}
}