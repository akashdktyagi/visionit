package com.visionit.studentscode.pallavi.fw.product.CsCart.tc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.fw.product.CsCart.po.SportsOutdoors;
import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.PropertyFile;


public class Sports
{

	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException 
	  {
		  SportsOutdoors sportsOutdoors=PageFactory.initElements(driver, SportsOutdoors.class);
		  sportsOutdoors.sports();
		  sportsOutdoors.bike();
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
