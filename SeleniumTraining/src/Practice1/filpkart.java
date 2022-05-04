package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.flipkart.com/");
		
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String	actually = web.getCurrentUrl();
		System.out.println("Actual  url: "+actually);
		System.out.println("Actual and Expected url: "+actually.equals("https://www.flipkart.com/"));
			
		
		
		web.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
	
	List<WebElement> optioncount = web.findElements(By.cssSelector("._37M3Pb>div>a>div"));
	
	System.out.println("Count of options: "+optioncount.size());
	
	for(int i=0;i<optioncount.size();i++) {
		
		System.out.println(optioncount.get(i).getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
		
		
		

	}

}
