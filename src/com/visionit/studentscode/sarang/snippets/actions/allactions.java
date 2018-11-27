package com.visionit.studentscode.sarang.snippets.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class allactions 
{
	WebDriver driver;
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("Hi Before Method Run Successfully");
			System.setProperty("webdriver.chrome.driver", "F:\\eclipse-committers-photon-R-win32"
					+ "\\eclipse\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/");
			System.out.println("JQuery Site is Opened Successfully"); 
	  }
	  
	  @Test(priority=1,groups="smoke")
	  public void draggable() throws InterruptedException 
	  {
		  WebElement draggableLinkClick = driver.findElement(By.linkText("Draggable"));
		  draggableLinkClick.click();
		  Thread.sleep(5000);
		 // WebElement switchToFrameDragabble = driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(0);  //by index value of frame
		  WebElement dragBox = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		  Actions dragAction = new Actions(driver);
		  dragAction.clickAndHold(dragBox).build().perform();
		  dragAction.dragAndDropBy(dragBox, 200, 0).build().perform();
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  
	  }

	  @Test(priority=2,groups="smoke")
	  public void dropable() throws InterruptedException
	  {
		  WebElement dropableLinkClick = driver.findElement(By.linkText("Droppable"));
		  dropableLinkClick.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  WebElement dragBox = driver.findElement(By.id("draggable"));
		  WebElement dropBox= driver.findElement(By.id("droppable"));
		  Actions dragndropAction = new Actions(driver);
		  dragndropAction.clickAndHold(dragBox).build().perform();;
		  dragndropAction.dragAndDrop(dragBox, dropBox).build().perform();
		  Thread.sleep(2000);
	  }
	  
	  @Test(priority=3,groups="smoke")
	  public void resizable() throws InterruptedException
	  {
		  WebElement resizableLinkClick = driver.findElement(By.linkText("Resizable"));
		  resizableLinkClick.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  WebElement resizeArrow = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		  Actions resizeAction = new Actions(driver);
		  resizeAction.clickAndHold(resizeArrow).build().perform();
		  resizeAction.dragAndDropBy(resizeArrow, 210, 210).build().perform();
		  Thread.sleep(2000);
		  
	  }
	  
	  @Test(priority=1,groups="sanity")
	  public void selectable() throws InterruptedException
	  {
		  WebElement selectableLinkClick = driver.findElement(By.linkText("Selectable"));
		  selectableLinkClick.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  WebElement selectItem4 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		  selectItem4.click();
		  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority=0,groups="sanity")
	  public void Sortable() throws InterruptedException
	  {
		  WebElement sortableLinkClick = driver.findElement(By.linkText("Sortable"));
		  sortableLinkClick.click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  WebElement selectItem6 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
		  WebElement selectItem2 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
		  Actions clickItem6action = new Actions(driver);
		  clickItem6action.clickAndHold(selectItem6).release(selectItem2).build().perform();
		  //clickItem6action.dragAndDropBy(selectItem6, 0, 44).build().perform();
		  Thread.sleep(5000);
		  
	  }
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

	
}
