import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Options;

public class mousec {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		
		List<WebElement > opstion =  driver.findElements(By.xpath("//div[@id='menu']/ul/li"));
		System.out.println("Option count : "+opstion.size());

		Actions act =new Actions(driver);
		
//		for(int i=0;i<opstion.size();i++) {
//			
//			WebElement    menuoption = opstion.get(i);
//			
//			String opsname = menuoption.getText();
//			
//			act.moveToElement(menuoption).perform();
//			
//			Thread.sleep(1500);
//				
			
			// }
		////////////////
		
		//mousehover1withCord(act,opstion.get(1));
		//mousehover(act,opstion);
		rightclick(act,opstion.get(1));
	}
	
	
	
		static void mousehover1withCord(Actions act ,WebElement opstion ) {
		System.out.println("option name"+opstion.getText());
		
		act.moveToElement(opstion,100,0).perform();
		
		
		}
		
		
		
		 static void  mousehover(Actions act,List<WebElement> opstion) throws InterruptedException {
			
		for(int i=0;i<opstion.size();i++) {
				  
		 WebElement ops =   opstion.get(i);
			 
		 act.moveToElement(ops).perform();
		Thread.sleep(2000);
	}
		
		
		 }	
		static void rightclick(Actions act, WebElement opstion ) {
			
		act.moveToElement(opstion).contextClick().build().perform();
			

		}
}
		  
		  
		  













		
		  
	
		
		
		