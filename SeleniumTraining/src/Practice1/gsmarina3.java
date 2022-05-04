package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarina3 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		web.get("https://www.gsmarena.com/");
		
	
		web.findElement(By.cssSelector(".col.col-1-5.pages-next-prev.float-right>a.pages-next")).click();
		String	Currenturl1=	web.getCurrentUrl();
		
		System.out.println("Current url:"+Currenturl1); 
		
		
	}

}
