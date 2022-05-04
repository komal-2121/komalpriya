package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicr5 {

	public static void main(String[] args) {
		
		String path = System.getProperty("user dir") +"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
	WebElement	Usernamefield = driver.findElement(By.id("username"));
		
		System.out.println("user name is visible on screen : "+Usernamefield.isDisplayed());
		System.out.println("user name is editable on screen : "+Usernamefield.isEnabled());
		
		String actualtextonusername=Usernamefield.getAttribute("placeholder");
		
		System.out.println("Default text validation of username: "+actualtextonusername.equals("Username"));
		
		Usernamefield.sendKeys("admin");
		
		
	WebElement PasswordField=driver.findElement(By.name("pwd"));
	
	System.out.println("Password is Visiblible: "+PasswordField.isDisplayed());
	System.out.println("Password is Editable: "+PasswordField.isDisplayed());
	
	String actualtextOnPassword = PasswordField.getAttribute("placeholder");
	
	System.out.println("Default pass text name: "+actualtextOnPassword.equals("Password"));
	
	System.out.println("Tag Name of password: "+PasswordField.getTagName());
	
	PasswordField.sendKeys("manager");
	
	//identify keep me login checkbox
	
	WebElement  checkbox = driver.findElement(By.name("remember"));//???????????????
	
	System.out.println("Check box visible : "+checkbox.isDisplayed());
	System.out.println("Check box Editable : "+checkbox.isEnabled());
	System.out.println("Check box Selected : "+checkbox.isSelected());
	
	//checkbox.click();
	
	WebElement loginbutton=driver.findElement(By.id("loginButton"));
	
	System.out.println("visible login button : "+loginbutton.isDisplayed());
	System.out.println(" Enable login button : "+loginbutton.isEnabled());
	
	String actualLoginname=loginbutton.getText();
	
	System.out.println("Login Button name Validation : "+actualLoginname.equals("Login"));
	
	//loginbutton.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}