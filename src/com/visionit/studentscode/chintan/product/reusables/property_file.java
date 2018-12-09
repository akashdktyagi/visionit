package com.visionit.studentscode.chintan.product.reusables;

import java.io.FileInputStream;
import java.util.Properties;

public class property_file {
	public static String getProperty(String key)
	{
		String propertyfilepath="../CS_cart/cscart.properties";
		Properties p=new Properties();
		try
		{
			FileInputStream file=new FileInputStream(propertyfilepath);
			p.load(file);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
}



