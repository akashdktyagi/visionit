package com.visionit.studentscode.pallavi.fw.product.CsCart.tc;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.visionit.studentscode.pallavi.fw.product.CsCart.reusables.PropertyFile;


public class BaseTest 
{
	WebDriver driver;
	@Parameters("browsername")
	@BeforeClass
	public void precondition(String browsername)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", PropertyFile.getProperty("ChromeExe"));
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", PropertyFile.getProperty("IEexe"));
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(PropertyFile.getProperty("ActitimeURL"));
	}
	
	@AfterClass
	public void postcondition()
	{
		driver.close();
	}
}
