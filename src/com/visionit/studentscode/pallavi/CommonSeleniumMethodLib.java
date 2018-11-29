package com.visionit.studentscode.pallavi.fw.product.CsCart.reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSeleniumMethodLib 
{
	public void listBoxHandle(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public void dropDowns(WebDriver driver,WebElement toElement)
	{
		Actions a=new Actions(driver);
		a.moveToElement(toElement).perform();
	}
	
	public void alertVerify(WebDriver driver,long timeOutInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
}
