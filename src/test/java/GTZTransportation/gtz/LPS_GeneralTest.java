package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_General;

public class LPS_GeneralTest extends BaseClass {
	// public static WebDriver driver;
	LPS_General LPS;

	public LPS_GeneralTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		LPS = new LPS_General();
	}
	/**

	Test case description:
	This test case verifies all of the following sections for LPS:
	Glossary
	Routing Guides
	Prospects
	My Profile
	My Team
	Data Entry
	Resources
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_General_Tests() {
		// This will run all the methods
		// LPS.LPS_Density_Calculator();
		LPS.LPS_Glossay();
		LPS.LPS_RoutingGuides();
		LPS.LPS_Prospects();
		LPS.LPS_MyProfile();
		LPS.LPS_MyTeam();
		LPS.LPS_DataEntry();
		LPS.LPS_Resources();
		//need to add on Prod LPS.Queue_Summary_MissingCustomerInfo();
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
