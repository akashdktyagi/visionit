package com.visionit.studentscode.pallavi.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_to_Cart
{
	WebDriver driver;
	
	public Add_to_Cart(WebDriver cart)
	{
		this.driver=cart;
	}
	
	@FindBy(how=How.ID,using="search_input")
	WebElement search1;
	
	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	WebElement searchclick;
	
	//@FindBy(how=How.XPATH,using="//*[@id='pagination_contents']/div[3]/div[2]/div/form/div[5]/div/a")
	//WebElement quickview..;
	
	@FindBy(how=How.XPATH,using="//*[@id='det_img_71']")
	WebElement clk;
	
	@FindBy(how=How.XPATH,using="//button[@id='button_cart_71']")
	WebElement add;
	
	public void search(String arg)
	{
		search1.sendKeys(arg);
	}
	public void click()
	{
		searchclick.click();
	}
	/*
	public void viewq()
	{
        Actions a = new Actions(driver);
		
		a.moveToElement(quickview).perform();
		quickview.click();
	}  */
	public void clickimg()
	{
		clk.click();
	}
	public void addcrt()
	{
		Actions a = new Actions(driver);
		a.moveToElement(add).perform();
		add.click();
	}
}
