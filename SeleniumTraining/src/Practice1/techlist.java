package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.techlistic.com/");
			
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		web.findElement(By.cssSelector(".overflowable-container.overflowable-3>div>div>.tabs>li>a")).click();//1
		
	String	actualTitle=web.getTitle();
	
	System.out.println("Actual Ttitle: "+actualTitle);
	
	web.navigate().back();
	
	//web.findElement(By.linkText("BDD")).click();
	
	web.findElement(By.cssSelector(".overflowable-container.overflowable-3>div>div>.tabs>*:nth-child(7)")).click();
		
	web.navigate().back();
	
	web.findElement(By.cssSelector(".overflowable-container.overflowable-3>div>div>.tabs>*:nth-child(9)")).click();
	
	System.out.println(web.getTitle());
		
		

	}

}
