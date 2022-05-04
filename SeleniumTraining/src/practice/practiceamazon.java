package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class practiceamazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,".\\executable\\chromedriver.exe");
		
		WebDriver  web=new ChromeDriver();
		
		web.get("https://www.flipkart.com/");
		
		web.manage().window().maximize();
		
		web.findElement(By.cssSelector("._2KpZ6l._2doB4z ")).click();
		
		System.out.println("Title: "+web.getTitle());
		
		List<WebElement> element=web.findElements(By.cssSelector("._37M3Pb>div"));
		
		
		System.out.println("Size"+element.size());
		
		for(int i=0;i<element.size();i++) {
		
		System.out.println(element.get(i).getText());
		
		}
		
		
	}
}
