package GTZTransportation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GTZTransportation.gtz.BaseClass;

public class LPS_Dashboard_Glossary extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//strong[normalize-space()='Glossary']")
	WebElement Glossary;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink2']")
	WebElement Terms;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink3']")
	WebElement FreightClassification;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink4']")
	WebElement GettingStarted;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink5']")
	WebElement UsingKeyQoute;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink6']")
	WebElement TrackingShipment;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink7']")
	WebElement InternationalShipping;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink8']")
	WebElement LossAndDamage;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink9']")
	WebElement FreightInsurance;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink10']")
	WebElement PanlityAvoidance;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink11']")
	WebElement BillingExceptions;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_HyperLink12']")
	WebElement HomelandSecurity;

	// Initialization
	public LPS_Dashboard_Glossary() {
		PageFactory.initElements(driver, this);
	}

	// This will open Claim list
	public void Glossary()

	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Glossary.click();
		captureScreenShot(driver, "Verify Glossary Page");
	}

	public void Glossary_Navigations() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Terms.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FreightClassification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GettingStarted.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UsingKeyQoute.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrackingShipment.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InternationalShipping.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LossAndDamage.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FreightInsurance.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PanlityAvoidance.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BillingExceptions.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HomelandSecurity.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
