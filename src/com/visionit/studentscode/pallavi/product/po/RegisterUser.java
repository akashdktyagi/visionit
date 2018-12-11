package com.visionit.studentscode.pallavi.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser 
{
	WebDriver driver;
	
	public RegisterUser(WebDriver reg)
	{
		this.driver=reg;
	}
	
	@FindBy(how=How.LINK_TEXT,using="My Account")   //click on my-account
	WebElement login;
	
	@FindBy(how=How.XPATH,using="//*[@id='account_info_4']/div[2]/a[2]")  //click on Register user
	WebElement register;
	
	@FindBy(how=How.XPATH,using="//*[@id='email']")   //email
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//*[@id='password1']") //pwd
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='password2']")    //retype pwd
	WebElement cnfrmpass;
	
	@FindBy(how=How.ID,using="birthday")
	WebElement dob;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div/div/select[1]")
	WebElement month;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div/div/select[2]")
	WebElement year;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[3]/a")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button")
	WebElement reg;
	
	public void register_user(String id, String pwd)
	{
		login.click();
		register.click();
		email.sendKeys(id);
		password.sendKeys(pwd);
		cnfrmpass.sendKeys(pwd);
		
	
	}
	public void selectcal()
	{
		dob.click();
	}
	public void selectmonth(String Month)
	{
		Select mon=new Select(month);
		mon.selectByVisibleText(Month);
		month.click();
	}
	
	public void selectyear(String Year)
	{
		Select yr=new Select(year);
		yr.selectByVisibleText(Year);
		year.click();
		date.click();
	}
	
	public void register()
	{
		reg.click();
	}
	
}
