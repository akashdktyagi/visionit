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

public class Request_Loan {
	
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
  public void TC_Request_Loan() {
	  
	  WebElement RequertLoan = driver.findElement(By.linkText("Request Loan"));
	  RequertLoan.click();
	  
	  WebElement LoanAmount = driver.findElement(By.xpath("//input[@ng-model='loanRequest.amount']"));
	  LoanAmount.sendKeys("400");
	  
	  WebElement Down_Payment = driver.findElement(By.xpath("//input[@ng-model='loanRequest.downPayment']"));
	  Down_Payment.sendKeys("400");
	  
	  Select From_account = new Select(driver.findElement(By.xpath("//select[@ng-model='loanRequest.fromAccountId']")));	  
	  From_account.selectByValue("13344");
	  
	  WebElement ApplyNow = driver.findElement(By.xpath("//input[@type='submit' and @value='Apply Now']"));
	  ApplyNow.click();
	  
  }
//fail
  @AfterMethod
  public void afterMethod() {
  }

}
	