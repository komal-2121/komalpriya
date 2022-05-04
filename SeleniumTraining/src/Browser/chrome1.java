package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome1 {

	public static void main(String[] args) {
		
		String path=System.getProperty("user dir")+"\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver d=	new ChromeDriver();
		
		

	}

}
