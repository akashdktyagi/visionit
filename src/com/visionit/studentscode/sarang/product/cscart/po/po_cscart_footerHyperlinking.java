package com.visionit.studentscode.sarang.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class po_cscart_footerHyperlinking
{

	 WebDriver driver;
	 
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_links_14\"]/li[1]/a")
	WebElement SignInHyperLinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_links_14\"]/li[2]/a")
	WebElement ProfileDetailsHyperLinking;
		
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_links_14\"]/li[3]/a")
	WebElement OrdersHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_links_14\"]/li[4]/a")
	WebElement WishListHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_links_14\"]/li[5]/a")
	WebElement ComparisonListHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[1]/a")
	WebElement AboutUsHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[2]/a")
	WebElement BlogHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[3]/a")
	WebElement ReviewsHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[4]/a")
	WebElement RewardPointsHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[5]/a")
	WebElement GiftCertificatesHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_15\"]/li[6]/a")
	WebElement SitemapHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_16\"]/li[1]/a")
	WebElement DeliveryAndPaymentHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"text_links_16\"]/li[2]/a")
	WebElement ReturnsHyperlinking;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"footer-general_17\"]/div/ul/li[5]/a")
	WebElement AboutCompanyHyperlinking;
	
	public void signInHyperLinking()
	{
		SignInHyperLinking.click();
	}
	
	public void createAccountHyperLinking()
	{
		ProfileDetailsHyperLinking.click();
	}
	
	public void ordersHyperlinking()
	{
		OrdersHyperlinking.click();
	}
	
	public void wishListHyperlinking()
	{
		WishListHyperlinking.click();
	}
	
	public void comparisonListHyperlinking()
	{
		ComparisonListHyperlinking.click();
	}
	
	public void aboutUsHyperlinking()
	{
		AboutUsHyperlinking.click();
	}
	
	public void blogHyperlinking()
	{
		BlogHyperlinking.click();
	}
	
	public void reviewsHyperlinking()
	{
		ReviewsHyperlinking.click();
	}
	
	public void rewardPointsHyperlinking()
	{
		RewardPointsHyperlinking.click();
	}
	
	public void giftCertificatesHyperlinking()
	{
		GiftCertificatesHyperlinking.click();
	}
	
	public void sitemapHyperlinking()
	{
		SitemapHyperlinking.click();
	}
	
	public void deliveryAndPaymentHyperlinking()
	{
		DeliveryAndPaymentHyperlinking.click();
	}
	
	public void returnsHyperlinking()
	{
		ReturnsHyperlinking.click();
	}
	
	public void aboutCompanyHyperlinking()
	{
		AboutCompanyHyperlinking.click();
	}
	
	public void retuntobackpage()
	{
		driver.navigate().back();
	}
	
}
