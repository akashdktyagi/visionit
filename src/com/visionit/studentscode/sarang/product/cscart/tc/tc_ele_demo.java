package com.visionit.studentscode.sarang.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.visionit.studentscode.sarang.product.cscart.po.po_ele_demo;

public class tc_ele_demo 
{
	WebDriver driver;
	@BeforeTest
	public void driverPath() {
		System.setProperty("webdriver.chrome.driver","C://Vision//chromedriver.exe");
	}
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.cs-cart.com");
			//System.out.println("CS Cart Site is Opened Successfully"); 
	  }
	  
	  @Test
	  public void purchaseDextop() 
	  {
		  po_ele_demo po_ele_demo=PageFactory.initElements(driver,po_ele_demo.class);
		  po_ele_demo.myaccount();
		  po_ele_demo.signin();
		  po_ele_demo.setusername("customer@example.com");
		  po_ele_demo.setpassword("customer");
		  po_ele_demo.signinbtn();
		  po_ele_demo.click();
		
	  }

}
