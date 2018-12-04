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

public class Find_Transactions {
	
	
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
  public void TC_Find_Transactions () {
	  
	  WebElement FindTransactions = driver.findElement(By.linkText("Find Transactions"));
	  FindTransactions.click();
	  
	  Select SelectFromAccount = new Select(driver.findElement(By.xpath("//select[@id='accountId']")));	  
	  SelectFromAccount.selectByValue("13344	");
	  
	  WebElement Transaction_ID = driver.findElement(By.id("criteria.transactionId"));
	  Transaction_ID.sendKeys("1");
	  
	  //WebElement BtnFindTransacton = driver.findElement(By.xpath("//button[@type='submit' and @class='button']"));
	 // BtnFindTransacton.click();
	  
	 WebElement Date = driver.findElement(By.xpath("//input[@id='criteria.onDate']"));
	 Date.sendKeys("11-21-2018");
	 
	 
	 WebElement FromDate =driver.findElement(By.xpath("//input[@ng-model='criteria.fromDate']"));
     FromDate.sendKeys("11-21-2018");
	  
	 WebElement ToDate =driver.findElement(By.id("criteria.toDate"));
	 ToDate.sendKeys("12-27-2018");
	 
	 //WebElement Transaction_Results = driver.findElement(By.xpath("//button[@type='submit' and @class='button']"));
	 //Transaction_Results.click();

	 WebElement FindAmount = driver.findElement(By.id("criteria.amount"));
	 FindAmount.sendKeys("12456");
	 
	//WebElement Transaction_Results = driver.findElement(By.xpath("//button[@type='submit' and @class='button']"));
		 //Transaction_Results.click();

  }

  @AfterMethod
  public void afterMethod() {
  }

}
