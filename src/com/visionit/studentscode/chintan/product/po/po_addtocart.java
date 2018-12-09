package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_addtocart {

	WebDriver driver;
	public po_addtocart (WebDriver cart)
	{
		this.driver=cart;	
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"sw_dropdown_8\"]/a/i")
	WebElement click_on_cart;
	
	public void click_on_carts ()
	{
		click_on_cart.click();
	}
	

}



