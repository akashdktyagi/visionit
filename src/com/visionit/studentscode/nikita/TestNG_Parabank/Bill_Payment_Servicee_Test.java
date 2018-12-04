package src.com.visionit.studentscode.nikita.TestNG_Parabank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Bill_Payment_Servicee_Test {
	
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\sachin\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://parabank.parasoft.com/");
	  System.out.println("Parabank opened Successfully");
	  WebElement UserName = driver.findElement(By.name("username"));
	  UserName.sendKeys("john");
	  WebElement PassWord = driver.findElement(By.name("password"));
	  PassWord.sendKeys("demo");
	  WebElement LogIn = driver.findElement(By.xpath("//input[@type='submit' and @class='button']"));
	  LogIn.click();
	  System.out.println("Login is Successsful");
	  
	  
	  
  }
  
  @Test
  public void TC_Bill_Payment_Servicee_Test() {
	  
	  WebElement UpdateProfile = driver.findElement(By.linkText("Bill Pay"));
	  UpdateProfile.click();
	  
	  WebElement Payee_Name = driver.findElement(By.name("payee.name"));
	  Payee_Name.sendKeys("Nikita");
	  
	  WebElement Address =driver.findElement(By.name("payee.address.street"));
	  Address.sendKeys("Texas");
	  
	  WebElement City = driver.findElement(By.name("payee.address.city"));
	  City.sendKeys("TX");
	  
	  WebElement State = driver.findElement(By.name("payee.address.state"));
	  State.sendKeys("Texas");
	  
	  WebElement Zip_Code = driver.findElement(By.name("payee.address.zipCode"));
	  Zip_Code.sendKeys("901234");
	  
	  WebElement Phone = driver.findElement(By.name("payee.phoneNumber"));
	  Phone.sendKeys("6112345678");
	  
	  WebElement Account = driver.findElement(By.name("payee.accountNumber"));
	  Account.sendKeys("12456");
	  
	  WebElement Verify_Account = driver.findElement(By.name("verifyAccount"));
	  Verify_Account.sendKeys("12456");
	  
	  WebElement Amount = driver.findElement(By.name("amount"));
	  Amount.sendKeys("1000");
	  
	  Select From_account = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));	  
	  From_account.selectByValue("12567");
	  
	  WebElement Send = driver.findElement(By.xpath("//input[@type='submit' and @value = 'Send Payment']"));
	  Send.click();
	  
			  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}	
