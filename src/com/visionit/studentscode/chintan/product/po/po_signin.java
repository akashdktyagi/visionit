package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.visionit.studentscode.chintan.product.reusables.screenshort_file;

public class po_signin {
	WebDriver driver;

	public po_signin(WebDriver signin)
	{
		this.driver=signin;	
	}
	@FindBy(how=How.LINK_TEXT,using="My Account")
	WebElement click_on_my_account;
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	WebElement click_on_signin;
	
	@FindBy(how=How.ID,using="login_main_login")
	WebElement click_on_email;
	
	@FindBy(how=How.ID,using="psw_main_login")
	WebElement click_on_password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement click_on_sign;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	 WebElement click_on_electronic;
	 
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_container\"]/div[3]/div")
	 WebElement click_on_shot;


	 public void click_on_myaccount() 
		{
		 	click_on_my_account.click();
		}
	 
	 public void click_on_signin() 
		{
		 	click_on_signin.click();
		}
	 
	 public void email(String arg) 
		{
		 click_on_email.clear();   
		 click_on_email.sendKeys(arg);
		 	                                                                                                                                                                                                                                                                       
		}
	 public void password(String arg) 
		{
		 	click_on_password.clear();
		 	click_on_password.sendKeys(arg);
		}
	
	 public void click_on_sign() 
		{
		 if( click_on_sign.isDisplayed())
		 click_on_sign.click();
		}
	 
	 public void click_on_screenshot(String name) 
		{
		 if(click_on_shot.isDisplayed())
		 {
			 screenshort_file s=new screenshort_file();
					 s.getscreenshot(driver, name);
		 }
		}
}
		
		


