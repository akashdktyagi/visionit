package com.visionit.studentscode.pallavi.product.tc;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.visionit.studentscode.pallavi.product.po.CartLogin;
import com.visionit.studentscode.pallavi.product.reusable.ExcelLib;
import com.visionit.studentscode.pallavi.product.reusable.PropertyFile;



public class TestcartLogin 
{
	WebDriver driver;
	@Test
	public void cartLoginTest() throws InterruptedException
	{
		String user = ExcelLib.excelRead("Sheet1", 1, 0);
		String pass = ExcelLib.excelRead("Sheet1", 1, 1);
		CartLogin cartLogin=PageFactory.initElements(driver,CartLogin.class);
		cartLogin.login();
		cartLogin.signin();
		cartLogin.setlogin(user,pass);
		cartLogin.errormessage("img1");

		String str= driver.getTitle();
		Reporter.log(str,true);
		if(str.contains("Cart"))
		{
			ExcelLib.excelwrite("Sheet1", 1, 2, "pass");
		}
		else
		{
			ExcelLib.excelwrite("Sheet1", 1, 2, "fail");
		}	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(8000);
		Reporter.log("Verification-1 Started", true);
		//Verification1
		cartLogin.login();
		cartLogin.signout();
		SoftAssert soft = new SoftAssert();

		String str1= "Sign out";
		String str2 = "Sign out";
		soft.assertEquals(str1, str2);
		Reporter.log("Verification-1 Stopped", true);
		String str3= "out";
		Reporter.log("Verification-2 Started", true);
		soft.assertEquals(str1, str3);
		Reporter.log("Verification-2 Stopped", true);
		soft.assertAll();

	}

	@BeforeMethod
	public void beforeMethod() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(PropertyFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "../visionit/resources1/chromedriver.exe");
	} 



}
