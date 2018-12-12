package com.visionit.studentscode.sarang.snippets.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Simple_Data_Provider
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(dataProvider="WordpressData")
	public void loginWordpress(String Username,String Password)
	{

	driver.findElement(By.name("username")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
	
	}
	@DataProvider(name="WordpressData")
	public Object[][] passData()
	{
	Object[][] data=new Object[3][2];
	data[0][0]="john";
	data[0][1]="demo";
	
	data[1][0]="john1";
	data[1][1]="demo1";
	
	data[2][0]="john2";
	data[2][1]="demo2";
	
	return data;
	
			
	}
	@AfterMethod
	public void afterMethod()
	{
	driver.quit();
	}

	
}
