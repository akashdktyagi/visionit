package com.visionit.studentscode.sarang.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_ele_demo
{
	WebDriver driver;
	
	public po_ele_demo(WebDriver elec) 
	{
		
		this.driver=elec;
	}
	
	@FindBy(how=How.LINK_TEXT,using="My Account")
	WebElement my_acc_click;
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	WebElement signin_btn_click;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login_main_login\"]")
	WebElement send_username;

	@FindBy(how=How.XPATH,using="//*[@id=\"psw_main_login\"]")
	WebElement send_password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement signin_btn_click1;

	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	WebElement click_on_ele;
	
	public void myaccount()
	{
		my_acc_click.click();
	}
	
	public void signin()
	{
		signin_btn_click.click();
	}

	public void setusername(String username)
	{
		send_username.clear();
		send_username.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		send_password.clear();
		send_password.sendKeys(password);
	}
	
	public void signinbtn()
	{
		signin_btn_click1.click();
	}
	
	
	public void click() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(click_on_ele).build().perform();
		//click_on_ele.click();
	}

}
