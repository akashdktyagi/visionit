package com.visionit.studentscode.shrungari.snippet.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class draggable
{
		WebDriver driver;
	  
	    @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\JAVA software\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://jqueryui.com/");
}



@Test(priority=1)
public void draggable() throws InterruptedException
{
	WebElement draggableLinkClick = driver.findElement(By.linkText("Draggable"));
	  draggableLinkClick.click();
	  Thread.sleep(4500);
	  driver.switchTo().frame(0);  //by index value of frame
	  WebElement dragBox = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  Actions dragAction = new Actions(driver);//
	  dragAction.clickAndHold(dragBox).build().perform();
	  dragAction.dragAndDropBy(dragBox, 350, 0).build().perform();
	  driver.switchTo().defaultContent();
	  Thread.sleep(2500);

}
}
