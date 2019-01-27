
package com.visionit.studentscode.pallavi.product.po;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SportsOutdoors 
{
	WebDriver driver;
	
	public SportsOutdoors(WebDriver sports)
	{
		this.driver=sports;
	}
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[5]/a[2]")
	WebElement sport1; //click on sport mAain menu
	
	@FindBy(how=How.LINK_TEXT,using="Bikes")
	WebElement bikes; //click on sub menu bikes
	
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/ul")
	WebElement priceslider; //view price slider locator
	
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/span[2]")
	WebElement priceslider1; //view price slider locator
	
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1_left']")
	WebElement priceselector; //view price slider locator
	
		
	public void sports()
	{
		Actions a = new Actions(driver);
		
		a.moveToElement(sport1).perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//bikes.click().;
		
	}
	public void bike() throws InterruptedException
	{
		Thread.sleep(2000);
		bikes.click();
		
	}
	//left side selector
	public void sliderdisp()
	{
		//1st way
		
		Actions a1 = new Actions(driver);
		//a1.dragAndDropBy(priceslider,196,417).release().build().perform();
		//priceslider.click();
		
		//2nd way
		
		try{
		a1.clickAndHold(priceslider).moveByOffset(100, 0).release(priceslider).build().perform();
		priceslider.click();
		}catch(Exception e)
		{
			//do nothing
		}//end catch	
	}
	//right side selector
	public void MoveSlider()
	{
		try{
			Actions a2 = new Actions(driver);
			a2.clickAndHold(priceslider1).moveByOffset(0, 100000).release(priceslider1).build().perform();
			priceslider1.click();
			}catch(Exception e)
		{
				//do nothing
		}//end of catch block 
		
		/*Actions a2 = new Actions(driver);
		a2.dragAndDropBy(priceslider1,196,417).release().build().perform();
		priceslider1.click();*/
	}
	
	//selector by price
	public void Select_Price()
	{
		priceselector.clear();
		priceselector.sendKeys(Keys.chord("1000",Keys.TAB));//Use the Keys.chord() method 
		                                                     //to type a sequence of 
		                                                   //characters into the textbox.
//Assertion1 
		//The sequence includes the price value and the tab key.
		//he tab key is needed for updating the slider.
		try{
		String sliderpercent = priceselector.getAttribute("style");
		//slider percentage is stored in the style attribute of the slider element.
		assertTrue(sliderpercent.contains("left: 1000"));
		}catch(Exception e)
		{
			//do nothing
		}//end of catch
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
