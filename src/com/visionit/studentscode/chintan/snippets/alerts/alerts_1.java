package com.visionit.studentscode.chintan.snippets.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



//alerts//

public class alerts_1 {
		WebDriver Driver;
		  @Test
		  public void f() throws InterruptedException
		  {
			  //Simple Alert Pop up
			  Driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
			  Thread.sleep(5000);
			  Driver.switchTo().alert().accept();
			  
			 // Confirm Alert box
			  Driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();
			  Thread.sleep(5000);
			  Driver.switchTo().alert().dismiss();
			  
			  //Prompt Alert box
			  Driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button")).click();
			  Thread.sleep(5000);
			  //System.out.println( Driver.switchTo().alert().getText());
			  Driver.switchTo().alert().sendKeys("hii");
			  
			  
			  
              
		  }
		  @BeforeMethod
		  public void beforeMethod() 
		  {
			  Driver=new ChromeDriver();
			  Driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			  Driver.manage().window().maximize();
		  }

		  @BeforeClass
		  public void beforeClass() 
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  }

		  
		


	}

