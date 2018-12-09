package com.visionit.studentscode.chintan.product.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_electronic;



public class tc_electronic {
	WebDriver Driver;
	  @Test
	  public void f() throws InterruptedException 
	  {
		  po_electronic po_electronic=PageFactory.initElements(Driver, po_electronic.class);
		  
		  Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 po_electronic.click_on_electronic();
		 po_electronic.click_on_computer();
		// po_electronic.click_on_space();
		 po_electronic.click_on_images();
		 po_electronic.click_on_cart();
		 po_electronic.click_my_cartss();
//		po_electronic.click_on_check();
			


		 
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  Driver=new ChromeDriver();
		  Driver.get("https://demo.cs-cart.com");
		  Driver.manage().window().maximize();
		 // Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  }

	  
	}

