package practice;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver" ,".\\executable\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		d.manage().window().setSize(new org.openqa.selenium.Dimension (500,700));
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//identify 
		
		d.findElement(By.linkText("Forgot your Password?")).click();

		d.navigate().back();
		
		d.navigate().forward();
		
		d.navigate().refresh();
		
		d.navigate().to("");
		
		
		
		
		
		
		
		

	}

}
