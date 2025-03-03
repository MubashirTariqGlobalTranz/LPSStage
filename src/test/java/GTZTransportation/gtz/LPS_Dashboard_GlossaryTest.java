package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Dashboard_Glossary;

public class LPS_Dashboard_GlossaryTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Dashboard_Glossary Glossary;

	public LPS_Dashboard_GlossaryTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Glossary = new LPS_Dashboard_Glossary();
	}
	/**

	Test case description:
	This test case contains test cases for Glossary LPS:
	Verify Glossary page.
	Verify Glossary Navigations All
	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Dashboard_Glossary_Tests() {
//This will run all the methods
		Glossary.Glossary();
		Glossary.Glossary_Navigations();
	    
	
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//h1[@class='underline']")).getText();
		String expected = "Homeland Security Key Initiatives and Regulations";
		Assert.assertEquals(actual, expected);
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
