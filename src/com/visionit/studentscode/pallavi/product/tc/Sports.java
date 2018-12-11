package com.visionit.studentscode.pallavi.product.tc;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.pallavi.product.po.SportsOutdoors;
import com.visionit.studentscode.pallavi.product.reusable.PropertyFile;

public class Sports 
{

	WebDriver driver;
	  WebElement priceSlider;
	  WebElement enterprice;
	  @Test(priority=1)
	  public void f() throws InterruptedException 
	  {
		  SportsOutdoors sportsOutdoors=PageFactory.initElements(driver, SportsOutdoors.class);
		  sportsOutdoors.sports();
		  sportsOutdoors.bike();
		  //assertion code
		 /* sportsOutdoors.sliderdisp();
		  assertTrue(priceSlider.isDisplayed());
		  Dimension sliderSize = priceSlider.getSize();
		  int sliderWidth = sliderSize.getWidth();
			
			int xCoord = priceSlider.getLocation().getX();
			Actions builder = new Actions(driver);   
			builder.moveToElement(priceSlider).click().dragAndDropBy(priceSlider,xCoord + sliderWidth, 0).build().perform();
			 
			int priceValue = Integer.parseInt(enterprice.getAttribute("value"));
			assertEquals(priceValue, 1000000);	
			String sliderPercent = priceSlider.getAttribute("style");
			assertTrue(sliderPercent.contains("left: 100")); */
		  
		 //sportsOutdoors.MoveSlider();
		  Reporter.log("Verification1 started", true);
		  sportsOutdoors.Select_Price();
		  Reporter.log("Verification1 stopped", true);
			
	  }
	  						
  
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(PropertyFile.getProperty("url"));
		  driver.manage().window().maximize();
	  }
	
	  @BeforeClass
	  public void beforeClass()
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "../visionit/resources1/chromedriver.exe");
	  }  
}
