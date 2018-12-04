package src.com.visionit.studentscode.nikita.Iframe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ActionClass {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "E:\\sachin\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
	}

	@Test(priority=1)
	public void Draggable() {

		WebElement draggable = driver.findElement(By.linkText("Draggable"));
		draggable.click();

		driver.switchTo().frame(0);

		WebElement dragBox = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Actions dragAction = new Actions(driver);
		dragAction.clickAndHold(dragBox).build().perform();
		dragAction.dragAndDropBy(dragBox, 200, 0).build().perform();
		driver.switchTo().defaultContent();
	}

	@Test(priority=2)

	public void Dropable(){

		WebElement dropable = driver.findElement(By.linkText("Droppable"));
		dropable.click();
		driver.switchTo().frame(0);

		WebElement dragBox = driver.findElement(By.id("draggable"));
		WebElement dropBox= driver.findElement(By.id("droppable"));
		Actions dragndropAction = new Actions(driver);
		dragndropAction.clickAndHold(dragBox).build().perform();;
		dragndropAction.dragAndDrop(dragBox, dropBox).build().perform();
		driver.switchTo().defaultContent();
	}




	@Test(priority=3)

	public void Resizable() throws InterruptedException {

		WebElement Resize= driver.findElement(By.linkText("Resizable"));
		Resize.click();
		driver.switchTo().frame(0);

		WebElement ResizeBoxArrow = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions ResizeAction = new Actions(driver);
		ResizeAction.clickAndHold(ResizeBoxArrow).build().perform();
		ResizeAction.dragAndDropBy(ResizeBoxArrow, 210, 210).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

	}

	@Test(priority=4)

	public void Selectable() throws InterruptedException{

		WebElement select = driver.findElement(By.linkText("Selectable"));
		select.click();
		driver.switchTo().frame(0);

		WebElement SelectItem = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		SelectItem.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();


	}

	@Test(priority=5)

	public void  Sortable() throws InterruptedException{

		WebElement Sort = driver.findElement(By.linkText("Sortable"));
		Sort.click();
		driver.switchTo().frame(0);

		WebElement SortItem = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[3]"));
		Actions SortAction =new Actions(driver);
		SortAction.clickAndHold(SortItem).build().perform();
		SortAction.dragAndDropBy(SortItem, 0, 44).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

	}





	@AfterMethod
	public void afterMethod() {

		driver.quit();

	}



}

