package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropdown1 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		
	
		web.get("https://www.facebook.com/");
		
		
		web.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();//crete account
		
		WebElement   DaysButton = web.findElement(By.id("._5k_4>span>._9407"));
		
		
		
	 	
		//names
		for(int i=0;i<DayButton.size();i++){
				
			List<WebElement> options2= DayButton.getOptions();
		
		Select  button =new Select(DaysButton);
		
		System.out.println("Size: "+Button.size());
		
	
		List<WebElement> daylist=driver.findElements(By.cssSelector("._5k_4>span>select"));
//		System.out.println("No, of spaces to be filed= "+daylist.size());
//		
//		for(int i=0;i<=daylist.size();i++) {
//			WebElement validoptions=daylist.get(i);
//			
//			Select validoption=new Select (validoptions);
//			
//		List<WebElement> options2= validoption.getOptions();
//		System.out.println("************");
//			System.out.println(validoption.isMultiple());
//			//List<WebElement> downoptions= validoption.getOptions();
//			System.out.println("wanted to print options= "+options2.size());
//	
	
		
		
		
	}
	
		
}
