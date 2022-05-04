package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) {
		// To open Chrome browser
		
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");

		ChromeDriver d=new ChromeDriver();
		
		//to open url
		
		d.get("https://www.google.com");
		
		//for the sourcecode
		//for length we have to store in variable
		String sourse=d.getPageSource();
	//	System.out.println("Sourcecode: "+d.getPageSource());
		//System.out.println("Sourcecode: "+sourse.length());
		// get current page title and print in console
		
		System.out.println("Application Title:   "+d.getTitle());
		
		
	}

}
