package src.com.visionit.studentscode.nikita.product.CScart.TC;

import org.testng.annotations.Test;

import src.com.visionit.studentscode.nikita.product.CScart.PO.PO_cscart_loginpage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TC_cscart_loginpage {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.cs-cart.com");
  }

  @Test
  public void TC_Login_validate() {
	PO_cscart_loginpage login= PageFactory.initElements(driver, PO_cscart_loginpage.class); 
	login.MyAccount();
	login.SignIn();
	login.SetUserName("customer@example.com");
	login.SetPassword("customer");
	login.Sign1_Click();
  }
  
  
  @AfterMethod
  public void afterMethod() {
  }

}