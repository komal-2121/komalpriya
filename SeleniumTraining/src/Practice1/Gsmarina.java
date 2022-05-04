package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarina {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				
				WebDriver web=new ChromeDriver();
				
				web.manage().window().maximize();
				web.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				web.get("https://www.gsmarena.com/");
				
				String	actually = web.getCurrentUrl();
				System.out.println("Actual  url: "+actually);
				System.out.println("Actual and Expected url: "+actually.equals("https://www.gsmarena.com/"));
				
				List<WebElement>options=web.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
				
				System.out.println("Count: "+options.size());

				for(int i =0;i<options.size();i++) {
					System.out.println(options.get(i).getText());
					
				}
				
			//////
				
		 web.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a")).click();
		
		 List<WebElement> Allsamsung=web.findElements(By.cssSelector(".makers>ul>li>a"));
				
		 System.out.println("Count: "+Allsamsung.size());
		 
		 for(int i=0;i<Allsamsung.size();i++) {
			 System.out.println(Allsamsung.get(i).getText()); 
		 }
		 
		 
				
	}

}
