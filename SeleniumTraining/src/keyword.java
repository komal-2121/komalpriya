import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
//		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
//		
		
		////////////////////////////////////////////////////////////////////////
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	WebElement firstname	=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
	firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
	
	firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	
	WebElement lastname= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	
	lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	

}
}