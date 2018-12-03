package src.com.visionit.studentscode.pavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data_Provider1 {

	WebDriver driver;
	@Test(dataProvider="facebookdata")
	public void login (String Username, String password)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(Username);

		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.xpath("//*[@value='Log In']")).click();

		driver.quit();
	}


	@DataProvider(name="facebookdata")
	public Object [][] fb_login() throws Exception
	{

		Object data[][]=Utility_Class.getData();
		return data;
	}
}


