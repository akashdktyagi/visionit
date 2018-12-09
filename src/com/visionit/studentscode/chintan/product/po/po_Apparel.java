package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_Apparel {
WebDriver driver;
	
	public po_Apparel(WebDriver search) 
	{
		this.driver=search;	
	}
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[4]/a[2]")
	 WebElement click_on_apparel;

	 public void  click_on_apparel() 
		{
		 	Actions action = new Actions(driver);
		 	action.moveToElement( click_on_apparel).perform();
		 	 click_on_apparel.click();
		}


}



