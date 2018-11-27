package com.visionit.studentscode.bindiya.snippets.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selectable {
	WebDriver driver;
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://jqueryui.com/");
	  }
	
	
@Test(priority=1)
	public void selectable() throws InterruptedException

	{
		  WebElement selectableLinkClick = driver.findElement(By.linkText("Selectable"));
		  selectableLinkClick.click();
		  Thread.sleep(5000);
		  driver.switchTo().frame(0);
		  WebElement selectItem6 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		  selectItem6.click();
		  Thread.sleep(2500);

	}


}
