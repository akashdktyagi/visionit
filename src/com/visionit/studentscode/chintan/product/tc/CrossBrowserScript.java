package com.visionit.studentscode.chintan.product.tc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserScript
{
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = null;
		
		Properties pro=new Properties();
		FileInputStream FIS=new FileInputStream("G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\CS_cart\\cscart.properties");
		pro.load(FIS);
		
		String browsername=pro.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.get(pro.getProperty("URL"));
		
	}
}
