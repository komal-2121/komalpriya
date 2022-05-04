package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,".\\executable\\chromedriver.exe");
		
		WebDriver  web=new ChromeDriver();
		
		
		web.get("https://www.espncricinfo.com/");
		
		web.manage().window().maximize();
		
//		if(web.getCurrentUrl().equals("https://www.espncricinfo.com/")){
//			
//			System.out.println("correct url");
//		}else {
//				System.out.println("Not correct url");
//			}
//			
//		}
//		
		
	List<WebElement>  op =	web.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
	
	System.out.println(op.size());
		
	for(int i=0;i<op.size();i++) {
		
		System.out.println(op.get(i).getText());
	}
		
		
		

	}

}
