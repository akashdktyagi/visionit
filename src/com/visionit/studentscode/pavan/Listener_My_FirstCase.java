package src.com.visionit.studentscode.pavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Listener_My_FirstCase
{
	@Test
	public void parabankTitleVerify()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	/*@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);

}*/
}

