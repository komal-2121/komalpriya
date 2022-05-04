package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://www.google.com");
		
		driver.getTitle();
		System.out.println("Title: "+driver.getTitle());
		String sourse =driver.getPageSource();
	//	System.out.println("Sourse code: "+driver.getPageSource());
		//System.out.println("Sourse code: "+sourse.length());
		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.google.com/")) {
			
			System.out.println("Url matched ");
		}
		else {
			System.out.println("Not Url matched ");
		}
		
		
		
		
		

	}

}




/**
 * 1. Open chrome browser 
 * 2. Enter https://www.google.com 
 * 3. Get current page title and print in the console 
 * 4. Get current url from the application and print in the console 
 * 5. Get current page source code and print the length in the console 
 * 6. close the browser once all the above operations are done
*/