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

public class Accounts_Overview {
	
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
  public void f() {
	  
	  WebElement AccountsOverview = driver.findElement(By.linkText("Accounts Overview"));
      AccountsOverview.click();
	  
      WebElement AccountsNoclick = driver.findElement(By.xpath("//a[@href='/parabank/activity.htm?id=12345']"));
	  AccountsNoclick.click();
	  
	  Select Activity_Period = new Select(driver.findElement(By.xpath("//select[@ng-model='activityPeriod']")));	  
	  Activity_Period.selectByValue("December");
	  
	  
	  Select ACC_Type = new Select(driver.findElement(By.id("transactionType")));	  
	  ACC_Type.selectByValue("All");
		  
	  WebElement Go = driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
	  Go.click();  
		  
	  WebElement Transaction = driver.findElement(By.xpath("//a[@href='/parabank/transaction.htm?id=12145']"));
	  Transaction.click();  
	  
	  
	  
			  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
	

			