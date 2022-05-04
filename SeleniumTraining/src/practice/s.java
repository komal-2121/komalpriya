package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" ,".\\executable\\chromedriver.exe");
		
		WebDriver  web=new ChromeDriver();
		
		
		web.get("https://www.espncricinfo.com/");
		
		web.manage().window().maximize();
		
		List <WebElement> option  =web.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
		
		System.out.println("Size"+option.size());
		
		for(int i=0;i<option.size();i++) {
			
			System.out.println(option.get(i).getText());
		}
		
		
		
		

	}

}
