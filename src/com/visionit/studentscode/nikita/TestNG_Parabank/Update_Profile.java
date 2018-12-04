package src.com.visionit.studentscode.nikita.TestNG_Parabank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Update_Profile {
	
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
  public void TC_Update_Profile () {
	  
	  WebElement UpdateProfile = driver.findElement(By.linkText("Update Contact Info"));
	  UpdateProfile.click();
	  
	  WebElement UserName1 = driver.findElement(By.name("customer.firstName"));
	  UserName1.sendKeys("john");
	  
	  WebElement PassWord1 = driver.findElement(By.name("customer.lastName"));
	  PassWord1.sendKeys("demo");
	  
	  WebElement Address = driver.findElement(By.name("customer.address.street"));
	  Address.sendKeys("Texas,USA ");
	  
	  WebElement City = driver.findElement(By.name("customer.address.city"));
	  City.sendKeys("Beverly");
	  
	  WebElement State = driver.findElement(By.name("customer.address.state"));
	  State.sendKeys("Texas");
	  
	  
	  WebElement ZipCode = driver.findElement(By.name("customer.address.zipCode"));
	  ZipCode.sendKeys("90410");
	  
	  WebElement Phone = driver.findElement(By.name("customer.phoneNumber"));
	  Phone.sendKeys("310-447-4121");
	  
	  WebElement Update = driver.findElement(By.xpath("//input[@type='submit' and @value='Update Profile']"));
	  Update.click();
	  
	  
	//  System.out.println("Update Successfully");

	  
	
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 
			System.out.println("bye");
			driver.quit();
		}
	  
	  
	  
  }

		