package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		web.get("https://www.techlistic.com/");
		
		web.manage().window().maximize();
		
	//	web.findElement(By.linkText("JAVA")).click();
	web.findElement(By.cssSelector(".overflowable-container.overflowable-3>div>div>.tabs>li>a")).click();
//		web.navigate().back();
//		
//		web.findElement(By.linkText("SELENIUM")).click();
//		
//		web.navigate().back();
//		
//		web.findElement(By.linkText("TESTING")).click();
	}

}
