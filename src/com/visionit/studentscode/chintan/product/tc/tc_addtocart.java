package com.visionit.studentscode.chintan.product.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_addtocart;



public class tc_addtocart {
	WebDriver Driver;
	  @Test
	  public void f()
	  {
		  po_addtocart po_addtocart=PageFactory.initElements(Driver, po_addtocart.class);
		  
		  po_addtocart.click_on_carts();
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



