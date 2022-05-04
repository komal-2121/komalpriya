package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" ,".\\executable\\chromedriver.exe");
		
		WebDriver  web1=new ChromeDriver();
		
		web1.get("https://www.flipkart.com/");
		
		web1.manage().window().maximize();
		
		
		web1.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		// web1.findElement(By.cssSelector("._37M3Pb>div")).click();
		 
		List<WebElement>  ops=  web1.findElements(By.cssSelector("._37M3Pb>div"));
		 
		 System.out.println("Sixe of ops"+ops.size());
		 
		 
		 for(int i=0;i<ops.size();i++) {
			 
			 System.out.println("ops:"+ops.get(i).getText());
			 
		
			 
		 }
		
		
		
		

	}

}
