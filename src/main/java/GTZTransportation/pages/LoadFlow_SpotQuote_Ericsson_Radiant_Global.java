package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LoadFlow_SpotQuote_Ericsson_Radiant_Global extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[1]/a/span")
	WebElement createLoadPage;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[2]/ul/li[1]/a/span")
	WebElement Directload;

	@FindBy(id = "ContentPlaceHolder1_smartCustomer_txtCustomer")
	WebElement CustomerName;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[3]/div/table/tbody/tr[3]/th")
	WebElement Carriernameclick;

	@FindBy(id = "ContentPlaceHolder1_decBidAmount")
	WebElement BidAmount;

	@FindBy(id = "ContentPlaceHolder1_txtContactCompany")
	WebElement Company;

	@FindBy(id = "ContentPlaceHolder1_txtContactName")
	WebElement Name;

	@FindBy(id = "ContentPlaceHolder1_txtContactPhone")
	WebElement Phoneno;

	@FindBy(id = "ContentPlaceHolder1_txtOriginName")
	WebElement originName;

	@FindBy(id = "ContentPlaceHolder1_txtOriginAddress1")
	WebElement originAddress;

	@FindBy(id = "ContentPlaceHolder1_txtOriginCity")
	WebElement originCity;

	@FindBy(id = "ContentPlaceHolder1_txtOriginState")
	WebElement OriginState;

	@FindBy(id = "ContentPlaceHolder1_txtOriginPostalCode")
	WebElement OriginPostalCode;

	@FindBy(id = "ContentPlaceHolder1_txtOriginWindow")
	WebElement OriginTimeWindow;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationName")
	WebElement DestinationName;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationAddress1")
	WebElement DestinationAddress;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationCity")
	WebElement DestinationCity;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationState")
	WebElement DestinationState;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationPostalCode")
	WebElement DestinationPostalCode;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationWindow")
	WebElement DestinationTimeWindow;

	@FindBy(id = "ContentPlaceHolder1_decItemWeight")
	WebElement Weight;

	@FindBy(id = "ContentPlaceHolder1_decItemLength")
	WebElement Length;

	@FindBy(id = "ContentPlaceHolder1_decItemWidth")
	WebElement Width;

	@FindBy(id = "ContentPlaceHolder1_decItemHeight")
	WebElement Height;

	@FindBy(id = "ContentPlaceHolder1_btnCreate")
	WebElement Create;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/ul/li[2]/a")
	WebElement Equipmentclick;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_17")
	WebElement LTL;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_18")
	WebElement LTLGuaranteed;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_31")
	WebElement LTLStraightTruck;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_32")
	WebElement LTLVolumeQuote;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_33")
	WebElement LTLGuaranteedExp;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_btnAddTransportMethodsToWave")
	WebElement AddEquipment;

	@FindBy(id = "ContentPlaceHolder1_containerServiceType_btnSave")
	WebElement SaveToWave;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[4]/ul/li[3]/a")
	WebElement CarrierClick;

	@FindBy(id = "ContentPlaceHolder1_containerAvailableCarriers_gridAvailableCarriers_gridAvailableCarriers_header")
	WebElement AllAvailableCarrier;

	@FindBy(id = "ContentPlaceHolder1_containerAvailableCarriers_btnAddToWave")
	WebElement AddWaveCarrier;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[4]/ul/li[4]/a")
	WebElement SendClick;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
	WebElement SendButton;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_chkExpedite")
	WebElement ExpiditeToBidRequest;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
	WebElement submitButton;

	@FindBy(id = "ContentPlaceHolder1_chkOnlyShowBidsWithAmounts")
	WebElement OnlyBidWithResponse;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[6]/div/div/div/table/tbody/tr[2]/td[20]/a")
	WebElement Respond;

	@FindBy(id = "ContentPlaceHolder1_loadBidResponse_grid_txtBidAmount_0")
	WebElement BidWithAmount;

	@FindBy(id = "ContentPlaceHolder1_loadBidResponse_grid_secureUntilDate_0_dateSelection_0_txtDate_0")
	WebElement SecureDate;

	@FindBy(id = "ContentPlaceHolder1_txtContactName")
	WebElement LoadContactName;

	@FindBy(id = "ContentPlaceHolder1_txtContactPhone")
	WebElement LoadContactPhoneNo;

	@FindBy(id = "ContentPlaceHolder1_btnSubmit")
	WebElement SubmitLoadInformation;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[2]/a")
	WebElement LoadBoard;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/span/div[2]/div/h3/a")
	WebElement FilterClick;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtSearchNumber")
	WebElement LoadId;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
	WebElement AllLoad;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnRefresh")
	WebElement FilterLoad;

	@FindBy(id = "ContentPlaceHolder1_grid_linkRespond_0")
	WebElement RespondBid;

	@FindBy(id = "ContentPlaceHolder1_grid_linkAward_0")
	WebElement AwardBid;

	@FindBy(xpath = "//*[text()='Pickup ETA']")
	WebElement PickupETA;

	@FindBy(xpath = "//*[text()='Add Shipment Status']")
	WebElement addShipmentStatus;

	@FindBy(id = "PopupContainer_dateStatus_dateSelection_txtDate")
	WebElement Date;

	@FindBy(id = "PopupContainer_btnAdd")
	WebElement saveStatus;

	@FindBy(id = "PopupContainer_TxtProNumber")
	WebElement PRONo;

	@FindBy(xpath = "//a[normalize-space()='Pickup Confirmed']")
	WebElement PickupConfirm;

	@FindBy(xpath = "//a[normalize-space()='Destination ETA']")
	WebElement DestinationETA;

	@FindBy(xpath = "//a[normalize-space()='Destination Confirmed']")
	WebElement DestinationConfirm;

	@FindBy(xpath = "//th[normalize-space()='Awarded Bid Amount:']")
	WebElement cli;

	@FindBy(id = "PopupContainer_txtSignature")
	WebElement POD;

	@FindBy(xpath = "//a[normalize-space()='Delivered']")
	WebElement Delivered;

	@FindBy(xpath = "//a[normalize-space()='Complete']")
	WebElement Complete;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_0")
	WebElement cPickupETA;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_1")
	WebElement cPickupCommunication;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_2")
	WebElement cDeliveryETA;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_3")
	WebElement cDeliveryCommunication;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_4")
	WebElement cPickupWindow;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_5")
	WebElement cDeliveryWindow;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_6")
	WebElement cProperEquipment;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_7")
	WebElement cProperAssocorials;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_grid_intScore_8")
	WebElement cSpecialInstruction;

	@FindBy(id = "ContentPlaceHolder1_containerScore_loadScore_txtScoreNotes")
	WebElement ScoreNote;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_loadClose_btnCloseLoad")
	WebElement completeLoad;

	@FindBy(xpath = "//a[normalize-space()='Completed']")
	WebElement Completed;

	@FindBy(xpath = "//a[normalize-space()='2']")
	WebElement Third;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[1]/input[1]")
	WebElement unselectWard;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/a")
	WebElement AddShipment;

	@FindBy(xpath = "//select[@id='PopupContainer_cboUpdateType']/option[@value='DeliveryETA']")
	WebElement ClickDes;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[2]/td/select")
	WebElement ClickDest;

	@FindBy(xpath = "//a[normalize-space()='New']")
	WebElement New;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_smartCustomer_txtCustomer")
	WebElement Customer;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtSearchNumber")
	WebElement Ref;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
	WebElement Alload;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnRefresh")
	WebElement Filter;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[5]/div/table/tbody/tr[2]/td[6]/a")
	WebElement LoadNoCick;

	@FindBy(id = "ContentPlaceHolder1_LoadUpdateExceptionHeader_rptException_btnVerify_0")
	WebElement Verify0;

	@FindBy(id = "ContentPlaceHolder1_gridLars_linkAward_0")
	WebElement Award;

	@FindBy(xpath = "//div[@id='header-left']//a[text()='SpotQuote']")
	WebElement spotquotet;
	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_containerFilter_btnExpand']")
	WebElement Filterb;

	// initialization
	public LoadFlow_SpotQuote_Ericsson_Radiant_Global() {
		PageFactory.initElements(driver, this);
	}

	// This will open spot quote application
	public void openSpotQuote()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(
				"https://spotquote-dev.shiplps.com/AutoAuth.ashx?__eqs=KJZzhI6y49flXQZmwSNhoRrSo8uWM+HS24a4mARS8DCLRUl2jcXUA1cE5CvV+ZLyDyw6mGgpfKljjy32Dqc+XUpT//sU1sIXtdBSoy/1/s52oDWFzurLkrylegPVpZwsSDmTw84q/cVuiyK7H0qmK4loW7skCKhXRNr1Mp0EMhA=");

		// SpotQuote.click();
	}

	// This will open load and award it

	public void Open_Load() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		New.click();
		Filterb.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		// Customer.sendKeys("10262");
		Ref.sendKeys("LPS-240725-16484227");
		Alload.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Filter.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		LoadNoCick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Verify0.click();
		Verify0.click();
		// Verify0.click();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// This covers load award process
	public void load_Award() {
		Equipmentclick.click();
		LTL.click();
		// LTLGuaranteed.click();
		// LTLStraightTruck.click();
		// LTLVolumeQuote.click();
		// LTLGuaranteedExp.click();
		AddEquipment.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SaveToWave.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CarrierClick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AllAvailableCarrier.click();
		// Third.click();
		// unselectWard.click();
		AddWaveCarrier.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.switchTo().alert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SendClick.click();
		ExpiditeToBidRequest.click();
		submitButton.click();
		driver.switchTo().alert().accept();

		// OnlyBidWithResponse.click();
		captureScreenShot(driver, "Load test");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Respond.click();
		Award.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * BidWithAmount.sendKeys("1000"); SecureDate.sendKeys("11/1/2001");
		 * 
		 * LoadContactName.sendKeys("MubashirTariq");
		 * LoadContactPhoneNo.sendKeys("(651) 789-5782"); SubmitLoadInformation.click();
		 */
	}

	// This will search load that is created earlier

	public void PickUpETA() {

		PickupETA.click();
		addShipmentStatus.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// This will move to cancel pop-up

		driver.switchTo().frame("TB_iframeContent");
		PRONo.sendKeys("123456");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		Date.sendKeys(formattedDate);
		
		saveStatus.click();
		driver.switchTo().defaultContent();

		AddShipment.click();

		// addShipmentStatus.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// This will move to cancel pop-up

		driver.switchTo().frame("TB_iframeContent");
		// PRONo.sendKeys("123456");
		ClickDes.click();
		Date.sendKeys(formattedDate);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		saveStatus.click();

		// driver.switchTo().defaultContent();

	}

	public void PickUpConfirmation() {
		cli.click();

		PickupConfirm.click();
		// PickupConfirm.click();
		addShipmentStatus.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// This will move to cancel pop-up

		driver.switchTo().frame("TB_iframeContent");
		PRONo.sendKeys("123456");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		Date.sendKeys(formattedDate);
		
		saveStatus.click();
		driver.switchTo().defaultContent();

	}

	public void DestinationETA() {
		// cli.click();

		DestinationETA.click();
		// PickupConfirm.click();
		addShipmentStatus.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// This will move to cancel pop-up

		driver.switchTo().frame("TB_iframeContent");
		// PRONo.sendKeys("123456");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		Date.sendKeys(formattedDate);
		saveStatus.click();
		driver.switchTo().defaultContent();

	}

	public void DestinationConfirmation() {
		// cli.click();

		DestinationConfirm.click();
		// PickupConfirm.click();
		addShipmentStatus.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// This will move to cancel pop-up

		driver.switchTo().frame("TB_iframeContent");
		POD.sendKeys("123456");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		Date.sendKeys(formattedDate);
		saveStatus.click();
		driver.switchTo().defaultContent();
	}

}
