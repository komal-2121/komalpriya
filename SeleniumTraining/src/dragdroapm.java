import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdroapm {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		
		//frame handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		
		
		List<WebElement>	dragsourse = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement trash = driver.findElement(By.cssSelector(".ui-widget-content.ui-state-default.ui-droppable"));
		
		Actions  act = new Actions(driver);
		
		act.dragAndDrop(dragsourse.get(1), trash).build().perform();
		
		act.dragAndDrop(dragsourse.get(3), trash).build().perform();
		
		
		
		
		
		
		
		

	}

}
