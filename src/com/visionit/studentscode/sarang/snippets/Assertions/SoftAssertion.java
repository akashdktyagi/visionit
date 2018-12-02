package snippets.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	//Comparision between Soft and Hard Assertion
	
	@Test(priority=1)
	public void softAssertMethod()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 Started");
		assertion.assertEquals(12, 13,"Actual value dosen't match with Expected value..");
		System.out.println("Test 2 is Completed");
		assertion.assertAll();// without assertAll() the SoftAssert will not work
	}
	
	@Test(priority=2)
	public void hardAssertionMethod()
	{
		System.out.println("Test 2 is Started");
		Assert.assertEquals("10", "12","Actual value dosen't match with Expected value..");
		System.out.println("Test 2 is Completed");//this statement is not being executed as I use hard assertion "Assert"
	}
}
