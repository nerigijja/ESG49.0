package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class LeadCheck_TestClass extends HelperClass{
	
public static void Create_Lead() {
	
	ClickByActionClass("Create_Lead", "MainMenu", "ESG Values", "CreateLead", 1, 1);
	clickWebelement("Create_Lead", "New_Button");
	selectDropdownByVisibleText("Create_Lead", "Selet_Program", "ESG Values", "CreateLead", 2, 1);
	clickWebelement("Create_Lead", "Next_Button");
	explicitWait(3000, "Create_Lead", "Search_type");
	enterTextboxValue("Create_Lead", "Search_type", "ESG Values", "CreateLead", 3, 1);
	clickWebelement("Create_Lead", "GO_Button");
	explicitWaitForClickable(3000, "Create_Lead", "Customer_name");
	clickWebelement("Create_Lead", "Customer_name");
	clickWebelement("Create_Lead", "Next_Button");
		
	}
	public static void CalenderSetup() {
		
	}
	
	public static void Resolve_Lead() {
		
	}
}
