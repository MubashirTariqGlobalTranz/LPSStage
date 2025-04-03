package GTZTransportation.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class LoadFlow_Invoice_SpotQuote extends BaseClass {

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

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement Logout;

	@FindBy(xpath = "//*[text()='KeyRevenue']")
	WebElement KeyRevenue;

	@FindBy(xpath = "//*[text()='Invoice']")
	WebElement Invoice;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_drDateRange_ctl03_txtDate")
	WebElement DateRange;

	@FindBy(xpath = "//a[@id='ContentPlaceHolder1_linkAdd']")
	WebElement CreateInvoice;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_smartCustomer_txtCustomer']")
	WebElement CustomerName1;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/span[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/th[1]")
	WebElement Customer;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtAddress1']")
	WebElement Address;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtCity']")
	WebElement City;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtState']")
	WebElement State;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_txtPostalCode']")
	WebElement PostalCode;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_containerDetails_btnSave']")
	WebElement Save;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[4]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement CreateNew;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtDescription']")
	WebElement Description;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtBilledAmount']")
	WebElement BilledAmount;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtMarkupAmount']")
	WebElement Markup;
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtFeeAmount']")
	WebElement Fees;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtShipmentNumber']")
	WebElement ShipmentNo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_txtInvoiceNumber']")
	WebElement InvoiceNo;

	@FindBy(xpath = "//h3[normalize-space()='Line Items']")
	WebElement Lineitem;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_container_btnSave']")
	WebElement Savebutton;

	// initialization
	public LoadFlow_Invoice_SpotQuote() {
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

	// This will click on Create direct load page & Fill all the required fields.
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
		Directload.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerName.sendKeys("10663");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Carriernameclick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BidAmount.sendKeys("1000");

		Company.sendKeys("Alcon");
		Name.sendKeys("Devon Daggenstoss");

		Phoneno.sendKeys("(919) 304-3846");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		originName.sendKeys("ACCU-MOLD CORPORATION");
		originAddress.sendKeys("123 Main St");
		originCity.sendKeys("ANKENY");
		OriginState.sendKeys("IA");
		OriginPostalCode.sendKeys("50021");

		// Use LocalDate to get the current date
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		// Format date as MM/dd/yyyy
		String formattedDate = currentDate.format(dateFormatter);

		// Add 1 day for the destination date
		LocalDate destinationDate = currentDate.plusDays(1);
		String formattedDestinationDate = destinationDate.format(dateFormatter);

		// Define time range strings
		String startTime = "8:00 AM CST";
		String endTime = "3:00 PM CST";

		// Combine date and time range into the desired format
		String originTimeWindow = formattedDate + " " + startTime + " - " + formattedDate + " " + endTime;
		String destinationTimeWindow = formattedDestinationDate + " " + startTime + " - " + formattedDestinationDate
				+ " " + endTime;

		// Set the fields
		OriginTimeWindow.sendKeys(originTimeWindow);
		DestinationTimeWindow.sendKeys(destinationTimeWindow);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DestinationName.sendKeys("BALDA C BREWER");
		DestinationAddress.sendKeys("123 Main St");
		DestinationCity.sendKeys("ONTARIO");
		DestinationState.sendKeys("WA");
		DestinationPostalCode.sendKeys("98424");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Weight.sendKeys("10");
		Height.sendKeys("20");
		Length.sendKeys("20");
		Width.sendKeys("20");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create.click();

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
		LTLGuaranteed.click();
		LTLStraightTruck.click();
		LTLVolumeQuote.click();
		LTLGuaranteedExp.click();
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

		OnlyBidWithResponse.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Respond.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BidWithAmount.sendKeys("1000");
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);

		// Set the Delivery Date (current date)
		SecureDate.sendKeys(formattedDate);

		LoadContactName.sendKeys("MubashirTariq");
		LoadContactPhoneNo.sendKeys("(651) 789-5782");
		SubmitLoadInformation.click();
	}

	// This will search load that is created earlier
	public void Search_Load() {
		WebElement L = driver.findElement(By.id("ContentPlaceHolder1_loadDetails_containerDetails_btnCollapse"));
		String st = L.getText();
		System.out.println("Text is : " + st);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadBoard.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterClick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadId.sendKeys(st);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		LoadId.click();
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.ARROW_LEFT);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);
		LoadId.sendKeys(Keys.BACK_SPACE);

		AllLoad.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterLoad.click();
		RespondBid.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// This will click on award and load will be awarded
		AwardBid.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		WebElement M = driver.findElement(By.className("success-validation"));
		String mt = M.getText();
		System.out.println("Text is : " + mt);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void LoadCompleteFlow() {
		LoadBoard.click();
		Delivered.click();
		Complete.click();
		cPickupETA.clear();
		cPickupETA.sendKeys("2");
		cPickupCommunication.clear();
		cPickupCommunication.sendKeys("2");

		cDeliveryETA.clear();
		cDeliveryETA.sendKeys("2");

		cDeliveryCommunication.clear();
		cDeliveryCommunication.sendKeys("2");

		cPickupWindow.clear();
		cPickupWindow.sendKeys("2");

		cDeliveryWindow.clear();
		cDeliveryWindow.sendKeys("2");

		cProperEquipment.clear();
		cProperEquipment.sendKeys("2");

		cProperAssocorials.clear();
		cProperAssocorials.sendKeys("2");

		cSpecialInstruction.clear();
		cSpecialInstruction.sendKeys("2");

		ScoreNote.sendKeys("76");

		completeLoad.click();
		driver.switchTo().alert().accept();

		Completed.click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public void InvoiceCreation() {
		WebElement L = driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[5]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]"));
		String st = L.getText();
		System.out.println(st);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Logout.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String currentWindowHandle = driver.getWindowHandle();

		// Click on an element that opens a new tab
		driver.findElement(By.xpath("//*[text()='KeyRevenue']")).click();

		// Loop through all the available window handles
		for (String windowHandle : driver.getWindowHandles()) {
			// If it's not the current window handle, switch to it
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you're on the new tab, you can perform actions on it
		driver.findElement(By.xpath("//span[normalize-space()='Invoice']")).click();
		CreateInvoice.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomerName1.sendKeys("NOKIA (10663)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Customer.click();
		Address.sendKeys("Test");
		City.sendKeys("Test");
		State.sendKeys("US");
		PostalCode.sendKeys("3306");
		Save.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement IN = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/h2[1]"));
		String invoiceText = IN.getText(); // Example: "Invoice #3990665"

		// Extract only the number using regex
		String invoiceNumber = invoiceText.replaceAll("[^0-9]", "");

		System.out.println("Extracted Invoice Number: " + invoiceNumber);

		Lineitem.click();
		CreateNew.click();
		driver.switchTo().frame("TB_iframeContent");
		Description.sendKeys(st);
		BilledAmount.sendKeys("100");
		Markup.sendKeys("10");
		ShipmentNo.sendKeys(st);
		// InvoiceNo.sendKeys(invoiceNumber);
		Savebutton.click();

		//Save.click();
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}}