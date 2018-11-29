package com.visionit.studentscode.pallavi.fw.product.CsCart.po;


import java.util.concurrent.TimeUnit;

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
	WebElement sport1;
	
	@FindBy(how=How.LINK_TEXT,using="Bikes")
	WebElement bikes;
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
