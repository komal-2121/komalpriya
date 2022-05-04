package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver  c =new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		c.get("https://demo.actitime.com");
		
		c.getTitle();
		
		System.out.println("Title "+c.getTitle());
		
		if(c.getTitle().equals("actiTIME - Login")) {
		
			System.out.println("Title Matched");
			
		}else {
			System.out.println("Not Title Matched");
		}
			
			c.findElement(By.id("username")).sendKeys("admin");
			c.findElement(By.name("pwd")).sendKeys("manager");
			c.findElement(By.id("loginButton")).click();
			
			
		c.getTitle();
		System.out.println("title: "+c.getTitle());
		
		//c.findElement(By.id("username")).sendKeys("admin");
		}
	

	}


