import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseswitchtoelement {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
			WebElement  activeelement 	=	driver.switchTo().activeElement();//without identify
			
		//1.tc	// first we have to check cursur is by default in user name or not 
			
			
	String actualactiveelement	=	activeelement.getAttribute("placeholder");
	String expectedactiveelement ="Username";
	
	if(actualactiveelement.equals("expectedactiveelement")) {
	
	System.out.println("cursor is in username");
	
	}else {
		System.out.println("cursor is not in  username");
	
	}
	
	
//	activeelement.sendKeys("admin",Keys.TAB);
//	driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
//	
//	
	
			
		
		
		

	}

}
