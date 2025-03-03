package GTZTransportation.gtz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_InboundRouting_Order;

public class LPS_InboundRouting_OrderTest extends BaseClass {

	// public static WebDriver driver;
	LPS_InboundRouting_Order Claims;

	public LPS_InboundRouting_OrderTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Claims = new LPS_InboundRouting_Order();
	}
	/**

	Test case description:
	This test case contains test cases for InboundRoutingfor LPS:
	Verify InboundRouting Orders.
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_InboundRouting_Order_Tests() {
//This will run all the methods
		Claims.InboundRouting();
		Claims.OrderCreation();
		Claims.FindRates();
		Claims.CreateBOL();
		Claims.selectAndSaveCustomer();
	    
	

	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
