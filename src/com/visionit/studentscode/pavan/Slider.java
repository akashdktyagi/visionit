package com.visionit.studentscode.pavan;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Slider.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement Slider=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(Slider, 539, 303).release().build().perform();
	Slider.click();
}
}
