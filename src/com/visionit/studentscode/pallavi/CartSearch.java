package com.visionit.studentscode.pallavi.fw.product.CsCart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartSearch
{
	WebDriver driver;
	
	public CartSearch(WebDriver search)
	{
		this.driver=search;
	}
	
	@FindBy(how=How.ID,using="search_input")
	WebElement search1;
	
	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	WebElement searchclick;
	
	public void search(String arg)
	{
		search1.sendKeys(arg);
	}
	public void click()
	{
		searchclick.click();
	}
}
