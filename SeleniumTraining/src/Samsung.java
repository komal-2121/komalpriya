import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class Samsung {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver    d  =new ChromeDriver();
		
		d.get("https://www.gsmarena.com/");
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	  d.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a")).click();
		
	 List <WebElement> SamsungallOptions = d.findElements(By.cssSelector("#review-body>div>ul>li>a"));
	
		System.out.println("SamsungallOptions count : "+SamsungallOptions.size());
		
		for(int i =0;i<SamsungallOptions.size();i++) {
			
			System.out.println(SamsungallOptions.get(i).getText());
			
			
			
		}
		
		////
		
//	 web.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a")).click();
//	
//	 List<WebElement> Allsamsung=web.findElements(By.cssSelector(".makers>ul>li>a"));
//			
//	 System.out.println("Count: "+Allsamsung.size());
//	 
//	 for(int i=0;i<Allsamsung.size();i++) {
//		 System.out.println(Allsamsung.get(i).getText()); 
//	 }
//		
//		
		
		
		
	}

}
