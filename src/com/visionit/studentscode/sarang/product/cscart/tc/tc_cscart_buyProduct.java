package com.visionit.studentscode.sarang.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_buyProduct;

public class tc_cscart_buyProduct
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Vision\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.cs-cart.com");
			//System.out.println("CS Cart Site is Opened Successfully"); 
	  }
	  
	  @Test
	  public void purchaseDextop() throws InterruptedException  
	  {
		  po_cscart_buyProduct po_cscart_buyProduct = PageFactory.initElements(driver, po_cscart_buyProduct.class);
		  po_cscart_buyProduct.myaccount();
		  po_cscart_buyProduct.signin();
		  po_cscart_buyProduct.setusername("customer@example.com");
		  po_cscart_buyProduct.setpassword("customer");
		  po_cscart_buyProduct.signinbtn();
		  po_cscart_buyProduct.howerOnElectronics();
		  po_cscart_buyProduct.click_on_computers_dextop();
		  po_cscart_buyProduct.click_on_ASUS_CP6130();
		  po_cscart_buyProduct.click_on_addToCart();
		  Thread.sleep(5000);
		  po_cscart_buyProduct.click_on_mycart();
		  po_cscart_buyProduct.click_on_checkout();
		  po_cscart_buyProduct.click_on_continue();
		  po_cscart_buyProduct.insert_credit_card_no("1234122312124545");
		  po_cscart_buyProduct.insert_credit_card_month("12");
		  po_cscart_buyProduct.insert_credit_card_year("2019");
		  po_cscart_buyProduct.insert_credit_card_cvv("123");
		  po_cscart_buyProduct.insert_credit_card_holder_name("Donald Trump");
		  po_cscart_buyProduct.insert_comment("Please ship my order ASAP!");
		  po_cscart_buyProduct.click_on_subscribe_for_news_letter();
		  po_cscart_buyProduct.click_on_submit_my_order();
	  }
	  

	  @AfterMethod
	  public void afterMethod() 
	  {
		  driver.quit();
	  }

}
