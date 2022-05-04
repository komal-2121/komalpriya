package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Realme {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.gsmarena.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 WebDriverWait wait =new WebDriverWait(driver,20);
		
		driver.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li")).click();
		
		List<WebElement>   allops=	driver.findElements(By.cssSelector(".makers>ul>li>a"));
		
		System.out.println(allops.size());
		
		for(int i=0;i<allops.size();i++) {
			
		//wait.until(ExpectedCondition.elementToBeClickable(allops.get(i)));
		System.out.println(allops.get(i).getText());
		
		}
		
		List <WebElement> pages=driver.findElements(By.cssSelector(".nav-pages>a"));
		System.out.println("Page Size "+pages.size());
		
		for(int i=0;i<pages.size();i++) {
			
			pages.get(i).click();
			System.out.println(driver.getCurrentUrl());
			pages=driver.findElements(By.cssSelector(".nav-pages>a"));
			
		}
	}

}
