import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		
		WebDriver  driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("#src")).sendKeys("Goa");
		
		List  <WebElement>    placeoption = driver.findElements(By.cssSelector(".autoFill>li "));
		
		for(int i=0;i<placeoption.size();i++) {
			
			WebElement Fromplaceops=placeoption.get(i);
			
			String name=Fromplaceops.getText();
			
			
			if(name.equals("Madgaon, Goa")) {
				
				Fromplaceops.click();
				break;
			}
			
		}		
			
			driver.findElement(By.cssSelector("#dest")).sendKeys("Pune");
			
			List<WebElement > Toops = driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
			
			for(int i1=0;i1<Toops.size();i1++) {
				
			WebElement toplace=Toops.get(i1);	
				
			String ToPlacename = toplace.getText();
			

			if(ToPlacename.equals("Wakad, Pune")) {
				
				toplace.click();
				break;
			}
			}
		
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();

		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>*:nth-child(4)>*:nth-child(4)")).click();
		
		driver.findElement(By.id("search_btn")).click();//search
		
	
	
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-child(4)>label")).click();//After 6
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		//driver.findElement(By.cssSelector(".open-primo")).click();
	//	driver.findElement(By.cssSelector(".close-primo")).click();//promocross
		
		
		driver.findElement(By.cssSelector("label[for='bt_AC']")).click();//ac
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		List<WebElement>	busname = driver.findElements(By.cssSelector(".travels.lh-24.f-bold.d-color"));
		List<WebElement>	busops= driver.findElements(By.cssSelector(".fare.d-block"));
		
		for(int i=0;i<busname.size();i++) {
			
			WebElement  busoption= busname.get(i);
			WebElement  busopts=  busops.get(i);
			
			System.out.println("busname:   "+busoption.getText()+" Busprice:  "+busopts.getText());
			
			
			
		}
	
		
	
	}
}

