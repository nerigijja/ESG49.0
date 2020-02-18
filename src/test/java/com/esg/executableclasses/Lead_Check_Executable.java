package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.LeadCheck_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Lead_Check_Executable extends LeadCheck_TestClass {
	
	@BeforeTest
	public static void Initialization() {
		
		initialization();
	}
	@Test(priority = 1)
	public static void Login() {
		test = Report.startTest("Login");
		login("Helper","BaseURL", 1, 0, 1, 1);
	}
	
	@Test(priority = 2)
	public static void CreateLead() {
		test = Report.startTest("Create Lead");
		Create_Lead();
		
	}
	
@AfterMethod
public void getResult(ITestResult result) throws IOException
   {
       if(result.getStatus() == ITestResult.FAILURE)
       {
           String screenShotPath = GetScreenShot.capture(driver);
           test.log(LogStatus.FAIL, result.getThrowable());
           test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
       }
       Report.endTest(test);
   }

@AfterTest
public static void Generate() {
	 
	generateReport();
}
}
