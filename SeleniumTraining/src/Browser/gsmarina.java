package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarina {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver" ,".\\executable\\chromedriver.exe");
		
		WebDriver  web=new ChromeDriver();
		
		
		web.get("https://www.gsmarena.com/");
		
		web.manage().window().maximize();
		
		List<WebElement> count= web.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul"));
		
		System.out.println("Count "+count.size());
		
		
		
		
		

	}

}
