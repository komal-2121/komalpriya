package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pratice2 {

	public static void main(String[] args, Object logoutLink) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");//0-30
		
		String expectedTitle="actiTIME - Login";
		String actuallytitle =driver.getTitle();
		
		System.out.println("Title: "+actuallytitle);
		if(actuallytitle.equals(expectedTitle)) {

			System.out.println("Login sucessfully");
			
		}else {
			System.out.println("Not Login sucessfully");
		}
		
		WebElement inputtext=driver.findElement(By.id("username"));
		
		inputtext.sendKeys("admin");
		inputtext.clear();
		inputtext.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		WebDriverWait  w =new WebDriverWait(driver, 20);
		//w.until(ExpectedCondition.elementToBeClickable(logoutLink));
		
		
		String actualHomepageTitle=driver.getTitle();
		System.out.println("HomepageTitle: "+actualHomepageTitle);
		
		String expectedHomepageTitle=("actiTIME - Enter Time-Trace");
		if(actualHomepageTitle.equals(expectedHomepageTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		
	}

}
