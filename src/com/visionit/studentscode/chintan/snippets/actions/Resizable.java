package com.visionit.studentscode.chintan.snippets.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// Resizable//
public class Resizable {
	
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			Actions action=new Actions(driver);
			
			driver.get("https://jqueryui.com");
			driver.findElement(By.linkText("Resizable")).click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.switchTo().frame(0);
			
			Thread.sleep(3000);
			
			WebElement resizeable=driver .findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
			action.clickAndHold(resizeable).build().perform();
			action.dragAndDropBy(resizeable, 130,200).build().perform();

		}

	}



