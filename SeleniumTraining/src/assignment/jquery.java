package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {

	public static void main(String[] args)  {
		

		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		
		
		driver.findElement(By.cssSelector(".widget>ul>li:nth-child(5)")).click();
		
		//frame handling 
		//1.identify frame n store in webelement
		
		WebElement  frame = driver.findElement(By.cssSelector("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		List<WebElement> item1 =	driver.findElements(By.cssSelector(".ui-sortable>li"));
		WebElement item=	driver.findElement(By.cssSelector("..ui-sortable>li:first-child"));
		WebElement  item7 =	driver.findElement(By.cssSelector(".ui-sortable>li:nth-child(7)"));
	
		Actions act = new Actions(driver);
		
		act.dragAndDrop(item1.get(6), item1.get(1)).build().perform();
		act.dragAndDrop(item7, item).build().perform(); 
	}

}
