package com.visionit.studentscode.chintan.product.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_Apparel;



public class tc_Apparel {
	WebDriver Driver;
	  @Test
	  public void f()
	  {
		  po_Apparel po_Apparel=PageFactory.initElements(Driver, po_Apparel.class);
		  
		  po_Apparel.click_on_apparel();
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  Driver=new ChromeDriver();
		  Driver.get("https://demo.cs-cart.com/stores/2a38bd53e2542cc1/");
		  Driver.manage().window().maximize();
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  }

	}
