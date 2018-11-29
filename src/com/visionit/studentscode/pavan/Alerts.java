package com.visionit.studentscode.pavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts 
{
	 WebDriver driver;
	 @Test
	 public void alert() throws InterruptedException
	 {

		  System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.ksrtc.in/oprs-web/ticket/waitlist.do");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("searchBtn"));
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();
}
}