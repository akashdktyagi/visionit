package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_checkout {
WebDriver driver;
	
	public  po_checkout(WebDriver check)
	{
	 this.driver=check;
	}
	
	@FindBy(how=How.NAME,using="user_login")
	WebElement username;	
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;	
	
	public void enter_usernam(String arg)
	{
		username.clear();
		username.sendKeys(arg);
	}
	
	public void enter_pasword(String arg)
	{
		password.clear();
		password.sendKeys(arg);
	}

}


