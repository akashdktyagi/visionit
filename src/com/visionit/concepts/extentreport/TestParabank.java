package com.visionit.concepts.extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


//https://drive.google.com/file/d/0ByJmgAhaLx0GVzktVFNNUEZPeWc/view/
public class TestParabank {

	public static void main(String[] args) {
		
		ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "//ExtentReport.html");
		ExtentTest test = report.startTest("Test Para Bank");
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
	
		//Navigate
		driver.get("http://parabank.parasoft.com");
		
		if (driver.getTitle().contains("parabank")){
			test.log(LogStatus.PASS, "Navigation Succsfull");
		}else {
			test.log(LogStatus.FAIL, "Navigation Failed");
		}

		
		//Locators for Login
		WebElement txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		
		WebElement txt_password = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
		
		WebElement btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
		int a = 9;
		int b = 8;
		
		int c;
		
		c = a + b;
		
		//Operation on- Login in to application
		txt_username.sendKeys("john");
		test.log(LogStatus.INFO, "User name set with value as John");
		
		txt_password.sendKeys("demo");
		test.log(LogStatus.INFO, "User name set with value as Demo");
		
		btn_submit.click();
		test.log(LogStatus.INFO, "Submit Button clicked");
		
		test.log(LogStatus.PASS, "Test Case Passed.");
		
		report.endTest(test);
		report.flush();
	}

}
