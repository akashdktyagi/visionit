package com.visionit.studentscode.pallavi.fw.product.CsCart.tc;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.fw.product.CsCart.po.RegisterUser;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.ExcelLib;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.PropertyFile;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.ScreenShots;


public class UserReg 
{
	WebDriver driver;
	 @Test
	  public void f() 
	  {
		  String user = ExcelLib.excelRead("Sheet1", 1, 0);
			String pass = ExcelLib.excelRead("Sheet1", 1, 1);
		 RegisterUser  RegisterUser=PageFactory.initElements(driver, RegisterUser.class);
		RegisterUser.register_user(user, pass);
		 RegisterUser.selectcal();
		 RegisterUser.selectmonth(PropertyFile.getProperty("mon"));
		 RegisterUser.selectyear(PropertyFile.getProperty("year"));
		 RegisterUser.register();
	  }
	  
	@BeforeMethod
	  public void beforeMethod() 
	  {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(PropertyFile.getProperty("url"));
		  driver.manage().window().maximize();
	  }
	
	 @AfterMethod
		public void testResult(ITestResult result)
		{
			boolean b = result.isSuccess();
			if(b)
			{
				Reporter.log("Test Method Execution is Passed "+result.getName(),true);
			}
			else
			{
				ScreenShots.getScrrenShot(driver, result.getName());
			}
		}

	 @BeforeClass
	  public void beforeClass()
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Seleniumm\\All_Drivers\\chromedriver.exe");
	  } 

	
}
