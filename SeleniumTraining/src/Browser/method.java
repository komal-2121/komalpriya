package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class method {

	public static void main(String[] args) {
		
		String pathC=System.getProperty("user dir")+"\\executable\\chromedriver.exe";
		String pathf=System.getProperty("user dir")+"\\executable\\geckodriver.exe";
		
		openbrowser(pathC,"chrome");
		openbrowser(pathf,"firefox");
	}
		
		static void openbrowser(String driverpath,String browsername) {
			
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","\\executable\\chromedriver.exe");
			WebDriver w = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver","\\executable\\chromedriver.exe");
			WebDriver h = new FirefoxDriver();
	}

}
}