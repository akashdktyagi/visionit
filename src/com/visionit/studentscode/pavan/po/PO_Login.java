package com.visionit.studentscode.pavan.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Login
{
	WebDriver driver;
	PO_Login(WebDriver driver)
	{
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log;
	/*@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account_Log;
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__primary']")
	WebElement Sign_out;
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__primary']")
	WebElement Success;*/
	
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account1;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in1;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username1;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password1;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log1;
	@FindBy(how=How.XPATH,using="//*[@id='tygh_container']/div[3]/div")
	WebElement Error;
	
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account2;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in2;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username2;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password2;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log2;
	@FindBy(how=How.XPATH,using="//*[@id='tygh_container']/div[3]/div")
	WebElement Error1;
	
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account3;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in3;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username3;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password3;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log3;
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__primary']")
	WebElement Sign_Out3;
	
	public void My_Account() 
	{
		My_Account.click();
		}
	public void Sign_in()
	{
		Sign_in.click();
		}
	public void Username()
	{
		Username.clear();
		Username.sendKeys("customer@example.com");
	}

	public void Password()
	{
		Password.clear();
		Password.sendKeys("customer");
	}

	public void Sign_In_Log()
	{
		Sign_In_Log.click();
	}
	/*public void My_Account_Log()
	{
		My_Account_Log.click();
	}
	public void Sign_out()
	{
		Sign_out.click();
	}*/
	/*public void Success()
	{
		Success.click();
	}*/
	public void My_Account1() 
	{
		My_Account1.click();
		}
	public void Sign_in1()
	{
		Sign_in1.click();
		}
	public void Username1()
	{
		Username1.clear();
		
		Username1.sendKeys("customer@egxample.com");
	}

	public void Password1()
	{
		Password1.clear();
		Password1.sendKeys("customer");
	}
	public void Sign_In_Log1()
	{
		Sign_In_Log1.click();
	}
	public void error()
	{
		Error.getText();
	}
	public void My_Account2() 
	{
		My_Account2.click();
	}
	public void Sign_in2()
	{
		Sign_in2.click();
	}
	public void Username2()
	{
		Username2.clear();
		Username2.sendKeys("customer@example.com");
	}

	public void Password2()
	{
		Password2.clear();
		Password2.sendKeys("custemer");
	}
	public void Sign_In_Log2()
	{
		Sign_In_Log2.click();
	}
	public void error1()
	{
		Error1.getText();
	}
	public void My_Account3() 
	{
		My_Account3.click();
	}
	public void Sign_in3()
	{
		Sign_in3.click();
	}
	public void Username3()
	{
		Username3.clear();
		Username3.sendKeys("");
	}

	public void Password3()
	{
		Password3.clear();
		Password3.sendKeys("");
	}
	public void Sign_In_Log3()
	{
		Sign_In_Log3.click();
	}
	public void Sign_Out3()
	{
		Sign_Out3.click();
	}
}
