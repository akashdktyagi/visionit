package com.visionit.studentscode.pallavi.product.tc;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.product.po.Add_to_Cart;
import com.visionit.studentscode.pallavi.product.reusable.PropertyFile;



public class AddCART 
{
	WebDriver driver;
	  @Test
	  public void f() 
	  {
		  Add_to_Cart add_to_Cart=PageFactory.initElements(driver, Add_to_Cart.class);
		  add_to_Cart.search(PropertyFile.getProperty("search1"));
		  add_to_Cart.click();
		  add_to_Cart.clickimg();
		//  add_to_Cart.viewq();
		  add_to_Cart.addcrt();
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
