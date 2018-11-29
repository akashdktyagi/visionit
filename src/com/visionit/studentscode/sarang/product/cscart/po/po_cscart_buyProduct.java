package com.visionit.studentscode.sarang.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_cscart_buyProduct
{
	WebDriver driver;
	public po_cscart_buyProduct(WebDriver elec) 
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
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pagination_contents\"]/div[2]/div[1]/div/form/div[2]/bdi/a")
	WebElement click_on_ASUS_CP6130;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"button_cart_214\"]")
	WebElement click_on_addToCart;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sw_dropdown_8\"]/a/span/span[1]")
	WebElement click_on_mycart;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dropdown_8\"]/div/div[2]/div[2]/a")
	WebElement click_on_checkout;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"step_three_but\"]")
	WebElement click_on_continue;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"credit_card_number_1\"]")
	WebElement insert_credit_card_no;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"credit_card_month_1\"]")
	WebElement insert_credit_card_month;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"credit_card_year_1\"]")
	WebElement insert_credit_card_year;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"credit_card_cvv2_1\"]")
	WebElement insert_credit_card_cvv;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"credit_card_name_1\"]")
	WebElement insert_credit_card_holder_name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content_payments_tab1\"]/form/div[1]/div[2]/div[1]/textarea")
	WebElement insert_credit_comment;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content_payments_tab1\"]/form/div[1]/div[2]/div[1]/textarea")
	WebElement insert_comment;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"subsciption_tab1\"]/div/label/input")
	WebElement click_on_subscribe_for_news_letter;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"place_order_tab1\"]")
	WebElement click_on_submit_my_order;
	
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
	
	public void howerOnElectronics() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(click_on_ele).build().perform();
		//click_on_ele.click();
	}
	
	public void click_on_computers_dextop()
	{
		click_on_computers_dextop.click();
	}
	
	public void click_on_ASUS_CP6130()
	{
		click_on_ASUS_CP6130.click();
	}
	
	public void click_on_addToCart()
	{
		click_on_addToCart.click();
	}
	
	public void click_on_mycart()
	{
		click_on_mycart.click();
	}
	
	public void click_on_checkout()
	{
		click_on_checkout.click();
	}
	
	public void click_on_continue()
	{
		click_on_continue.click();
	}
	
	public void insert_credit_card_no(String no)
	{
		insert_credit_card_no.sendKeys(no);
	}
	
	public void insert_credit_card_month(String month)
	{
		insert_credit_card_month.sendKeys(month);
	}
	
	public void insert_credit_card_year(String year)
	{
		insert_credit_card_year.sendKeys(year);;
	}
	
	public void insert_credit_card_cvv(String cvv)
	{
		insert_credit_card_cvv.sendKeys(cvv);
	}
	
	public void insert_credit_card_holder_name(String name)
	{
		insert_credit_card_holder_name.sendKeys(name);
	}
	
	public void insert_comment(String comment)
	{
		insert_comment.sendKeys(comment);
	}
	
	public void click_on_subscribe_for_news_letter()
	{
		click_on_subscribe_for_news_letter.click();
	}
	
	public void click_on_submit_my_order()
	{
		click_on_submit_my_order.click();
	}
}
