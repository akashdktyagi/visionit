package com.visionit.studentscode.pavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action_Drag_Drop 
{
	 WebDriver driver;
	 @BeforeMethod
	 public void beforeM()
	 {

		  System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	  @Test(priority=2)
	  public void Freame1() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Draggable")).click();
		  driver.switchTo().frame(0);
		  WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		  Actions a = new Actions(driver);
		  a.dragAndDropBy(dragelement, 150, 150).build().perform();
		  Thread.sleep(3000);
		   }
	  @Test (priority=1)
	  public void Droppable() throws InterruptedException
	  {
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Droppable")).click();
		 driver.switchTo().frame(0);
		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions act = new Actions(driver);
		// act.doubleClick(drag);
		// Thread.sleep(3000);
		 act.contextClick(drag);
		 Thread.sleep(3000);
		// act.dragAndDrop(drag, drop).perform();
		// Thread.sleep(3000);
		 act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		 Thread.sleep(3000);
	}

	  @AfterMethod
	  public void afterM()
	  {
		  driver.quit();
	  }
	}


