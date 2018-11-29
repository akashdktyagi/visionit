package com.visionit.studentscode.pallavi.fw.product.CsCart.reusables;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots 
{
	public static void getScrrenShot(WebDriver driver,String name)
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("../visionit/screenshot/"+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
