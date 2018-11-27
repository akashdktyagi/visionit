package com.visionit.studentscode.sarang.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_register;

public class tc_cscart_register
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Vision\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com");
		//System.out.println("CS Cart Site is Opened Successfully"); 
	}
	
	@Test
	public void tc_register_user() throws InterruptedException
	{
		po_cscart_register po_cscart_register = PageFactory.initElements(driver,po_cscart_register.class);
		po_cscart_register.myaccount();
		po_cscart_register.register();
		po_cscart_register.emailsend("sarang@gmail.com");
		po_cscart_register.password1send("123abc");
		po_cscart_register.password2send("123abc");
		po_cscart_register.birthday();
		po_cscart_register.birthdayMonth();
		po_cscart_register.birthdayYear();
		po_cscart_register.birthdayDate();
		Thread.sleep(4000);
		po_cscart_register.finalregister();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//driver.quit();
	}

}
