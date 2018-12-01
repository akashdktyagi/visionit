package com.visionit.studentscode.sarang.product.cscart.reusables;

import com.visionit.studentscode.sarang.product.cscart.po.po_ele_demo;

public class Genericscreenshot
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
