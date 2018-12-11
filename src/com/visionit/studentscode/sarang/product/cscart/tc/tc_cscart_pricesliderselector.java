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

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_pricesliderselector;



public class tc_cscart_pricesliderselector
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
	  public void pricesliderCscart() throws InterruptedException  
	  {
		  po_cscart_pricesliderselector po_cscart_pricesliderselector = PageFactory.initElements(driver, po_cscart_pricesliderselector.class);

		  po_cscart_pricesliderselector.myaccount();
		  po_cscart_pricesliderselector.signin();
		  po_cscart_pricesliderselector.setusername("customer@example.com");
		  po_cscart_pricesliderselector.setpassword("customer");
		  po_cscart_pricesliderselector.signinbtn();
		  po_cscart_pricesliderselector.click();
		  po_cscart_pricesliderselector.click_on_computers_dextop();
		  po_cscart_pricesliderselector.click_on_left_slidder_btn();
		  Thread.sleep(4000);
		  po_cscart_pricesliderselector.click_on_right_slidder_btn();
		  WebElement Act_product = driver.findElement(By.xpath("//*[@id=\"sec_discounted_price_217\"]"));
		  String product = Act_product.getText();
		  SoftAssert Assert_Act_product = new SoftAssert();
		  Assert_Act_product.assertEquals(product, "610.99", "the price selector is not working properly");
		  Reporter.log("Price slider is working perfectly");

	  }
	  

	  @AfterMethod
	  public void afterMethod() 
	  {
		 // driver.quit();
	  }
	
}
