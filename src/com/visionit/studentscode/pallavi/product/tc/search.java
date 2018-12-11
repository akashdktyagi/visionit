package com.visionit.studentscode.pallavi.product.tc;

import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.product.po.CartSearch;
import com.visionit.studentscode.pallavi.product.reusable.PropertyFile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

public class search
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  CartSearch cartSearch=PageFactory.initElements(driver, CartSearch.class);
	  cartSearch.search(PropertyFile.getProperty("search1"));
	  cartSearch.click();
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
