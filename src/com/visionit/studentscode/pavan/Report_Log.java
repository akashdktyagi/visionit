package src.com.visionit.studentscode.pavan;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report_Log
{
	@Test
	public void method2()
	{
		System.out.println("Test 2");
		Reporter.log("Default method run");
		
	}
	public void method3()
	{
		System.out.println("Test 3");
		Reporter.log("2nd method ignored");
		
	}
}


