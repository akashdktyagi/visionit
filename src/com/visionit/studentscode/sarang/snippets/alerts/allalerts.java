package com.visionit.studentscode.sarang.snippets.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class allalerts 
{

	WebDriver driver;
  @BeforeMethod
  public void beforeMethod()
  {

	  	System.out.println("Hi Before Method Run Successfully");
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver");
		 
  }
  
  @Test(priority=1)
  public void simpleAlerts() throws InterruptedException
  {
	  WebElement simpleAlert_btn = driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button"));
	  simpleAlert_btn.click();
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000); // to see action is being performed...
  }
  
  @Test(priority=2)
  public void confirmPopUpAlert() throws InterruptedException
  {
	  WebElement confirmPopUpAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button"));
	  confirmPopUpAlert.click();
	  driver.switchTo().alert().accept(); 
	  Thread.sleep(2000); // to see action is being performed
	  WebElement confirmPopUpAlert1 = driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button"));
	  confirmPopUpAlert1.click();
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(2000); // to see action is being performed.
	  
  }
  
  @Test(priority=0)
  public void sendkeytoPopUpAlert() throws InterruptedException
  {
	  WebElement sendkeytoPopUpAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button"));
	  sendkeytoPopUpAlert.click();
	  Alert alert = driver.switchTo().alert();
	  alert.sendKeys("Hi there");
	  Thread.sleep(5000); // to see action is being performed
	  WebElement sendkeytoPopUpAlert1 = driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button"));
	  sendkeytoPopUpAlert1.click();
	  driver.switchTo().alert().dismiss();
	  
  }
  

  
  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
