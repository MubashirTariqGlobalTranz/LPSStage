package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.Dashboard_AuditDashboard;

public class Dashboard_AuditDashboardTest extends BaseClass {
	// public static WebDriver driver;
	Dashboard_AuditDashboard AuditDashboard;

	public Dashboard_AuditDashboardTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		AuditDashboard = new Dashboard_AuditDashboard();
	}
	/**

	Test case description:
	AuditDashboard App on Dashboard:
	Verify Audit dashboard app is opening.
	Verify assertion is working as expected.
	
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void Dashboard_AuditDashboard_Test() {
//This will run all the methods

		AuditDashboard.Dashboard_AuditDashboardGTZ();
		AuditDashboard.AuditDashboardPage();

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
