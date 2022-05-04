package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 {

		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");//0-30
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement  UsernameField = driver.findElement(By.id("username"));
		
		System.out.println("User name is visible in screen: "+UsernameField.isDisplayed());
		System.out.println("User name is Editable in screen: "+UsernameField.isEnabled());
	
		String Passwoedfield =UsernameField.getAttribute("placeholder");
		System.out.println("Default text validation for inputfield: "+actual);
		
		System.out.println("Passwoedfield is visible:"+Passwoedfield.isDisplayed());
		System.out.println("Paawoed filed is editable: +"Passwoedfield.isEnabled());
		
		
	}

}
