package com.visionit.concepts.extentreport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	 static ExtentReports reports;
	 static ExtentTest test;
	 
	 public Base() {
		 reports = new ExtentReports("E:\\_AkashStuff\\Automation\\EclipseWorkspace\\Distributable\\ExtentReportResults.html");
	 }
	 


}
