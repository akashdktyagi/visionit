package com.visionit.studentscode.pallavi.product.po;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.visionit.studentscode.pallavi.product.reusable.ScreenShots;

public class CartLogin 
{
	WebDriver driver;
	
	public CartLogin(WebDriver log)
	{
		this.driver=log;
	}
	@FindBy(how=How.LINK_TEXT,using="My Account")
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using="//*[@id='login_main_login']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//*[@id='psw_main_login']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='remember_me_main_login']")
	WebElement chkbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="//*[@id='tygh_container']/div[3]/div")
	WebElement errmesg;
	
	@FindBy(how=How.XPATH,using="//*[@id='account_info_4']/div[2]/a")
	WebElement logout;
	
	public void login()
	{
		
		/*
		try{
			login.click();	
		}catch(Exception e){
			try{
				login.click();	
			}catch(Exception e1){

				login.click();	
			}
		}
		*/
		
		for (int i=0;i<=15;i++){
			
			try{
				Thread.sleep(1000);
				login.click();
				break;
				
			}catch(Exception e){
				//do nothing
			}//end catch
			
		}//end for

	}
	
	public void signin()
	{
		signin.click();
	}
	
	public void setlogin(String user, String pass)
	{
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
		chkbox.click();
		loginbutton.click();
	}
	
	public void errormessage(String name)
	{
		
		if (errmesg.isDisplayed())
		{
			ScreenShots s = new ScreenShots();
			s.getScrrenShot(driver,name );
		}
	}
	public void signout()
	{
		logout.getText();
	}
	
}
