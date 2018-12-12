package com.visionit.studentscode.sarang.product.cscart.tc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_login;

public class tc_cscart_login
{
	WebDriver driver;
	public static Properties pro;
	
	@BeforeMethod
	  public void beforeMethod() throws IOException  
	{	
		
		System.out.println("//Launching Different Browers Using .properties file");
		pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Vision\\eclipse-workspace\\Unicorn\\src\\config\\configurations.properties");
		pro.load(ip);
		String browserName = pro.getProperty("browser");//value of browser stored in.properties file and change it according to our need
		
		if(browserName.equals("chrome"))//launches chrome driver
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if (browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Vision\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Vision\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.get(pro.getProperty("url"));
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com");
		System.out.println("CS Cart Site is Opened Successfully"); */
	}
	
	@Test(priority=0,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_1(String DataUsername,String DataPassword) throws InterruptedException
	{	
		//Thread.sleep(3000);
		po_cscart_login po_cscart_login = PageFactory.initElements(driver, po_cscart_login.class);
		po_cscart_login.myaccount();
		po_cscart_login.signin();
		//po_cscart_login.setusername(pro.getProperty("username"));
		//po_cscart_login.setpassword(pro.getProperty("password"));
		po_cscart_login.setusername(DataUsername);
		po_cscart_login.setpassword(DataPassword);
		po_cscart_login.signinbtn();
		for(int i=1;i<=5;i++)
		{
		try 
		{
			try {
				Thread.sleep(2000);
				po_cscart_login.myaccount();
				
				break;
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		}	 
		
		String Expected = "SIGN OUT";
		String Actual = driver.findElement(By.xpath("//*[@id=\"account_info_4\"]/div[2]/a")).getText();
		
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("User is successfully login");
		
		
	}
	
	@Test(priority=1,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_2(String DataUsername,String DataPassword) throws InterruptedException
	{	
		po_cscart_login po_cscart_login = PageFactory.initElements(driver, po_cscart_login.class);
		po_cscart_login.myaccount();
		po_cscart_login.signin();
		//po_cscart_login.setusername(pro.getProperty("username"));
		//po_cscart_login.setpassword(pro.getProperty("password"));
		po_cscart_login.setusername(DataUsername);
		po_cscart_login.setpassword(DataPassword);
		po_cscart_login.signinbtn();
		for(int i=1;i<=5;i++)
		{
		try 
		{
			try {
				Thread.sleep(2000);
				po_cscart_login.myaccount();
				
				break;
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		}	 
		
		String Expected = "ERROR";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tygh_container\"]/div[3]/div/strong")).getText();
		
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("Invalid User ID with right password is unable to login");
		
		
	}
	
	@Test(priority=2,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_3(String DataUsername,String DataPassword) throws InterruptedException
	{	
		po_cscart_login po_cscart_login = PageFactory.initElements(driver, po_cscart_login.class);
		po_cscart_login.myaccount();
		po_cscart_login.signin();
		//po_cscart_login.setusername(pro.getProperty("username"));
		//po_cscart_login.setpassword(pro.getProperty("password"));
		po_cscart_login.setusername(DataUsername);
		po_cscart_login.setpassword(DataPassword);
		po_cscart_login.signinbtn();
		for(int i=1;i<=5;i++)
		{
		try 
		{
			try {
				Thread.sleep(2000);
				po_cscart_login.myaccount();
				
				break;
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		}	 
		
		String Expected = "\r\n" + 
				"        The username or password you have entered is invalid. Please try again.\r\n" + 
				"    ";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tygh_container\"]/div[3]/div/text()")).getText();
		System.out.println(Actual);
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("Valid ID with invalid password is unable to login");
		
		
	}
	
	@DataProvider(name="UserloginDataSet")
	public Object[][] passData()
	{
	Object[][] data=new Object[3][2];
	data[0][0]="customer@example.com";
	data[0][1]="customer";
	
	data[1][0]="john@gmail.com";
	data[1][1]="demo1";
	
	data[2][0]="john2@gmail.com";
	data[2][1]="demo2";
	
	return data;
	
			
	}

	@AfterMethod
  public void afterMethod()
	{
		//driver.quit();
		
  }




}
