package com.visionit.studentscode.chintan.product.tc;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import po_CS_cart.po_signin;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class tc_signin extends base
{
	
	 WebDriver driver;
  @Test
  public void tc_login() 
  {
	  
	  po_signin po_login=PageFactory.initElements(driver,po_signin.class);
	  
	  test=reports.startTest("tc_login");
	  
	  po_login.click_on_myaccount();
	  test.log(LogStatus.PASS, "click_on_myaccount");
	  
	  po_login.click_on_signin();
	  test.log(LogStatus.PASS, "click_on_signin");
	  
	  po_login.email("customer@example.com");
	  test.log(LogStatus.PASS, "enter user name");
	  
	  po_login.password("customer");
	  test.log(LogStatus.PASS, "enter password");
	  
	  po_login.click_on_sign();
	  test.log(LogStatus.PASS, "click_on_sign");
	  
	  //po_login.click_on_screenshot("img1");
	  reports.endTest(test);
	  reports.flush();
	
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://demo.cs-cart.com");
	  driver.manage().window().maximize();
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
  }

}
