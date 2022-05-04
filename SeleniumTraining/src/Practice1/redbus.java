package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class redbus {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		
		List<WebElement> option1=	driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
		
		System.out.println("all option size : "+option1.size());
		
		for(int i=0;i<option1.size();i++) {
			driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
			WebElement ops= option1.get(i);
			
			String name=ops.getText();
			
			if(name.equals("Viman Nagar, Pune"))
			{
			ops.click();
			
			break;
			}
		}
		
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		
		List<WebElement> fromoption=driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
		
		for(int i1=0;i1<fromoption.size();i1++) {
			driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
			WebElement select=fromoption.get(i1);
			
			String name1=select.getText();
			
			if(name1.equals("Madgaon, Goa")) {
				select.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector(".rb-calendar>table>tbody>tr")).click();
		driver.findElement(By.cssSelector(".next>button")).click();
			
		List <WebElement> date =  driver.findElements(By.cssSelector(".rb-monthTable.first.last>tbody>tr>td.wd.day"));
		
			System.out.println("datesize: "+	date.size()); 
			
			for(int i3=0;i3<date.size();i3++) {
				
			
			driver.findElements(By.cssSelector(".rb-monthTable.first.last>tbody>tr>td.wd.day"));
			WebElement dateselect = date.get(i3);
			String	dateNo = dateselect.getText();
		
			if(dateNo.equals("9")) {
				
				dateselect.click();
				break;
			}
			}
	
		
			driver.findElement(By.cssSelector("#search_btn")).click();
			
			
			driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-of-type(4)")).click();//6
			driver.findElement(By.cssSelector(".clearfix.bpdpcoach-block>div>div")).click();//cross
			
			
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
			
			driver.findElement(By.cssSelector(".list-chkbox>li:label[for='bt_AC']")).click();//ac
			
			List<WebElement>	 busname=driver.findElements(By.cssSelector("#result-section>div>ul>div>li>div>div>div>div>div"));//bus details
		
			System.out.println("bs size: "+busname.size());
			
			for(int j=0;j<busname.size();j++) {
				
			WebElement Busoption=	busname.get(j);
			
			System.out.println(busname.get(j).getText());
			
			
				}
			
			//.list-chkbox>li:nth-of-type(3)>label[for='bt_AC']"
		
		driver.findElement(By.cssSelector(".open-primo")).click();
		//driver.findElement(By.cssSelector(".close-primo>i")).click();
		
			
			
			
	}
}
	
		
		

	

		
		


