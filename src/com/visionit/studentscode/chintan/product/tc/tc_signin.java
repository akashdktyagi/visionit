package com.visionit.studentscode.chintan.product.tc;

import org.testng.annotations.Test;

import com.visionit.studentscode.chintan.product.po.po_signin;



import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class tc_signin {
	 WebDriver Driver;
  @Test
  public void f() {
	  po_signin po_signin=PageFactory.initElements(Driver, po_signin.class);
	  
	 po_signin.click_on_myaccount();
	 po_signin.click_on_signin();
	 po_signin.email("customr@example.com");
	 po_signin.password("cusomer");
	 po_signin.click_on_sign();
	  po_signin.click_on_screenshot("img1");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
