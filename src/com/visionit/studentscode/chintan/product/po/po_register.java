package com.visionit.studentscode.chintan.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class po_register {
	WebDriver driver;
	public po_register(WebDriver register)
	{
		this.driver=register;	
	}

	@FindBy(how=How.LINK_TEXT,using="My Account")
	WebElement click_on_my_account;
	
	@FindBy(how=How.XPATH,using=" //*[@id=\"account_info_4\"]/div[2]/a[2]")
	WebElement click_on_registers;
	
	@FindBy(how=How.ID,using="email")
	WebElement email;
	
	@FindBy(how=How.ID,using="password1")
	WebElement password1;
	
	@FindBy(how=How.ID,using="password2")
	WebElement password2;
	
	@FindBy(how=How.ID,using="birthday")
	WebElement birth;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	WebElement month;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	WebElement year;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button")
	WebElement click_on_register;
	
	
	
	public void click_on_myaccount() 
	{
	 	click_on_my_account.click();
	}
 
 public void click_on_registers() 
	{
	 	click_on_registers.click();
	}
 
 public void emailid(String arg) 
	{
	 	email.sendKeys(arg);
	}
 
 public void password1(String arg) 
	{
	 	password1.sendKeys(arg);
	}
 
 public void password2(String arg) 
	{
	 	password2.sendKeys(arg);
	}
 
 public void birthdate() 
	{
	 	birth.click();
	}
 
 public void months() 
	{
	 	Select mon=new Select(month);
	 	mon.selectByVisibleText("Apr");
	 	month.click();
	}
 
 public void years() 
	{
	 	Select yer=new Select(year);
	 	yer.selectByVisibleText("1995");
	 	year.click();
	}
 public void dates() 
	{
	 	date.click();
	}
 
 public void click_on_register_button() 
	{
	 	click_on_register.click();
	}

}



