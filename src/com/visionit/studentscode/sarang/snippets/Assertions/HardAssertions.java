package com.visionit.studentscode.sarang.snippets.Assertions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertions {
	//Assert is a Class in TestNG which will allows to compare values
	//Here if assertion has failed then the lines after assertion cannot be executed to that respective @Test so driver.quit..
	//..will not be executed
	//Following are 2 test cases which are deliberately scripted to fail to know how assertion works 
	
	
	//Simple Assertion
	@Test(priority=1)
	public void assert1()
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
	
	//Proper way to use Assertion with Valid Error Message..
	//..with comparison of two WebElements
	@Test(priority=2)
	public void assert2()
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
	
	//Use of Assert.assertTrue
	//It will check the condition and if it gets true then Test Case gets pass
	@Test(priority=3)
	public void assert3()
	{
		String name = "Sarang";
		Assert.assertTrue(name.contains("Vaidehi"), "Names Are Different");
	}
	
	
	//Use of Assert.assertFalse
	@Test(priority=4)
	public void assert4()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		///driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String Act = driver.getTitle();
		Assert.assertFalse(Act.contains("Facebook – log in or sign up"), "Facebook Site is opened Successfully");
		driver.quit();
	}
	
	

}
