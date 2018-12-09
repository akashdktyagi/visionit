package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_search {
	WebDriver driver;
	
	  public po_search(WebDriver search)
	{
		this.driver=search;	
	}
	  
	  @FindBy(how=How.ID,using="search_input")
	  WebElement search;
	  
	  @FindBy(how=How.XPATH,using="//button[@title='Search']")
	  WebElement click_button;
	  
	  public void search(String arg) 
		{
			search.sendKeys(arg);
		}
	  
	  public void click_search_button()
	  {
		  click_button.click();
	  }
	

}



