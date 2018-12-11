package com.visionit.studentscode.pallavi.product.reusable;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile 
{
	public  static String getProperty(String key)
	{
		String propertyfilepath="../visionit/CartURL.properties";
		Properties p=new Properties();
		try 
		{
			FileInputStream file  = new FileInputStream(propertyfilepath);
			p.load(file);
		} 
		catch (Exception e1)
		{
			
			e1.printStackTrace();
		}
		return p.getProperty(key);
	}
}
