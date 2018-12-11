package com.visionit.studentscode.chintan.product.po;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;







public class po_electronic {
	WebDriver driver;
	
	public po_electronic(WebDriver search)
	{
		this.driver=search;	
	}
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	 WebElement click_on_electronic;
	 
/*@FindBy(how=How.LINK_TEXT,using="Computers")
	WebElement click_on_computer;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pagination_contents\"]/div[3]/div[1]/div/form/div[5]")
	WebElement click_on_space;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pagination_contents\"]/div[3]/div[1]/div/form/div[5]/div/a")
	WebElement click_on_quick_view;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"det_img_227\"]")
	WebElement click_on_image;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"button_cart_227\"]")
	WebElement click_on_addcart;

	 @FindBy(how=How.XPATH,using="//*[@id=\"sw_dropdown_8\"]/a/i")
		WebElement click_my_cart;*/
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"slider_31_1\"]/span[1]")
		WebElement left_slider;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"slider_31_1\"]/span[2]")
		WebElement right_slider;
	
	 @FindBy(how=How.ID,using="slider_31_1_left")
		WebElement amount;
	 
	 
	 public void click_on_electronic() 
		{
		 	Actions action = new Actions(driver);
		 	action.moveToElement(click_on_electronic).build().perform();
		 	click_on_electronic.click();
		}
	 
	/* public void click_on_computer() 
		{
		 	
		 click_on_computer.click();
		}*/
	  
/*	 public void click_on_space() 
		{
		 	
		 Actions action = new Actions(driver);
		 action.moveToElement(click_on_space).perform();
		 click_on_quick_view.click();
		}
	 
	 public void click_on_quickview() 
		{
		 	
		 click_on_quick_view.click();
		}
	 
	 public void click_on_images() 
		{
		
		 click_on_image.click();
		}
	 
	 public void click_on_cart() 
		{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 click_on_addcart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button_cart_227\"]")));
		 click_on_addcart.click();
		}
	 
		public void click_my_cartss()
		{
			 WebDriverWait wait=new WebDriverWait(driver, 20);
			click_my_cart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sw_dropdown_8\"]/a/i")));
			click_my_cart.click();
		}*/
		
		public void left_sliders()
		{
			Actions action = new Actions(driver);
			
			action.clickAndHold( left_slider).moveByOffset(150, 0).release( left_slider).build().perform();
			 left_slider.click();
			
		}
		
		public void right_sliders() 
		{
			Actions action = new Actions(driver);
			action.clickAndHold(right_slider).moveByOffset(-100, 0).release(right_slider).build().perform();
			
		}
	 
	 	public void amounts()
		{
	 		 amount.clear();
			 amount.sendKeys(Keys.chord("1000",Keys.TAB));
		}

}
