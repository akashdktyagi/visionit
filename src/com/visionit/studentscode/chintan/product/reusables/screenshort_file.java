package com.visionit.studentscode.chintan.product.reusables;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshort_file {
	
	public static void getscreenshot(WebDriver driver,String name) 
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("../CS_cart/screenshot/"+name+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
