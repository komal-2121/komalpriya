package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class un1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
		
		FirefoxDriver d= new FirefoxDriver();
		
		d.get("https://demosite.executeautomation.com/Login.html");
		
		d.findElement(By.name("UserName")).sendKeys("execution");
		
		d.findElement(By.name("Password")).sendKeys("admin");
		
		d.findElement(By.name("Login")).click();
		

	}
}
