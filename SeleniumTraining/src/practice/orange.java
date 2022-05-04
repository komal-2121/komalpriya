package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class orange {

	public static void main(String[] args) {//( Username : Admin | Password : admin123 )
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				
				WebDriver web=new ChromeDriver();
				
				web.manage().window().maximize();
				web.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				web.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
			String cred=	web.findElement(By.tagName("span")).getText();
			
			System.out.println("Cred"+cred);
			
//			cred=cred.replace("( Username :","");//1 sath
//			cred=cred.replace("| Password :", "");
//			cred=cred.replace(")", "");
//			System.out.println("only id pass: "+cred);
			
		
		
			String [] logindetails = cred.split(" ");
			
			System.out.println("[]: "+logindetails);
		
			web.findElement(By.id("txtUsername")).sendKeys(logindetails[3]);
			web.findElement(By.id("txtPassword")).sendKeys(logindetails[7]);
			//web.findElement(By.id("btnLogin")).click();
////			 
//			
			
			
		
		
		

	}

}
