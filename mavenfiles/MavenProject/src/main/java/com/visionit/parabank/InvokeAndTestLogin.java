
package main.java.com.visionit.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokeAndTestLogin{



public static void main(String[] args){


System.out.println("Hello Maven");

		System.setProperty("webdriver.chrome.driver", 
				"E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
	
		//Navigate
		driver.get("http://parabank.parasoft.com");
		
		
		//Locators for Login
		WebElement txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		WebElement txt_password = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
		WebElement btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
		//Operation on- Login in to application
		txt_username.sendKeys("john");
		txt_password.sendKeys("demo");
		btn_submit.click();


}
}