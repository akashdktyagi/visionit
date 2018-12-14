package com.visionit.studentscode.chintan.product.tc;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import po_CS_cart.po_megamenu;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class tc_megamenu
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  po_megamenu po_megamenu=PageFactory.initElements(driver,   po_megamenu.class);
	  
	  po_megamenu.click_on_electronic();
	  String electronic_actual =driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[2]/div/h1/span")).getText();
	  String electronic_expected="Electronics";
	  Assert.assertEquals(electronic_actual, electronic_expected);
	 System.out.println("electronic megamenu has been opened successfully");
	  
	  po_megamenu.click_on_apparel();
	  String apparel_actual =driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[2]/div/h1/span")).getText();
	  String apparel_expected="Apparel";
	  Assert.assertEquals(apparel_actual, apparel_expected);
	 System.out.println("Apparel megamenu has been opened successfully");
	 
	  po_megamenu.click_on_SportsOutdoors();
	  String SportsOutdoors_actual =driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[2]/div/h1/span")).getText();
	  String SportsOutdoors_expected="Sports & Outdoors";
	  Assert.assertEquals(SportsOutdoors_actual, SportsOutdoors_expected);
	 System.out.println("Sports & Outdoors megamenu has been opened successfully");
	 
	  po_megamenu.click_on_OfficeSupplies();
	  String OfficeSupplies_actual =driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[2]/div/h1/span")).getText();
	  String OfficeSupplies_expected="Office Supplies";
	  Assert.assertEquals(OfficeSupplies_actual, OfficeSupplies_expected);
	 System.out.println("Office Supplies megamenu has been opened successfully");
	 
	  po_megamenu.click_on_VideoGames();  
	  String VideoGames_actual =driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[2]/div/h1/span")).getText();
	  String VideoGames_expected="Video Games";
	  Assert.assertEquals(VideoGames_actual, VideoGames_expected);
	 System.out.println("Video Games megamenu has been opened successfully");
		
	 
	 
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://demo.cs-cart.com");
	  driver.manage().window().maximize();
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chintan\\Downloads\\chromedriver_win32\\chromedriver.exe");
  }

}
