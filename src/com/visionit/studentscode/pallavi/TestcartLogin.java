package com.visionit.studentscode.pallavi.fw.product.CsCart.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.fw.product.CsCart.po.CartLogin;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.ExcelLib;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.PropertyFile;



public class TestcartLogin 
{
	WebDriver driver;
	@Test
	public void cartLoginTest()
	{
		String user = ExcelLib.excelRead("Sheet1", 1, 0);
		String pass = ExcelLib.excelRead("Sheet1", 1, 1);
		CartLogin cartLogin=PageFactory.initElements(driver,CartLogin.class);
		 cartLogin.login();
		 cartLogin.signin();
		 cartLogin.setlogin(user,pass);
		 cartLogin.errormessage("img1");
			
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
		  System.setProperty("webdriver.chrome.driver", "D:\\Seleniumm\\All_Drivers\\chromedriver.exe");
	  } 
	 
	
}
