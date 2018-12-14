package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_megamenu {
	WebDriver driver;
	public  po_megamenu(WebDriver search)
	{
		this.driver=search;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	WebElement electronic;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[4]/a[2]")
	WebElement apparel;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[5]/a[2]")
	WebElement SportsOutdoors;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[6]/a[2]")
	WebElement OfficeSupplies;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[7]/a[2]")
	WebElement VideoGames;

	
	public void click_on_electronic() 
	{
		Actions action = new Actions(driver);
	 	action.moveToElement(electronic).build().perform();
	 	electronic.click();
	}
		
	public void click_on_apparel() 
	{
		Actions action = new Actions(driver);
	 	action.moveToElement(apparel).build().perform();
	 	apparel.click();
	}
	
	public void click_on_SportsOutdoors() 
	{
		Actions action = new Actions(driver);
	 	action.moveToElement(SportsOutdoors).build().perform();
	 	SportsOutdoors.click();
	}
	
	public void click_on_OfficeSupplies() 
	{
		Actions action = new Actions(driver);
	 	action.moveToElement(OfficeSupplies).build().perform();
	 	OfficeSupplies.click();
	}
		
		
	public void click_on_VideoGames() 
	{
		Actions action = new Actions(driver);
	 	action.moveToElement(electronic).build().perform();
	 	 VideoGames.click();
	}
	

		
}



