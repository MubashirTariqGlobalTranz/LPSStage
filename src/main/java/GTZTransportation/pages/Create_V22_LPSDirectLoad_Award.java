package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class Create_V22_LPSDirectLoad_Award extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[1]/a/span")
	WebElement createLoadPage;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[2]/ul/li[2]/a/span")
	WebElement Quickload;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_smartCustomer_txtCustomer")
	WebElement CustomerName;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div/table/tbody/tr[2]/th")
	WebElement Companynameclick;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtCompanyName")
	WebElement Company;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtContactPhone")
	WebElement Phoneno;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginName")
	WebElement originName;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginAddress1")
	WebElement originAddress;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactName")
	WebElement PickupContact;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactPhone")
	WebElement PickupPhone;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginCity")
	WebElement originCity;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginState")
	WebElement OriginState;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginPostalCode")
	WebElement OriginPostalCode;

	@FindBy(id = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td[1]/div/div/table/tbody/tr[7]/td[1]/input")
	WebElement Country;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_originWindows_dateSelection_0_txtDate")
	WebElement PickTimeWindow;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td[1]/div/div/table/tbody/tr[9]/td/span/div/table/tbody/tr/td[1]/span/div/input")
	WebElement PickupDateselection;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactEmail")
	WebElement PickupEmail;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationName")
	WebElement DestinationName;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationAddress1")
	WebElement DestinationAddress;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationContactName")
	WebElement PickupContactDestination;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationContactPhone")
	WebElement PickupPhoneDestination;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationCity")
	WebElement DestinationCity;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationState")
	WebElement DestinationState;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationPostalCode")
	WebElement DestinationPostalCode;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationCountry")
	WebElement DestinationCountry;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_destinationWindows_dateSelection_0_txtDate")
	WebElement DestinationTimeWindow;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decDeclaredValue")
	WebElement DeclaredValue;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_intPieces")
	WebElement Pieces;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decWeight")
	WebElement Weight;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_txtItemDescription")
	WebElement Description;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decHeight")
	WebElement Height;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decWidth")
	WebElement Width;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decLength")
	WebElement Length;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_ddlClass")
	WebElement Class;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[2]/td[2]/div/div/table[1]/tbody/tr[3]/td[1]/select/option[3]")
	WebElement ClassSelection;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_txtReferenceNumber")
	WebElement ReferenceNo;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_0")
	WebElement Flatbed;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_1")
	WebElement TruckLoad;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_2")
	WebElement Expedited;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_3")
	WebElement LTLGuaranted;

	@FindBy(id = "ContentPlaceHolder1_quickLoad_btnSave")
	WebElement Create;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
	WebElement SendBid;

	@FindBy(id = "ContentPlaceHolder1_gridLars_linkAward_0")
	WebElement AwardBid;

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

	@FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_DdlCommodityCode")
	WebElement CommodityCode;

	@FindBy(id = "ContentPlaceHolder1_chkOnlyShowBidsWithAmounts")
	WebElement UncheckBidResponse;
	@FindBy(id = "ContentPlaceHolder1_chkOnlyShowBidsWithAmounts")
	WebElement OnlyBidWithResponse;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[6]/div/div/div/table/tbody/tr[2]/td[18]/a")
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

	@FindBy(id = "ContentPlaceHolder1_grid_linkAward_0")
	WebElement AwardBidLoad;
	
	@FindBy(xpath = "//a[normalize-space()='Carriers']")
	WebElement CarrierPage;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerFilter_chkCarrierEquipmentMatch']")
	WebElement uncheckCarrierMatching;
	
	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnFilter")
	WebElement FilteruncheckCarrierMatching;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerAvailableCarriers_gridAvailableCarriers_gridAvailableCarriers_chk_0']")
	WebElement v22selection;
	
	@FindBy(id = "ContentPlaceHolder1_containerAvailableCarriers_btnAddToWave")
	WebElement AddWave;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerSelectedCarriers_gridSelectedCarriers_gridSelectedCarriers_chk_0']")
	WebElement RemoveLPSDirectWave;
	
	@FindBy(id = "ContentPlaceHolder1_containerSelectedCarriers_btnRemoveFromWave")
	WebElement RemoveWave;
	
	@FindBy(xpath = "//a[normalize-space()='Send']")
	WebElement Send;

	// initialization
	public Create_V22_LPSDirectLoad_Award() {
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

		SpotQuote.click();
	}

	// This will click on Create Quick load page & Fill all the required fields.
	// Load will be create
	public void Create_Load() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createLoadPage.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Quickload.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerName.sendKeys("10310");//Aramacell 10637 Cameron's coffee 10310, Nokia 10663, ConEdison 10148
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Companynameclick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BidAmount.sendKeys("1000");

		Company.sendKeys("Test");
		// Name.sendKeys("Devon Daggenstoss");

		Phoneno.sendKeys("(919) 304-3846");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OriginPostalCode.sendKeys("98424");
		originName.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		originName.sendKeys("Golden Services, LLC");
		originAddress.sendKeys("2400 70th Avenue East Suite B100");
		PickupContact.sendKeys("Test");
		PickupPhone.sendKeys("(919) 304-3846");
		originCity.sendKeys("Fife");
		OriginState.sendKeys("WA");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DeclaredValue.sendKeys("1000");
		Pieces.sendKeys("11");
		Weight.sendKeys("10");
		Height.sendKeys("20");
		Length.sendKeys("20");
		Width.sendKeys("20");
		Class.click();
		ClassSelection.click();
		Description.sendKeys("This is Test");
		ReferenceNo.sendKeys("Ref123456");
		CommodityCode.sendKeys("air cooler");

		DestinationTimeWindow.sendKeys("7/19/2024");

		PickTimeWindow.sendKeys("7/16/2024");
//Copy
		PickupEmail.sendKeys("Test@gmail.com");

		DestinationName.sendKeys("REFRIGERATION SUPPLIES DIST");
		DestinationAddress.sendKeys("2521 PACIFIC HIGHWAY E, SUITE C");
		PickupContactDestination.sendKeys("Test");
		PickupPhoneDestination.sendKeys("(919) 304-1199");
		DestinationCity.sendKeys("TACOMA");
		DestinationState.sendKeys("WA");
		DestinationPostalCode.sendKeys("98424");
		// DestinationCountry.sendKeys("US");

		// Paste
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Flatbed.click();
		TruckLoad.click();
		// Expedited.click();
		// LTLGuaranted.click();
		Create.click();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// This covers load award process
	public void Award_load() {
		WebElement K = driver.findElement(By.className("success-validation"));
		String kt = K.getText();
		System.out.println(kt);
		
		CarrierPage.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*uncheckCarrierMatching.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilteruncheckCarrierMatching.click();
		v22selection.click();
		AddWave.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RemoveLPSDirectWave.click();
		RemoveWave.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Send.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SendBid.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UncheckBidResponse.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By
				.xpath("//a[contains(text(), 'LPS Direct')]/ancestor::tr/td[last()-1]/a[contains(text(), 'Respond')]"))
				.click();

		// Respond.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BidWithAmount.sendKeys("1000");
		SecureDate.sendKeys("11/1/2024");

		LoadContactName.sendKeys("MubashirTariq");
		LoadContactPhoneNo.sendKeys("(651) 789-5782");
		SubmitLoadInformation.click();

		driver.navigate().back();

		driver.navigate().back();

		driver.navigate().back();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AwardBidLoad.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		WebElement M = driver.findElement(By.className("success-validation"));
		String mt = M.getText();
		System.out.println("LPS Direct Carrier: " + mt);
	}
}
