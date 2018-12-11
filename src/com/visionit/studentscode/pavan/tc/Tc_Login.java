package com.visionit.studentscode.pavan.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.visionit.studentscode.pavan.po.PO_Login;

public class Tc_Login 
{
	WebDriver driver;

	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void tc_Login() 
	{
		PO_Login Login_Main=PageFactory.initElements(driver,PO_Login.class);
		Login_Main.My_Account();
		Login_Main.Sign_in();
		Login_Main.Username();
		Login_Main.Password();
		Login_Main.Sign_In_Log();
		/*Login_Main. My_Account_Log();
		Login_Main.Sign_out();
		Login_Main.Success();*/
		
		String title_exp="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		String title_act=driver.getTitle();
		Assert.assertEquals(title_exp, title_act);
		//Assert.assertEquals(title_exp, title_act,"Successfully Log on to page");
		System.out.println("Successfully Log on to page");
		/*{
		if(title_exp.equals(title_act))
		{
		System.out.println(" Successfully Log on to Expected Page");
		}
		else
		{
			System.out.println("Expected Page is unreachable");
		}*/
	
	}
	@Test
	public void tc_Login1()
	{
		PO_Login Login_Main=PageFactory.initElements(driver,PO_Login.class);
		Login_Main.My_Account1();
		Login_Main.Sign_in1();
		Login_Main.Username1();
		Login_Main.Password1();
		Login_Main.Sign_In_Log1();
		
		String title_exp="The username or password you have entered is invalid. Please try again.";
		String title_act=driver.getTitle();
		{
		if(title_exp.equals(title_act))
		{
		System.out.println(" Go to on Expected Page");
		}
		else
		{
			System.out.println("Expected Page is unreachable");
		}
		}
	}
	@Test
	public void tc_Login2()
	{
		PO_Login Login_Main=PageFactory.initElements(driver,PO_Login.class);
		Login_Main.My_Account2();
		Login_Main.Sign_in2();
		Login_Main.Username2();
		Login_Main.Password2();
		Login_Main.Sign_In_Log2();
		Login_Main.error1();
		String title_exp="The username or password you have entered is invalid. Please try again.";
		String title_act=driver.getTitle();
		{
		if(title_exp.equals(title_act))
		{
		System.out.println(" Go to on Expected Page");
		}
		else
		{
			System.out.println("Expected Page is unreachable");
		}
	}	
		
		}
		@Test
		public void tc_Login3()
		{
			PO_Login Login_Main=PageFactory.initElements(driver,PO_Login.class);
			Login_Main.My_Account3();
			Login_Main.Sign_in3();
			Login_Main.Username3();
			Login_Main.Password3();
			Login_Main.Sign_In_Log3();
			Login_Main.Sign_Out3();
			
	}
			
}
