package com.visionit.studentscode.chintan.snippets.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Droppable//
public class Draggable {

		public static void main(String[] args)
		{
			//chrome driver set peoperty
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			//new chrome driver
			WebDriver driver=new ChromeDriver();
			
			//maximze window
			driver.manage().window().maximize();
			
			//action object
			Actions action=new Actions(driver);
			
			//get the URL
			driver.get("https://jqueryui.com/draggable/");
			
			//implicitlyWait
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//switching form parentframe to childframe
			driver.switchTo().frame(0);
			
			//find element
			WebElement drag=driver .findElement(By.id("draggable"));
			
			//action.dragAndDropBy(drag, 60, 40).build().perform();
			
			//clickAndHold command and perform 
			action.clickAndHold(drag).moveByOffset(150, 50).release(drag).perform();
			
		
			
		}

	}



