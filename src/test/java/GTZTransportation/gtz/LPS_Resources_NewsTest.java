package GTZTransportation.gtz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTZTransportation.pages.LPS_Resources_News;

public class LPS_Resources_NewsTest extends BaseClass {

	// public static WebDriver driver;
	LPS_Resources_News Resources;

	public LPS_Resources_NewsTest() {
		super();
	}

	@BeforeTest(groups = ("Regression"))
	public void setup() {

		initialization();
		Resources = new LPS_Resources_News();
	}
	/**

	Test case description:
	This test case contains test cases for Resources for LPS:
	Verify News Listing Page.
	

	*/
	@Test(priority = 1, groups = ("Regression"), retryAnalyzer = listeners.MyRetry.class)
	public void LPS_Resources_News_Tests() {
//This will run all the methods
		Resources.Resources();
		Resources.NewsEvent();
		
		
//Text Compare, This assertion will work
		String actual = driver.findElement(By.xpath("//span[normalize-space()='News Listing']")).getText();
		String expected = "News Listing";
		Assert.assertEquals(actual, expected);
		
	}

	@AfterTest(groups = ("Regression"))
	public void tearDown() {
		// close the WebDriver
		driver.quit();
	}
}
