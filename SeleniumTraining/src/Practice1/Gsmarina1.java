package Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarina1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		web.get("https://www.demoblaze.com/");
		
	List <WebElement> ops=	web.findElements(By.cssSelector(".list-group>a"));
	
	System.out.println("Size"+ops.size());
	
	List l1=new ArrayList();
	l1.add("CATEGORIES");
	l1.add("Phones");
	l1.add("Laptops");
	l1.add("Monitors");	
	
	for(int i=0;i<ops.size();i++) {
		
		WebElement element=ops.get(i);
		System.out.println(element.isDisplayed());	
		System.out.println(element.isEnabled());
		System.out.println(element.getText().equals(l1.get(i)));
	}

	}

}
