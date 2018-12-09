package com.visionit.studentscode.chintan.product.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_register;



public class tc_register {
	WebDriver Driver;
	  @Test
	  public void f()
	  {
		  po_register po_register=PageFactory.initElements(Driver, po_register.class);
		  
		  po_register.click_on_myaccount();
		  po_register.click_on_registers();
		  po_register.emailid("customer@example.com");
		  po_register.password1("customer");
		  po_register.password2("customer");
		  po_register.birthdate();
		  po_register.months();
		  po_register.years();
		  po_register.dates();
		  po_register.click_on_register_button();
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  Driver=new ChromeDriver();
		  Driver.get("https://demo.cs-cart.com");
		  Driver.manage().window().maximize();
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  }

	}
