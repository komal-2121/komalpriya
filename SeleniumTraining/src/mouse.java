import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname	= driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstname.sendKeys("admin");
		Actions act =new Actions(driver);
		
		act.moveToElement(firstname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement lastname= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v'").keyUp(Keys.CONTROL).build().perform();
 
	}

}
