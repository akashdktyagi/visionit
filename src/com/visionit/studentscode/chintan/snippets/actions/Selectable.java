package com.visionit.studentscode.chintan.snippets.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Selectable//
public class Selectable {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
	Actions action=new Actions(driver);
			
			driver.get("https://jqueryui.com");
			driver.findElement(By.linkText("Selectable")).click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.switchTo().frame(0);
			
			Thread.sleep(3000);
			
			WebElement select=driver .findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
			
			action.click(select).build().perform();
		

		}

	}



