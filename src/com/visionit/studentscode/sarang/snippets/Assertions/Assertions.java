package com.visionit.studentscode.sarang.snippets.Assertions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Assertions {
	//Assert is a Class in TestNG which will allows to compare values
	//Here if assertion has failed then the lines after assertion cannot be executed to that respective @Test so driver.quit..
	//..will not be executed
	//Following are 2 test cases which are deliberately scripted to fail to know how assertion works 
	
	
	//Simple Assertion
	@Test(priority=1)
	public void Assert1()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			String Exp = "Facebook – log in or sign";
			String Act = driver.getTitle();
			Assert.assertEquals(Act, Exp);
			//Reporter.log("The Facebook Site is opened");
			driver.quit();
			
	}
	
	//Proper way to use Assertion with Valid Error Message
	@Test(priority=2)
	public void Assert2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String Exp = "Facebook – log in or sign";
		String Act = driver.getTitle();
		Assert.assertEquals(Act, Exp,"Facebook Page is not opened Correctly");
		driver.quit();
	}
	
	

}
