package src.com.visionit.studentscode.nikita.TestNG_Parabank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class New_User_Registration {

	WebDriver driver;

	@BeforeMethod
	public void setup() 
	{
		System.out.println("Hi Before Method Run Successfully");
		System.setProperty("webdriver.chrome.driver", "E:\\sachin\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
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
	public void OpenNewAccount() 
	{
		WebElement OpenNewAccount = driver.findElement(By.linkText("Open New Account"));
		OpenNewAccount.click();
		Select select1 = new Select(driver.findElement(By.id("type")));
		select1.selectByVisibleText("SAVINGS");;
		Select select2 = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		select2.selectByValue("13344");
		WebElement OpenNewAccount1 = driver.findElement(By.xpath("//input[@type='submit' and @class='button']"));
		OpenNewAccount1.click();
		System.out.println("New Savings Account is Successfully Created"); 
		WebElement Account_Number =driver.findElement(By.xpath("//a[@class='ng-binding']"));
		System.out.println("Your new account number " + Account_Number);
	}


	@AfterMethod
	public void teardown() 
	{
		System.out.println("bye");
		driver.quit();
	}









}
