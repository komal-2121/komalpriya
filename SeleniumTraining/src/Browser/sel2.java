package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
		
		WebDriver f= new FirefoxDriver();
		
		//open the url 
		
		f.get("https://www.facebook.com");
		
		//fetch home page title
		
		System.out.println("Home page Title: "+f.getTitle());
		
		if (f.getTitle().equals("Facebook – log in or sign up")) {
			
			System.out.println("Title matched");
		}else {
			
			System.out.println("Not Title matched");
			
			f.close();
		}

	}
}

