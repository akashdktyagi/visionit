package com.visionit.studentscode.sarang.product.cscart.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_buyProduct;

public class tc_cscart_buyProduct
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.cs-cart.com");
			System.out.println("CS Cart Site is Opened Successfully"); 
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
		  //Thread.sleep(5000);
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  for(int i=0;i<=7;i++)
		  try 
		  {
			Thread.sleep(1000);
			po_cscart_buyProduct.click_on_mycart();
			
		  } 
		  catch (Exception e)
		  {
			// TODO: handle exception
		  }
		  po_cscart_buyProduct.click_on_checkout();
		  Thread.sleep(2000);
		  po_cscart_buyProduct.click_on_continue();
		  Thread.sleep(2000);
		  po_cscart_buyProduct.insert_credit_card_no("1234122312124545");
		  po_cscart_buyProduct.insert_credit_card_month("12");
		  po_cscart_buyProduct.insert_credit_card_year("2019");
		  po_cscart_buyProduct.insert_credit_card_cvv("123");
		  po_cscart_buyProduct.insert_credit_card_holder_name("Donald Trump");
		  po_cscart_buyProduct.insert_comment("Please ship my order ASAP!");
		  po_cscart_buyProduct.click_on_subscribe_for_news_letter();
		  Thread.sleep(2000);
		  po_cscart_buyProduct.click_on_submit_my_order();
		  WebElement Act_productplaced_msg = driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div/div/div[2]/div/div[1]/p"));
		  String product = Act_productplaced_msg.getText();
		  SoftAssert Assert_orderplaced = new SoftAssert();
		  Assert_orderplaced.assertEquals(product, "Congratulations! Your order has been successfully placed. Order details", 
				  "There is problem in buying a product functionality");
		  Reporter.log("Purchasing a product functionality via credit card is working properly");
	  }
	  

	  @AfterMethod
	  public void afterMethod() 
	  {
		 // driver.quit();
	  }

}
