package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.demoblaze.com/");
			
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	WebElement categories =	web.findElement(By.cssSelector(".list-group>a"));
	
	System.out.println(categories.isDisplayed());	
	System.out.println(categories.isEnabled());
	System.out.println(categories.getText().equals("CATEGORIES"));
	
	WebElement Phone =	web.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
	System.out.println(categories.isDisplayed());	
	System.out.println(categories.isEnabled());
	System.out.println(Phone.getText().equals("Phones"));
		

	}

}
