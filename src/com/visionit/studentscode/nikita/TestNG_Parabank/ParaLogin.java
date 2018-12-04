package src.com.visionit.studentscode.nikita.TestNG_Parabank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParaLogin {
	
	WebDriver driver;
	
	
  

	@BeforeMethod
  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","E:\\sachin\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();

	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();


	  driver.get("http://parabank.parasoft.com");

  }
  
  @Test
  public  void LoginUsingFindElement(WebDriver driver,String username, String password){
	    List<WebElement> col = driver.findElements(By.xpath("//input"));
		col.get(0).sendKeys("john");
		col.get(1).sendKeys("demo");
		col.get(2).click();
		  
  }
  
  @AfterMethod
  public void AfterMethod()
  {
	  driver.quit();
	  
  }
  
  
  
	}
  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	