package com.visionit.studentscode.chintan.snippets.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//sortable//
public class Sortable {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			Actions action=new Actions(driver);
			
			driver.get("https://jqueryui.com");
			driver.findElement(By.linkText("Sortable")).click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.switchTo().frame(0);
			
			//Thread.sleep(3000);
			
			WebElement select=driver .findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
			
			action.clickAndHold(select).dragAndDropBy(select, 0, 100).build().perform();

		}

	}



