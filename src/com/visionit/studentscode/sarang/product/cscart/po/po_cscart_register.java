package com.visionit.studentscode.sarang.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class po_cscart_register
{
WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="My Account")
	WebElement my_acc_click;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_4\"]/div[2]/a[2]") 
	WebElement register_btn_click;
	
	@FindBy(how=How.ID,using="email")
	WebElement emailid_send;
	
	@FindBy(how=How.ID,using="password1")
	WebElement password1_send;
	
	@FindBy(how=How.ID,using="password2")
	WebElement password2_send;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"birthday\"]")
	WebElement birthdate_box_click;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	WebElement birthdate_month_select;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	WebElement birthdate_year_select; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")
	WebElement birthdate_date_select; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button")
	WebElement finalregister_btn_click;
	
	public void myaccount()
	{
		my_acc_click.click();
	}
	
	public void register()
	{
		register_btn_click.click();
	}
	
	public void emailsend(String emailid)
	{
		emailid_send.sendKeys(emailid);;
	}
	
	public void password1send(String password1)
	{
		password1_send.sendKeys(password1);
	}
	
	public void password2send(String password2)
	{
		password2_send.sendKeys(password2);
	}
	
	public void birthday()
	{
		birthdate_box_click.click();
	}
	
	public void birthdayMonth()
	{
		birthdate_month_select.click();
		Select select = new Select(birthdate_month_select);
		select.selectByVisibleText("Dec");
	}
	
	public void birthdayYear()
	{
		birthdate_year_select.click();
		Select select = new Select(birthdate_year_select);
		select.selectByVisibleText("1990");
	}
	
	public void birthdayDate()
	{
		birthdate_date_select.click();
		Select select = new Select(birthdate_date_select);
		select.selectByVisibleText("20");
	}
	
	public void finalregister()
	{
		finalregister_btn_click.click();
	}
	

}
