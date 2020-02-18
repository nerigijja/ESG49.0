package com.esg.testclasses;

import java.awt.event.KeyEvent;

import org.openqa.selenium.NoAlertPresentException;
import com.esg.utilities.HelperClass;

public class ESA_TestClass extends HelperClass{
	
	public static void Login() {
		
		login("helper", "BaseURL", 4, 0, 4, 1);
	}
	
	public static void Create_New_Lead() {
		ClickByActionClass("ESA", "MainMenu", "ESG Values", "ESA_Data", 2, 1);
		explicitWaitForClickable(3000, "ESA", "NewLead");
		VerifyElementForExistingValueWithText("ESA", "LeadPageValidation",  "ESG Values", "ESA_Data", 6, 1);
		clickWebelement("ESA", "NewLead");
		selectDropdownByVisibleText("ESA", "SelectProgram", "ESG Values", "ESA_Data", 3, 1);
		scrollToElement("ESA", "NextButton");
		clickWebelement("ESA", "NextButton");
		explicitWait(3000, "ESA", "SearchBox");
		enterTextboxValue("ESA", "SearchBox", "ESG Values", "ESA_Data", 4, 1);
		clickWebelement("ESA", "GOButton");
		explicitWait(3000, "ESA", "CustomerLink");
		VerifyElementForExistingValueWithText("ESA", "CustomerLink",  "ESG Values", "ESA_Data", 5, 1);
		clickWebelement("ESA", "CustomerLink");
		scrollToElement("ESA", "NextButton");
		clickWebelement("ESA", "NextButton");
		threadWait(3000);
		try {
		    // Add a wait timeout before this statement to make 
		    // sure you are not checking for the alert too soon.
		    ESA_Alert_Window();
		    Create_New_Lead();
		} catch(NoAlertPresentException noe) {
		    // No alert found on page, proceed with test.
			explicitWait(3000, "ESA", "NewLeadValidation");
			VerifyElementForExistingValueWithText("ESA", "NewLeadValidation",  "ESG Values", "ESA_Data", 7, 1);
		
		}
		
	}
		
	public static void UpdateLeadData() {
		
		//Contact Information
		Clear("ESA", "FirstName");
		enterTextboxValue("ESA", "FirstName",  "ESG Values", "ESA_Data", 11, 1);
		Clear("ESA", "LastName");
		enterTextboxValue("ESA", "LastName",  "ESG Values", "ESA_Data", 12, 1);
		enterTextboxValue("ESA", "EmailID",  "ESG Values", "ESA_Data", 13, 1);
		enterTextboxValue("ESA", "PrimaryPhoneNumber",  "ESG Values", "ESA_Data", 14, 1);
		selectDropdownByVisibleText("ESA", "Occupancy_Status",  "ESG Values", "ESA_Data", 15, 1);
		selectDropdownByVisibleText("ESA", "Building_Type",  "ESG Values", "ESA_Data", 16, 1);
		enterTextboxValue("ESA", "Total_Occupants",  "ESG Values", "ESA_Data", 17, 1);
		enterTextboxValue("ESA", "Total_Household_Income",  "ESG Values", "ESA_Data", 18, 1);
		TrackEnrollmentNumber("ESA", "LeadSummary",  "ESG Values", "ESA_Data", 21, 1);
		//Mailing Address
		enterTextboxValue("ESA", "MailingAddressUnit",  "ESG Values", "ESA_Data", 21, 1);
		//Installation Address
		scrollToElement("ESA", "InstallationAddressUnit");
		enterTextboxValue("ESA", "InstallationAddressUnit",  "ESG Values", "ESA_Data", 21, 1);
		
		//Assignment
		scrollToElement("ESA", "TradeAlly");
		selectDropdownByVisibleText("ESA", "TradeAlly",  "ESG Values", "ESA_Data", 26, 1);
		threadWait(3000);
		selectDropdownByVisibleText("ESA", "Employee",  "ESG Values", "ESA_Data", 27, 1);
		AppointmentDate();
		
		//Marketing Information
		scrollToElement("ESA", "Lead_Source_Category");
		selectDropdownByVisibleText("ESA", "Lead_Source_Category",  "ESG Values", "ESA_Data", 31, 1);
		threadWait(5000);
		selectDropdownByVisibleText("ESA", "Lead_Source",  "ESG Values", "ESA_Data", 32, 1);
		clickonSave();
		
		//Resolve Lead
		explicitWaitForClickable(3000, "ESA", "ResolveLead");
		clickWebelement("ESA", "ResolveLead");
		explicitWaitForClickable(3000, "ESA", "Status");
		clickWebelement("ESA", "Status");
		clickWebelement("ESA", "OKButton");
		explicitWait(3000, "ESA", "ApplicationWait");
		
		//primary TradeAlly Name Change
		scrollToElement("ESA", "PrimaryTradeAlly");
		clickWebelement("ESA", "PrimaryTradeAlly");
		clickWebelement("ESA", "PrimaryTradeAllyName");
		threadWait(2500);
		clickWebelement("ESA", "PrimaryTradeAllyEmployee");
		clickWebelement("ESA", "PrimaryTradeAllySave");
		clickonSave();
	}
	
