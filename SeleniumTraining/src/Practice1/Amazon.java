package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.amazon.in/");
			
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		System.out.println("Page Title: "+web.getTitle());
		
		web.findElement(By.cssSelector("#nav-main>div>div>div>a")).click();//bs
		
		web.findElement(By.cssSelector("#nav-xshop-container>div>a:nth-child(6)")).click();//fs
		
		if(web.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			
			System.out.println("Match Title");
			
		}else {
			System.out.println("Not Match Title");
		}
		
		web.navigate().back();
		
		System.out.println("Home Page Title: "+web.getTitle());
		

		if(web.getTitle().equals("Amazon.in Bestsellers: The most popular items on Amazon")) {
			
			System.out.println("Match Title");
			
		}else {
			System.out.println("Not Match Title");
		}
		
		
		List<WebElement>  alloptions = web.findElements(By.cssSelector("#nav-xshop>a"));//all e id
		
		System.out.println("Size: "+alloptions.size());//sixe
		
		for(int i=0;i<alloptions.size();i++) {
			
			WebElement  options = alloptions.get(i);
			String name=options.getText();
			
			System.out.println( options);
			
			if(name.equals("Amazon Pay")) {
				
				options.click();
				break;
			}else {
				
				System.out.println("Not matched");
			}
			
			
			
			
			
		}
			
				
		
		
		
		
		
		
		

	}

}
