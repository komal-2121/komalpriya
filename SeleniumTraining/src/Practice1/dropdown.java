package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
	
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.facebook.com/");//open fb
		
		web.manage().window().maximize();
		
		web.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();//crete account 
		
		WebElement dayoption =	web.findElement(By.xpath("//*[@id=\"day\"]"));
		
		dayoption.click();
		
		
		
//		
//		
//		
//		
//	
//	
//		
//		for(int i=0;i<opscount.size();i++) {
//			
		
		Select opsbutton=new Select(dayoption);
		
		
			
		
//			
//			
//			System.out.println("How many optios in downdown: "+opscount);//option
//			
//			List<WebElement> button =  opsbutton.getOptions();
//			
//			System.out.println("Total count : "+button);
//		
//			System.out.println("Is dropdown is allowing you to select multiple option: "+opsbutton.isMultiple());//mutiple
//	
//		System.out.println("is By Default text: "+opsbutton.getFirstSelectedOption().getText());//default
//		
//		

	
	}
	
		
		
	}

//		///////////////////////////////////////////////////////////////////////////////driver.findElement(By.cssSelector("a[id^='u_0_2']")).click();
//			List<WebElement> daylist=driver.findElements(By.cssSelector("._5k_4>span>select"));
//			System.out.println("No, of spaces to be filed= "+daylist.size());
//			
//			for(int i=0;i<=daylist.size();i++) {
//				WebElement validoptions=daylist.get(i);
//				
//				Select validoption=new Select (validoptions);
//				
//			List<WebElement> options2= validoption.getOptions();
//			System.out.println("************");
//				System.out.println(validoption.isMultiple());
//				//List<WebElement> downoptions= validoption.getOptions();
//				System.out.println("wanted to print options= "+options2.size());
//		
		
	

