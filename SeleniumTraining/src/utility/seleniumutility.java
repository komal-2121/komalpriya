package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumutility {

	public static void main(String[] args) {
	
				public WebDriver setUp(String browserName, String appUrl) {
				WebDriver driver = null;
				if (browserName.equalsIgnoreCase("Chrome")) {
		
					WebDriverManager.chromedriver().setup();
				
					driver = new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("ie")) {
		
					WebDriverManager.iedriver().setup();
					
					driver = new InternetExplorerDriver();
				} else if (browserName.equalsIgnoreCase("firefox")) {
		
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				// maximize browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(appUrl);
				return driver;
			}
	
	}

}
}