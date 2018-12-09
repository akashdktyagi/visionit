package com.visionit.studentscode.chintan.product.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_search;



public class tc_search {
	static WebDriver Driver;
	@Parameters("browser")
	
  @Test
  public void f()
  {
		Driver.get("https://demo.cs-cart.com/stores/2a38bd53e2542cc1/");
		po_search po_search=PageFactory.initElements(Driver, po_search.class);
	  
	  po_search.search("computer");
	 po_search.click_search_button();
  }
 /* @BeforeMethod
  public void beforeMethod() 
  {
	  Driver=new ChromeDriver();
	  Driver.get("https://demo.cs-cart.com/stores/2a38bd53e2542cc1/");
	  Driver.manage().window().maximize();
	  
  }*/

  @BeforeTest
  @Parameters("browser")
  	public void setup(String browser)
  	{
	 if(browser.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		 Driver = new FirefoxDriver();
	 }
	 else if (browser.equalsIgnoreCase("chrome"))
	 {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 Driver=new FirefoxDriver(); 
	 }
	 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 //Driver.get("URL");
  }
}
	 

  
