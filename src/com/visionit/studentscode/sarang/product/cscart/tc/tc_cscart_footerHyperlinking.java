package com.visionit.studentscode.sarang.product.cscart.tc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.visionit.studentscode.sarang.product.cscart.po.po_cscart_footerHyperlinking;


public class tc_cscart_footerHyperlinking
{

WebDriver driver;
	
	public static Properties pro;
	
	@BeforeMethod
	  public void beforeMethod() throws IOException  
	{	
		
		System.out.println("//Launching Different Browers Using .properties file");
		pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Vision\\eclipse-workspace\\Unicorn\\src\\config\\configurations.properties");
		pro.load(ip);
		String browserName = pro.getProperty("browser");//value of browser stored in.properties file and change it according to our need
		
		if(browserName.equals("chrome"))//launches chrome driver
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Vision\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if (browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Vision\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Vision\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.get(pro.getProperty("url"));
	}
	
	@Test
	public void cscart_footer_hyperlinking_check() 
	  {
		po_cscart_footerHyperlinking po_cscart_footerHyperlinking = PageFactory.initElements(driver, po_cscart_footerHyperlinking.class);
		po_cscart_footerHyperlinking.signInHyperLinking();
		String Act_signInHyperLinking = driver.getCurrentUrl();
		SoftAssert Assert_signInHyperLinking = new SoftAssert();
		Assert_signInHyperLinking.assertEquals(Act_signInHyperLinking, "/login/", 
		"signInHyperLinking functionality is not working properly");
		Reporter.log("signInHyperLinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.createAccountHyperLinking();
		String Act_createAccountHyperLinking = driver.getCurrentUrl();
		SoftAssert Assert_createAccountHyperLinking = new SoftAssert();
		Assert_createAccountHyperLinking.assertEquals(Act_createAccountHyperLinking, 
		"/profiles-add/", "createAccountHyperLinking functionality is not working properly");
		Reporter.log("createAccountHyperLinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.ordersHyperlinking();
		String Act_ordersHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_ordersHyperlinking = new SoftAssert();
		Assert_ordersHyperlinking.assertEquals(Act_ordersHyperlinking, 
		"dispatch", "ordersHyperlinking functionality is not working properly");
		Reporter.log("ordersHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.wishListHyperlinking();
		String Act_wishListHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_wishListHyperlinking = new SoftAssert();
		Assert_wishListHyperlinking.assertEquals(Act_wishListHyperlinking, 
		"/wishlist/", "wishListHyperlinking functionality is not working properly");
		Reporter.log("wishListHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.comparisonListHyperlinking();
		String Act_comparisonListHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_comparisonListHyperlinking = new SoftAssert();
		Assert_comparisonListHyperlinking.assertEquals(Act_comparisonListHyperlinking, 
		"/compare/", "comparisonListHyperlinking functionality is not working properly");
		Reporter.log("comparisonListHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.aboutUsHyperlinking();
		String Act_aboutUsHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_aboutUsHyperlinking = new SoftAssert();
		Assert_aboutUsHyperlinking.assertEquals(Act_aboutUsHyperlinking, 
		"our-company", "aboutUsHyperlinking functionality is not working properly");
		Reporter.log("aboutUsHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.blogHyperlinking();
		String Act_blogHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_blogHyperlinking = new SoftAssert();
		Assert_blogHyperlinking.assertEquals(Act_blogHyperlinking, 
		"/blog/", "blogHyperlinking functionality is not working properly");
		Reporter.log("blogHyperlinking is opened");
		
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.reviewsHyperlinking();
		String Act_reviewsHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_reviewsHyperlinking = new SoftAssert();
		Assert_reviewsHyperlinking.assertEquals(Act_reviewsHyperlinking, 
		"discussion", "reviewsHyperlinking functionality is not working properly");
		Reporter.log("reviewsHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.rewardPointsHyperlinking();
		String Act_rewardPointsHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_rewardPointsHyperlinking = new SoftAssert();
		Assert_rewardPointsHyperlinking.assertEquals(Act_rewardPointsHyperlinking, 
		"/reward-points/", "rewardPointsHyperlinking functionality is not working properly");
		Reporter.log("rewardPointsHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.giftCertificatesHyperlinking();
		String Act_giftCertificatesHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_giftCertificatesHyperlinking = new SoftAssert();
		Assert_giftCertificatesHyperlinking.assertEquals(Act_giftCertificatesHyperlinking, 
		"/why-buy-gift-certificates/", "giftCertificatesHyperlinking functionality is not working properly");
		Reporter.log("giftCertificatesHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.sitemapHyperlinking();
		String Act_sitemapHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_sitemapHyperlinking = new SoftAssert();
		Assert_sitemapHyperlinking.assertEquals(Act_sitemapHyperlinking, 
		"/sitemap/", "sitemapHyperlinking functionality is not working properly");
		Reporter.log("sitemapHyperlinking is opened");
		
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.deliveryAndPaymentHyperlinking();
		String Act_deliveryAndPaymentHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_deliveryAndPaymentHyperlinking = new SoftAssert();
		Assert_deliveryAndPaymentHyperlinking.assertEquals(Act_deliveryAndPaymentHyperlinking, 
		"/payment-and-shipping/", "deliveryAndPaymentHyperlinking functionality is not working properly");
		Reporter.log("deliveryAndPaymentHyperlinking is opened");
		
		driver.get(pro.getProperty("url"));
		po_cscart_footerHyperlinking.returnsHyperlinking();
		String Act_returnsHyperlinking = driver.getCurrentUrl();
		SoftAssert Assert_returnsHyperlinking = new SoftAssert();
		Assert_returnsHyperlinking.assertEquals(Act_returnsHyperlinking, 
		"/returns-and-exchanges/", "returnsHyperlinking functionality is not working properly");
		Reporter.log("returnsHyperlinking is opened");
		
		//assert.assertall();
		driver.get(pro.getProperty("url"));
		System.out.println("All hyperlinking footer links are Checked for CS Cart");
	  }	
}
