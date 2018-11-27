package com.visionit.studentscode.sarang.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_login;

public class tc_cscart_login
{
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com");
		//System.out.println("CS Cart Site is Opened Successfully"); 
	}
	
	@Test
  public void tc1_login_validate()
	{
		//Thread.sleep(3000);
		po_cscart_login po_cscart_login = PageFactory.initElements(driver, po_cscart_login.class);
		po_cscart_login.myaccount();
		po_cscart_login.signin();
		po_cscart_login.setusername("customer@example.com");
		po_cscart_login.setpassword("customer");
		po_cscart_login.signinbtn();
		/*String Expected = "Sign out";
		String Actual = driver.findElement(By.className("ty-btn ty-btn__primary")).getText();
		Reporter.log(Actual);
		System.out.println(Actual);*/
		
	}

	@AfterMethod
  public void afterMethod()
	{
		//driver.quit();
		
  }


}
