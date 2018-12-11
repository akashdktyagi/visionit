package com.visionit.studentscode.sarang.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_cscart_pricesliderselector
{
	
WebDriver driver;
	
	public po_cscart_pricesliderselector(WebDriver elec) 
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
	
	@FindBy(how=How.LINK_TEXT,using="Desktops")
	WebElement click_on_computers_dextop;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"slider_31_1\"]/span[1]")
	WebElement click_on_left_slidder_btn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"slider_31_1\"]/span[2]")
	WebElement click_on_right_slidder_btn;
	
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
	
	public void click_on_computers_dextop()
	{
		click_on_computers_dextop.click();
	}
	
	public void click_on_left_slidder_btn()
	{
		Actions left_slider_btn = new Actions(driver);
		left_slider_btn.clickAndHold(click_on_left_slidder_btn).moveByOffset(66, 0).release(click_on_left_slidder_btn).build().perform();	
		//click_on_left_slidder_btn.click();
	}
	
	public void click_on_right_slidder_btn()
	{
		Actions right_slidder_btn = new Actions(driver);
		right_slidder_btn.clickAndHold(click_on_right_slidder_btn).moveByOffset(-160, 0).release(click_on_right_slidder_btn).build().perform();
		
	}
	
}
