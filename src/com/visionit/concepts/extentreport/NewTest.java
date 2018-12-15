package com.visionit.concepts.extentreport;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest extends Base{
	
  @BeforeClass
  public void startUp() {
	
	//System.out.println(System.getProperty("user.dir") + "\\NewReport.html");
  }
  
  @Test
  public void f() {

	 test =  reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 test.log(LogStatus.PASS, "f test passed");
	 reports.endTest(test);

  }
  
  
 @Test
  public void f1() {
		 test =  reports.startTest("F1");
		 test.log(LogStatus.PASS, "f1 test passed");
		 reports.endTest(test);
		
  }
  
 @Test
  public void f2() {
		 test =  reports.startTest("F2");
		 test.log(LogStatus.PASS, "f2 test passed");
		 reports.endTest(test);
	
  }	 
  
  @Test
  public void f3() {
		 test =  reports.startTest("F3");
		 test.log(LogStatus.PASS, "f3 test passed");
		 reports.endTest(test);
		 
		 
  }
  
  @AfterClass
  public void AfterTest() {
	  reports.flush();
  }
  
  
  
}
