import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		
	WebElement	element =driver.findElement(By.cssSelector("body"));
	
	element.sendKeys(Keys.ESCAPE);
		
		
//	for(int i=0;i<10;i++) {
//		
//		element.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(1500);
//		
//	}
//	
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.F5));
	}

}
