package com.visionit.studentscode.shrungari.snippet.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class simplealert {
		WebDriver driver;
		  
		
		  @BeforeMethod
		  public void beforeMethod() {
			  System.setProperty("webdriver.chrome.driver", "D:\\JAVA software\\chromedriver.exe");
			  driver = new ChromeDriver();
			 driver.manage().window().maximize();
			// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("http://toolsqa.com/");
		  }

		
		@Test(priority=1)
		public void alert1() throws InterruptedException
		{
			WebElement demo= driver.findElement(By.linkText("DEMO SITES"));
			demo.click();
			WebElement handle= driver.findElement(By.linkText("Handling Alerts using Selenium WebDriver"));
			handle.click();
			WebElement simple=driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button"));
			simple.click();
			Thread.sleep(10000);
			Alert alt=driver.switchTo().alert();
			alt.accept();//test ....
		}
		
		

	}


