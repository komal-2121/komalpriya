package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com");
		
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		System.out.println("TitkeLength: "+title.length());
		
		if(driver.getTitle().equals("actiTIME - Login")) {
			
			System.out.println("same Title");
			
		}else {
				System.out.println(" Title not match");
			
		}
		
	System.out.println(driver.getCurrentUrl());
	
	String sourse = driver.getPageSource();
	
	//System.out.println("Source"+source);
	//System.out.println("Source"+sourse.length());
	driver.close();

	}

}
