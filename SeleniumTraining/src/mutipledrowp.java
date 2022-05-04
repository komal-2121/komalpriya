import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mutipledrowp {

	public static void main(String[] args) {
	
		
			
		WebDriverManager.chromedriver().setup();
		
		
		
		
		
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		 WebElement  menu =driver.findElement(By.id("multiselect1"));//unique identify
		
		Select Menuoption =new Select(menu);
		
		// check whether dropdown is multiselect dropdown or not
			System.out.println("Is dropdown is allowing you to select multiple option: "+Menuoption.isMultiple());
			
		
			//System.out.println("Already selectec option name: "+Menuoption.getFirstSelectedOption().getText());
		
		//to get option count
			
			List<WebElement> alloptioncount=Menuoption.getOptions();
			
			System.out.println("Get option size :"+alloptioncount.size());
			
			
			//get drowndown names
			
			for(int i=0;i<alloptioncount.size();i++) {
				
				System.out.println("All options: "+alloptioncount.get(i).getText());
				
				
			}
			
			
			
			// Select option fron drowdown
			
			Menuoption.selectByValue("Hyundaix");
			Menuoption.selectByVisibleText("Audi");
			Menuoption.selectByIndex(0);;			
			
			
			
			// disSelect option fron drowdown
			
						Menuoption.deselectByValue("Hyundaix");
						Menuoption.deselectByVisibleText("Audi");
						Menuoption.deselectByIndex(0);;			
						
						
			
			
		

	}

}
