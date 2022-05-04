import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class Practice3 {

	public static void main(String[] args) {
	
	
	String path=System.getProperty("user dir", ".\\executable\\chromedriver.exe"); 
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver =new ChromeDriver();
	
//	WebDriverManager.chromedriver().setup();//?
	
	driver.get("https://demo.actitime.com/");//open url
	
	driver.manage().window().maximize();//to max page
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
	String PageTitle = driver.getTitle();//getpageTitle
	System.out.println("PAGE TITTLE:  "+PageTitle);
	
	System.out.println("PAGE LENGTH:  "+PageTitle.length());//pagelength

	System.out.println("PAGE URL:  "+driver.getCurrentUrl());//get url
	
	System.out.println(driver.getCurrentUrl().equals("https://demo.actitime.com/login.do"));
	
	
	WebElement loginbutton =  driver.findElement(By.id("username"));
	
	loginbutton.sendKeys("admin");
	loginbutton.clear();	
	loginbutton.sendKeys("admin");
	//2.
	System.out.println("Login Button is Display or Not: "+loginbutton.isDisplayed());
	System.out.println("Login Button is Editable or Not: "+loginbutton.isEnabled());
	System.out.println("Login Button is Selected or Not: "+loginbutton.isSelected());
	String Actualtext=loginbutton.getAttribute("placeholder");//identify
	System.out.println("Default text for username field: "+Actualtext.equals("Username"));
	//loginbutton.sendKeys("admin");
	
	//3checkbox
	
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	
	System.out.println("is check box is Visible : "+checkbox.isDisplayed());
	System.out.println("is check box is Functional/Editable : "+checkbox.isEnabled());
	System.out.println("is check box is Selected : "+checkbox.isSelected());
	checkbox.click();
	
	System.out.println("is check box is Selected : "+checkbox.isSelected());
	
	//4//tagname
	System.out.println("is check box is Visible : "+checkbox.getTagName());
	
	WebElement   Password  =  driver.findElement(By.name("pwd"));
	Password.sendKeys("manager");
	
	WebElement LoginClick =  driver.findElement(By.id("loginButton"));
	
	LoginClick.click();
	
	 driver.findElement(By.cssSelector(".logoutCell.preventPanelsHiding>a")).click();//logout
	
	// WebDriverWait wait=new WebDriverWait(driver,20);//
	// wait.until(ExpectedCondition.elementToBeClickable(.logoutCell.preventPanelsHiding>a));//?
	 
	String ActualHomeTitle = driver.getCurrentUrl();
	
	System.out.println("ActualHomeTitle: "+ActualHomeTitle);
	
	
	
	}

}