	public static void Verify_Application_Fields() {
		//Customer Information:
		threadWait(5000);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyAccountNumber",  "ESG Values", "ESA_Data", 36, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyAccountName",  "ESG Values", "ESA_Data", 37, 1);
		
		//Installation Address
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyPremiseID",  "ESG Values", "ESA_Data", 40, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyStreetName",  "ESG Values", "ESA_Data", 41, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyInstallationAddressUnit",  "ESG Values", "ESA_Data", 23, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyCity",  "ESG Values", "ESA_Data", 42, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyState",  "ESG Values", "ESA_Data", 43, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyZipCode",  "ESG Values", "ESA_Data", 44, 1);

		//Applicatiom Information
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyLastName",  "ESG Values", "ESA_Data", 46, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyFirstName",  "ESG Values", "ESA_Data", 47, 1);
		VerifyElementForExistingValueWithAttribute("ESA", "VerifyPrimaryPhone",  "ESG Values", "ESA_Data", 48, 1);
		
		//Property Information
		VerifyElementForExistingValueWithText("ESA", "VerifyBuildingType",  "ESG Values", "ESA_Data", 51, 1);
		VerifyElementForExistingValueWithText("ESA", "VerifyOccupancy",  "ESG Values", "ESA_Data", 52, 1);
		
		//Marketing Information
		VerifyElementForExistingValueWithText("ESA", "VerifyLeadSourceCategory",  "ESG Values", "ESA_Data", 55, 1);
		VerifyElementForExistingValueWithText("ESA", "VerifyLeadSource",  "ESG Values", "ESA_Data", 56, 1);
	}
	public static void Update_Fields_After_Resolve_Lead_Completed() {
		
		//General Information Field Update
		//selectDropdownValue("ESA", "EnrolledInMyAccount",  "ESG Values", "ESA_Data", 59, 1);
		//selectDropdownValue("ESA", "ReasonForEnrolled",  "ESG Values", "ESA_Data", 60, 1);
		//selectDropdownValue("ESA", "ESACAM",  "ESG Values", "ESA_Data", 61, 1);
		//scrollToElement("ESA", "EnrolledInMyAccount");
		clickWebelement("ESA", "EnrolledInMyAccount");
		enterTextboxValue("ESA", "EnrolledInMyAccountSearch",  "ESG Values", "ESA_Data", 59, 1);
		threadWait(2500);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		clickWebelement("ESA", "ReasonForEnrolled");
		enterTextboxValue("ESA", "ReasonForEnrolledSearch",  "ESG Values", "ESA_Data", 60, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		clickWebelement("ESA", "ESACAM");
		enterTextboxValue("ESA", "ESACAMSearch",  "ESG Values", "ESA_Data", 61, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		//Customer Information Field Update
		//selectDropdownValue("ESA", "62yearsORgreater",  "ESG Values", "ESA_Data", 64, 1);
		//selectDropdownValue("ESA", "Disabled",  "ESG Values", "ESA_Data", 65, 1);
		//selectDropdownValue("ESA", "Ethnicity",  "ESG Values", "ESA_Data", 66, 1);
		//selectDropdownValue("ESA", "CareProgram",  "ESG Values", "ESA_Data", 67, 1);
		scrollToElement("ESA", "62yearsORgreater");
		clickWebelement("ESA", "62yearsORgreater");
		enterTextboxValue("ESA", "62yearsORgreaterSearch",  "ESG Values", "ESA_Data", 64, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		clickWebelement("ESA", "Disabled");
		enterTextboxValue("ESA", "DisabledSearch",  "ESG Values", "ESA_Data", 65, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		clickWebelement("ESA", "Ethnicity");
		enterTextboxValue("ESA", "EthnicitySearch",  "ESG Values", "ESA_Data", 66, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		scrollToElement("ESA", "CareProgram");
		clickWebelement("ESA", "CareProgram");
		enterTextboxValue("ESA", "CareProgramSearch",  "ESG Values", "ESA_Data", 67, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		
		
		
		
		//Property Information Field Update
		scrollToElement("ESA", "HOA_Approval_Required");
		//selectDropdownValue("ESA", "HOA_Approval_Required",  "ESG Values", "ESA_Data", 70, 1);
		clickWebelement("ESA", "HOA_Approval_Required");
		enterTextboxValue("ESA", "HOA_Approval_RequiredSearch",  "ESG Values", "ESA_Data", 70, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		
		//selectDropdownValue("ESA", "HOA_Documents_Uploaded",  "ESG Values", "ESA_Data", 71, 1);
		scrollToElement("ESA", "HOA_Documents_Uploaded");
		clickWebelement("ESA", "HOA_Documents_Uploaded");
		enterTextboxValue("ESA", "HOA_Documents_UploadedSearch",  "ESG Values", "ESA_Data", 71, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "Working_AC_in_home",  "ESG Values", "ESA_Data", 72, 1);
		scrollToElement("ESA", "Working_AC_in_home");
		clickWebelement("ESA", "Working_AC_in_home");
		enterTextboxValue("ESA", "Working_AC_in_homeSearch",  "ESG Values", "ESA_Data", 72, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "Access_to_All_Rooms",  "ESG Values", "ESA_Data", 73, 1);
		scrollToElement("ESA", "Access_to_All_Rooms");
		clickWebelement("ESA", "Access_to_All_Rooms");
		enterTextboxValue("ESA", "Access_to_All_RoomsSearch",  "ESG Values", "ESA_Data", 73, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "Cooking_Fuel_Type",  "ESG Values", "ESA_Data", 74, 1);
		scrollToElement("ESA", "Cooking_Fuel_Type");
		clickWebelement("ESA", "Cooking_Fuel_Type");
		enterTextboxValue("ESA", "Cooking_Fuel_TypeSearch",  "ESG Values", "ESA_Data", 74, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		scrollToElement("ESA", "Premise_Square_Footage");
		enterTextboxValue("ESA", "Premise_Square_Footage",  "ESG Values", "ESA_Data", 75, 1);
		enterTextboxValue("ESA", "Year_Built",  "ESG Values", "ESA_Data", 76, 1);
		//selectDropdownValue("ESA", "Common_Water_Heater",  "ESG Values", "ESA_Data", 77, 1);
		scrollToElement("ESA", "Common_Water_Heater");
		clickWebelement("ESA", "Common_Water_Heater");
		enterTextboxValue("ESA", "Common_Water_HeaterSearch",  "ESG Values", "ESA_Data", 77, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "Common_Space_Heater",  "ESG Values", "ESA_Data", 78, 1);
		scrollToElement("ESA", "Common_Space_Heater");
		clickWebelement("ESA", "Common_Space_Heater");
		enterTextboxValue("ESA", "Common_Space_HeaterSearch",  "ESG Values", "ESA_Data", 78, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//Space heating Field Update
		//selectDropdownValue("ESA", "Service_Provider",  "ESG Values", "ESA_Data", 81, 1);
		scrollToElement("ESA", "Service_Provider");
		clickWebelement("ESA", "Service_Provider");
		enterTextboxValue("ESA", "Service_ProviderSearch",  "ESG Values", "ESA_Data", 81, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "Fuel_Type",  "ESG Values", "ESA_Data", 82, 1);
		scrollToElement("ESA", "Fuel_Type");
		clickWebelement("ESA", "Fuel_Type");
		enterTextboxValue("ESA", "Fuel_TypeSearch",  "ESG Values", "ESA_Data", 82, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//Water heating Field Update
		//selectDropdownValue("ESA", "ServiceProvider",  "ESG Values", "ESA_Data", 85, 1);
		scrollToElement("ESA", "ServiceProvider");
		clickWebelement("ESA", "ServiceProvider");
		enterTextboxValue("ESA", "ServiceProviderSearch",  "ESG Values", "ESA_Data", 85, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		//selectDropdownValue("ESA", "FuelType",  "ESG Values", "ESA_Data", 86, 1);
		scrollToElement("ESA", "FuelType");
		clickWebelement("ESA", "FuelType");
		enterTextboxValue("ESA", "FuelTypeSearch",  "ESG Values", "ESA_Data", 86, 1);
		clickWebelement("ESA", "EnrolledInMyAccountSelect");
		
		clickonSave();
	}
	public static void IncomeEligibilityTab() {
		scrollToElement("ESA", "IncomeEligibilty");
		clickWebelement("ESA", "IncomeEligibilty");
		explicitWaitForClickable(3000, "ESA", "CategoryRadioButton");
		clickWebelement("ESA", "CategoryRadioButton");
		clearWebelement("ESA", "TotalOccupantsNumber");
		enterTextboxValue("ESA", "TotalOccupantsNumber",  "ESG Values", "ESA_Data", 90, 1);
		clearWebelement("ESA", "AnnualHouseHold");
		enterTextboxValue("ESA", "AnnualHouseHold",  "ESG Values", "ESA_Data", 91, 1);
		clickWebelement("ESA", "CategoryEligibility");
		clickWebelement("ESA", "CategoryEligibilitySelect");
		clickWebelement("ESA", "CategoryEligibilitySelectApplicationRadioButton");
		clickonSave();
	}
	public static void Existing_Equipment_Tab() {
		scrollToElement("ESA", "Existing_Equipment_tab");
		clickWebelement("ESA", "Existing_Equipment_tab");
		explicitWaitForClickable(3000, "ESA", "Existing_Equipment_Page_Load");
		
		
		//Central Ac Option
		if (driver.getPageSource().contains("Central AC")) {
			
			clickWebelement("ESA", "CentralACLink");
			SwitchToFrame("ESA", "Frame");
			
			
			clickWebelement("ESA", "OperationalStatus");
			enterTextboxValue("ESA", "OperationalStatus",  "ESG Values", "ESA_Data", 99, 1);
	
			clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			clickWebelement("ESA", "EquipmentSave");
		//	driver.switchTo().defaultContent();
			
		} else {
			clickWebelement("ESA", "AddEquipmentButton");
			explicitWait(3000, "ESA", "AddEquipmentPageLoad");
			SwitchToFrame("ESA", "Frame");
			threadWait(2500);
			clickWebelement("ESA", "EquipmentType");
			enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 97, 1);
			clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			//selectDropdownValue("ESA", "OperationalStatus",  "ESG Values", "ESA_Data", 99, 1);
			clickWebelement("ESA", "OperationalStatus");
			enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 99, 1);
			clickWebelement("ESA", "EnrolledInMyAccountSelect");
			threadWait(2500);
			clickWebelement("ESA", "EquipmentSave");
		//	driver.switchTo().defaultContent();

		}
		
		//Electric Heater Option
				if (driver.getPageSource().contains("Electric Heater")) {
					
					clickWebelement("ESA", "ElectricHeaterLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 145, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 143, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 145, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				
				//Clothes Dryer
				
				if (driver.getPageSource().contains("Clothes Dryer")) {
					
					clickWebelement("ESA", "ClothesDryerLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 108, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 109, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 110, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 111, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 112, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 113, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 107, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 108, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 109, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 110, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 111, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 112, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 113, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();

				}
				
				//Clothes Washer
				
				if (driver.getPageSource().contains("Clothes Washer")) {
					
					clickWebelement("ESA", "ClothesWasherLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 118, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 119, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 120, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 121, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 122, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 123, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 124, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EligibilityIssues");
					enterTextboxValue("ESA", "EligibilityIssuesSearch",  "ESG Values", "ESA_Data", 126, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					/*Clear("ESA", "Make");
					enterTextboxValue("ESA", "Make",  "ESG Values", "ESA_Data", 128, 1);*/
					Clear("ESA", "ModelNumber");
					enterTextboxValue("ESA", "ModelNumber",  "ESG Values", "ESA_Data", 129, 1);
					Clear("ESA", "SerialNumber");
					enterTextboxValue("ESA", "SerialNumber",  "ESG Values", "ESA_Data", 130, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 117, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 118, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 119, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 120, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 121, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 122, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 123, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 124, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EligibilityIssues");
					enterTextboxValue("ESA", "EligibilityIssuesSearch",  "ESG Values", "ESA_Data", 126, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "Make");
					enterTextboxValue("ESA", "Make",  "ESG Values", "ESA_Data", 128, 1);
					Clear("ESA", "ModelNumber");
					enterTextboxValue("ESA", "ModelNumber",  "ESG Values", "ESA_Data", 129, 1);
					Clear("ESA", "SerialNumber");
					enterTextboxValue("ESA", "SerialNumber",  "ESG Values", "ESA_Data", 130, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				//Cooking Appliance
				
				if (driver.getPageSource().contains("Cooking Appliance")) {
					
					clickWebelement("ESA", "CookingApplianceLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 134, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 135, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 136, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 137, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 138, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 140, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
				//	driver.switchTo().defaultContent();
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 133, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 134, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 135, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 136, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 137, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 138, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 140, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					//driver.switchTo().defaultContent();
				}
				
				//Furnace
				
				if (driver.getPageSource().contains("Furnace")) {
					
					clickWebelement("ESA", "FurnaceLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 153, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 154, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 155, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 156, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 157, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 159, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "FurnaceType");
					enterTextboxValue("ESA", "FurnaceTypeSearch",  "ESG Values", "ESA_Data", 161, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 152, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 153, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 154, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 155, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 156, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 157, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 159, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "FurnaceType");
					enterTextboxValue("ESA", "FurnaceTypeSearch",  "ESG Values", "ESA_Data", 161, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");

				}
				
				//Refrigerator
				
				if (driver.getPageSource().contains("Refrigerator")) {
					
					clickWebelement("ESA", "RefrigeratorLink");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 164, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 166, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 167, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 168, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 169, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					Clear("ESA", "Yearmanufactured");
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 170, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 171, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "CubicFt");
					enterTextboxValue("ESA", "CubicFtSearch",  "ESG Values", "ESA_Data", 173, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "Hinge");
					enterTextboxValue("ESA", "HingeSearch",  "ESG Values", "ESA_Data", 174, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "RefrigeratorMake");
					enterTextboxValue("ESA", "RefrigeratorMake",  "ESG Values", "ESA_Data", 176, 1);
					Clear("ESA", "RefrigeratorModelNumber");
					enterTextboxValue("ESA", "RefrigeratorModelNumber",  "ESG Values", "ESA_Data", 177, 1);
					threadWait(2500);
					clickWebelement("ESA", "PrimaryOrSecondary");
					enterTextboxValue("ESA", "PrimaryOrSecondarySearch",  "ESG Values", "ESA_Data", 178, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "RefusedReason");
					enterTextboxValue("ESA", "RefusedReasonSearch",  "ESG Values", "ESA_Data", 179, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					enterTextboxValue("ESA", "RefrigeratorSerialNumber",  "ESG Values", "ESA_Data", 180, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 164, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 165, 1);
					threadWait(2500);
					Enter(KeyEvent.VK_DOWN);
					threadWait(2500);
					Enter(KeyEvent.VK_DOWN);
					threadWait(2500);
					Enter(KeyEvent.VK_ENTER);
					//clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 166, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 167, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 168, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 169, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 170, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 171, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "CubicFt");
					enterTextboxValue("ESA", "CubicFtSearch",  "ESG Values", "ESA_Data", 173, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "Hinge");
					enterTextboxValue("ESA", "HingeSearch",  "ESG Values", "ESA_Data", 174, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					clickWebelement("ESA", "IsGrounded");
					Clear("ESA", "RefrigeratorMake");
					enterTextboxValue("ESA", "RefrigeratorMake",  "ESG Values", "ESA_Data", 176, 1);
					Clear("ESA", "RefrigeratorModelNumber");
					enterTextboxValue("ESA", "RefrigeratorModelNumber",  "ESG Values", "ESA_Data", 177, 1);
					threadWait(2500);
					clickWebelement("ESA", "PrimaryOrSecondary");
					enterTextboxValue("ESA", "PrimaryOrSecondarySearch",  "ESG Values", "ESA_Data", 178, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					/*clickWebelement("ESA", "RefusedReason");
					enterTextboxValue("ESA", "RefusedReasonSearch",  "ESG Values", "ESA_Data", 179, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");*/
					scrollToElement("ESA", "RefrigeratorSerialNumber");
					Clear("ESA", "RefrigeratorSerialNumber");
					enterTextboxValue("ESA", "RefrigeratorSerialNumber",  "ESG Values", "ESA_Data", 180, 1);
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");

				}
				
				//Water Heater
				
				if (driver.getPageSource().contains("Water Heater")) {
					clickWebelement("ESA", "WaterHeater");
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 183, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 185, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 186, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 187, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 188, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 189, 1);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 190, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");
					
				} else {
					clickWebelement("ESA", "AddEquipmentButton");
					threadWait(3000);
					SwitchToFrame("ESA", "Frame");
					clickWebelement("ESA", "EquipmentType");
					enterTextboxValue("ESA", "EquipmentTypeSearch",  "ESG Values", "ESA_Data", 183, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentName");
					enterTextboxValue("ESA", "EquipmentNameSearch",  "ESG Values", "ESA_Data", 184, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OperationalStatus");
					enterTextboxValue("ESA", "OperationalStatusSearch",  "ESG Values", "ESA_Data", 185, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "OwnershipStatus");
					enterTextboxValue("ESA", "OwnershipStatusSearch",  "ESG Values", "ESA_Data", 186, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentFuelType");
					enterTextboxValue("ESA", "EquipmentFuelTypeSearch",  "ESG Values", "ESA_Data", 187, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentServiceProvider");
					enterTextboxValue("ESA", "EquipmentServiceProviderSearch",  "ESG Values", "ESA_Data", 188, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					//enterTextboxValue("ESA", "Yearmanufactured",  "ESG Values", "ESA_Data", 189, 1);
					clickWebelement("ESA", "EquipmentLocation");
					enterTextboxValue("ESA", "EquipmentLocationSearch",  "ESG Values", "ESA_Data", 190, 1);
					clickWebelement("ESA", "EnrolledInMyAccountSelect");
					threadWait(2500);
					clickWebelement("ESA", "EquipmentSave");

				}
	}
				public static void Verify_And_Delete_Measures() {
					
					scrollToElement("ESA", "ExistinEquipmentMeasureTab");
					clickWebelement("ESA", "ExistinEquipmentMeasureTab");
					explicitWait(3000, "ESA", "VerifyESA_HomeEnergyEducation");
					VerifyElementForExistingValueWithText("ESA", "VerifyESA_HomeEnergyEducation", "ESG Values", "ESA_Data", 197, 1);
					VerifyElementForExistingValueWithText("ESA", "VerifyESA_Outreach", "ESG Values", "ESA_Data", 198, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Faucet_Aerator", "ESG Values", "ESA_Data", 199, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_LED_Diffuse_Bulb", "ESG Values", "ESA_Data", 200, 1);
					//VerifyElementForExistingValueWithText("ESA", "Verify_LED_Night_Light", "ESG Values", "ESA_Data", 201, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_LED_Reflector_Bulb", "ESG Values", "ESA_Data", 202, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Smart_Strip1", "ESG Values", "ESA_Data", 203, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Torchiere_Lamp", "ESG Values", "ESA_Data", 204, 1);
					
					clickWebelement("ESA", "Delete_LED_Diffuse_Bulb");
					handlePopup();
					//explicitWaitForClickable("ESA", "Delete_LED_Night_Light");
					//clickWebelement("ESA", "Delete_LED_Night_Light");
				//	handlePopup();
					threadWait(5000);
				//	explicitWaitForClickable(3000,"ESA", "Delete_LED_Reflector_Bulb");
					clickWebelement("ESA", "Delete_LED_Reflector_Bulb");
					handlePopup();
					threadWait(5000);
				//	explicitWaitForClickable(3000,"ESA", "Delete_Torchiere_Lamp");
					clickWebelement("ESA", "Delete_Torchiere_Lamp");
					handlePopup();
					clickonSave();
					
			}
				public static void Add_Measure_Information() {
					explicitWait(3000, "ESA", "VerifyESA_HomeEnergyEducation");	
					clickWebelement("ESA", "VerifyESA_HomeEnergyEducation");
					threadWait(5000);
					enterTextboxValue("ESA", "ESA_HomeEnergyEducation", "ESG Values", "ESA_Data", 207, 1);
					clickWebelement("ESA", "AddPart_ESA_HomeEnergyEducation");
					threadWait(5000);
					clickWebelement("ESA", "Water_Education_CheckBox");
					threadWait(2500);
					clickWebelement("ESA", "ESA_Save_Button");
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					explicitWait(3000, "ESA", "Water_Education_Click");
					clickWebelement("ESA", "Water_Education_Click");
					threadWait(5000);
					enterTextboxValue("ESA", "Water_Education_Qty", "ESG Values", "ESA_Data", 207, 1);
					//ESA Outreach & Assessment (EOA)
					
					threadWait(5000);
					clickWebelement("ESA", "ESA_OutreachClick");
					threadWait(5000);
					enterTextboxValue("ESA", "ESA_Outreach", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "MeasureClick");
					threadWait(2500);
					clickWebelement("ESA", "AddPart_ESA_Outreach");
					threadWait(5000);
					clickWebelement("ESA", "CategoryInpersonCheckBox");
					clickWebelement("ESA", "HomeAssesmentCheckBox");
					clickWebelement("ESA", "ESA_Save_Button");
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					clickWebelement("ESA", "CategoryInPerson_Click");
					threadWait(5000);
					enterTextboxValue("ESA", "CategoryInPerson_Qty", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "HomeAssesment_Click");
					threadWait(5000);
					enterTextboxValue("ESA", "HomeAssesment_Qty", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					clickWebelement("ESA", "MeasureClick");
					clickonSave();
					
					//Add Measures 
					clickWebelement("ESA", "AddMeasureButton");
					threadWait(5000);
					clickWebelement("ESA", "AddRefrigerator");
					clickWebelement("ESA", "AddAirSealing");
					clickWebelement("ESA", "AddCaulking");
					clickWebelement("ESA", "AddWeatherstripping");
					clickWebelement("ESA", "AddLowFlowShowerhead");
					clickWebelement("ESA", "AddThermostaticShowerValve");
					clickWebelement("ESA", "AddWaterHeaterBlanket");
					clickWebelement("ESA", "AddWaterHeaterPipeInsulation");
					clickWebelement("ESA", "ESA_Save_Button");
					
					//Update Measure Data in the Grids
					threadWait(5000);
					clickWebelement("ESA", "Refrigerator_Click");
					threadWait(3000);
					clickWebelement("ESA", "Refrigerator_Qty");
					enterTextboxValue("ESA", "Refrigerator_Qty", "ESG Values", "ESA_Data", 212, 1);
					threadWait(3000);
					clickWebelement("ESA", "Refrigerator_Hinge");
					enterTextboxValue("ESA", "Refrigerator_Hinge", "ESG Values", "ESA_Data", 213, 1);
					threadWait(5000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "Refrigeator_Planned_Size");
					enterTextboxValue("ESA", "Refrigeator_Planned_Size", "ESG Values", "ESA_Data", 214, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "Air_Sealing_Click");
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Qty");
					enterTextboxValue("ESA", "Air_Sealing_Qty", "ESG Values", "ESA_Data", 216, 1);
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Caulking_Click");
					threadWait(3000);
					//clickWebelement("ESA", "Air_Sealing_Caulking_Qty");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_Qty", "ESG Values", "ESA_Data", 218, 1);
					threadWait(3000);
					clickWebelement("ESA", "Air_Sealing_Caulking_HOA_Status");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_HOA_Status", "ESG Values", "ESA_Data", 219, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "Air_Sealing_Caulking_Housing_Type");
					enterTextboxValue("ESA", "Air_Sealing_Caulking_Housing_Type", "ESG Values", "ESA_Data", 220, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					scrollToElement("ESA", "WeatherStripping_Click");
					clickWebelement("ESA", "WeatherStripping_Click");
					threadWait(3000);
					clickWebelement("ESA", "WeatherStripping_Qty");
					enterTextboxValue("ESA", "WeatherStripping_Qty", "ESG Values", "ESA_Data", 223, 1);
					threadWait(3000);
					clickWebelement("ESA", "WeatherStripping_HOA_Status");
					enterTextboxValue("ESA", "WeatherStripping_HOA_Status", "ESG Values", "ESA_Data", 224, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickWebelement("ESA", "WeatherStripping_Type");
					enterTextboxValue("ESA", "WeatherStripping_Type", "ESG Values", "ESA_Data", 225, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					
					clickWebelement("ESA", "Low_Flow_Showerhead_Click");
					threadWait(3000);
					clickWebelement("ESA", "Low_Flow_Showerhead_Qty");
					enterTextboxValue("ESA", "Low_Flow_Showerhead_Qty", "ESG Values", "ESA_Data", 227, 1);
					threadWait(3000);
					clickWebelement("ESA", "Low_Flow_Showerhead_Type");
					enterTextboxValue("ESA", "Low_Flow_Showerhead_Type", "ESG Values", "ESA_Data", 228, 1);
					threadWait(3000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					scrollToElement("ESA", "Thermostatic_Shower_Valve_Click");
					clickWebelement("ESA", "Thermostatic_Shower_Valve_Click");
					threadWait(3000);
					clickWebelement("ESA", "Thermostatic_Shower_Valve_Qty");
					enterTextboxValue("ESA", "Thermostatic_Shower_Valve_Qty", "ESG Values", "ESA_Data", 230, 1);
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Blanket_Click");
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Blanket_Qty");
					enterTextboxValue("ESA", "Water_Heater_Blanket_Qty", "ESG Values", "ESA_Data", 232, 1);
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Pipe_Insulation_Click");
					threadWait(3000);
					clickWebelement("ESA", "Water_Heater_Pipe_Insulation_Qty");
					enterTextboxValue("ESA", "Water_Heater_Pipe_Insulation_Qty", "ESG Values", "ESA_Data", 234, 1);
					threadWait(3000);
					scrollToElement("ESA", "Faucet_Aerator_Click");
					//Faucet Aerator (ESA10)
					clickWebelement("ESA", "Faucet_Aerator_Click");
					threadWait(5000);
					clickWebelement("ESA", "Faucet_Aerator");
					enterTextboxValue("ESA", "Faucet_Aerator", "ESG Values", "ESA_Data", 207, 1);
					threadWait(2500);
					scrollToElement("ESA", "MeasureClick");
					clickWebelement("ESA", "MeasureClick");
					//Torchiere Lamp (ESA27)
					threadWait(3000);
					scrollToElement("ESA", "Smart_Strip_Click");
					clickWebelement("ESA", "Smart_Strip_Click");
					threadWait(5000);
					clickWebelement("ESA", "Smart_Strip_Qty");
					enterTextboxValue("ESA", "Smart_Strip_Qty", "ESG Values", "ESA_Data", 209, 1);
					threadWait(5000);
					clickWebelement("ESA", "MeasureClick");
					scrollToElement("ESA", "GrantTotal");
					clickWebelement("ESA", "GrantTotal");
					threadWait(3000);
					clickonSave();
					
				}
				public static void Verify_Incentives_Of_Each_Measure() {
					VerifyElementForExistingValueWithText("ESA", "Verify_ESA_Home_Energy_Education_Incentive", "ESG Values", "ESA_Data", 237, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Education_Incentive", "ESG Values", "ESA_Data", 238, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_ESA_Outreach_Assessment_Incentive", "ESG Values", "ESA_Data", 239, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Categorical_Eligibility_Incentive", "ESG Values", "ESA_Data", 240, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Home_Assessment_Incentive", "ESG Values", "ESA_Data", 241, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Refrigerator_Incentive", "ESG Values", "ESA_Data", 242, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Air_Sealing_Education_Incentive", "ESG Values", "ESA_Data", 243, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Caulking_Incentive", "ESG Values", "ESA_Data", 244, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Weatherstripping_Incentive", "ESG Values", "ESA_Data", 245, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Faucet_Aerator_Incentive", "ESG Values", "ESA_Data", 246, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Low_Flow_Showerhead_Incentive", "ESG Values", "ESA_Data", 247, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Torchiere_Lamp_Incentive", "ESG Values", "ESA_Data", 248, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Thermostatic_Shower_Valve_Incentive", "ESG Values", "ESA_Data", 249, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_lanket_Incentive", "ESG Values", "ESA_Data", 250, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_Pipe_Insulation_Incentive", "ESG Values", "ESA_Data", 251, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_lanket_Incentive", "ESG Values", "ESA_Data", 252, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Water_Heater_Pipe_Insulation_Incentive", "ESG Values", "ESA_Data", 253, 1);
					clickonProcess();
					handlePopup();
				}
				public static void Process_Application() {
					clickWebelement("ESA", "ApplicationLink");
					clickonProcess();
					//handlePopup();
					//Verify steps are created after processing the application
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Electric_Appliance_Step", "ESG Values", "ESA_Data", 256, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Weatherization_Step", "ESG Values", "ESA_Data", 257, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_NGAT_Step", "ESG Values", "ESA_Data", 258, 1);
					
					//Verify TradeAlly Name
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Electric_Appliance_TradeAlly", "ESG Values", "ESA_Data", 261, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_Installation_Weatherization_TradeAlly", "ESG Values", "ESA_Data", 262, 1);
					VerifyElementForExistingValueWithText("ESA", "Verify_NGAT_TradeAlly", "ESG Values", "ESA_Data", 263, 1);
	
				}
				public static void Installation_Weatherization_Workflow_Step() {
					
					clickWebelement("ESA", "Installation_Weatherization_Step");
					threadWait(3000);
					scrollToElement("ESA", "Contact_Attempt_Tab");
					clickWebelement("ESA", "Contact_Attempt_Tab");
					implicitlywait(3000);
					clickWebelement("ESA", "Contact_Attmept_New_button");
					ContactDate();
					clickWebelement("ESA", "ContactTime");
					clickWebelement("ESA", "ContactTimeSelect");
					threadWait(2500);
					selectDropdownByVisibleText("ESA", "ContactType", "ESG Values", "ESA_Data", 268, 1);
					enterTextboxValue("ESA", "CommentBox", "ESG Values", "ESA_Data", 269, 1);
					clickWebelement("ESA", "ApplyButton");
					threadWait(2500);
					clickonclose();
					scrollToElement("ESA", "WorkflowstepTab");
					clickWebelement("ESA", "WorkflowstepTab");
					SchedulingDate();
					clickWebelement("ESA", "StartDate");
					clickWebelement("ESA", "StartDateSelect");
					clickWebelement("ESA", "DurationTimeClick");
					enterTextboxValue("ESA", "DUrationTimeSearch", "ESG Values", "ESA_Data", 272, 1);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					clickonSave();
					
					//Enter Visitor Information
					selectDropdownByVisibleText("ESA", "AssignTo", "ESG Values", "ESA_Data", 275, 1);
					selectDropdownByVisibleText("ESA", "EmployeeName", "ESG Values", "ESA_Data", 276, 1);
					selectActualVisitDate();
					
					//Buildidng Information
					scrollToElement("ESA", "CommonWaterHeater");
					selectDropdownByVisibleText("ESA", "CommonWaterHeater", "ESG Values", "ESA_Data", 279, 1);
					selectDropdownByVisibleText("ESA", "AccessToAllRooms", "ESG Values", "ESA_Data", 280, 1);
					VerifyElementForExistingValueWithText("ESA", "SpaceHeatingFuelValidation", "ESG Values", "ESA_Data", 281, 1);
					VerifyElementForExistingValueWithText("ESA", "Water_Heating_Fuel_Type_Validation", "ESG Values", "ESA_Data", 282, 1);
					clickonSave();
					
				}
				
	}
