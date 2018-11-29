package com.visionit.studentscode.pavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action_Resizable
{
	WebDriver driver;
	 @BeforeMethod
	 public void beforeM()
	 {
		  System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/resizable/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	  @Test 
	  public void Resizable() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		  WebElement Drag1=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']"));
		  Actions act1 = new Actions(driver);
		  act1.clickAndHold(Drag1).moveByOffset(200, 50).build().perform();
		  Thread.sleep(3000);
		  }
}
