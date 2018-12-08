package com.visionit.studentscode.bindiya.snippets.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class resizable {
	WebDriver driver;


	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
	}
	@Test(priority=1)
	public void Resizable() throws InterruptedException
	{
		WebElement resizableLinkClick = driver.findElement(By.linkText("Resizable"));
		resizableLinkClick.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement resizeArrow = driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
		Actions resizeAction = new Actions(driver);
		resizeAction.clickAndHold(resizeArrow).build().perform();
		resizeAction.dragAndDropBy(resizeArrow, 300, 200).build().perform();
		Thread.sleep(3000);

	}

}



