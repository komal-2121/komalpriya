import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywordmouse {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	WebElement firstname =	driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
	firstname.sendKeys("komal",Keys.chord(Keys.CONTROL,"a"));
	
	firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	
	firstname.sendKeys(Keys.TAB);

	
	WebElement   lastname = driver.switchTo().activeElement();
	
	
	String  activeplace  =     lastname.getAttribute("placeholder");
	String expectedactive = "Last Name";
	
	if(activeplace.equals(expectedactive)) {
		System.out.println("matched");
	}else {
		
		System.out.println("not matched");
	}
	
	
	lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
	
	lastname.sendKeys((Keys.TAB));
	
	WebElement      address = driver.switchTo().activeElement();
	
	String actual = address.getAttribute("placeholder");
	
	String expected = "Address";
	
	if(actual.equals(expected)) {
		
		System.out.println("matched");
	}else {
		
		System.out.println("not matched");
	}
		
	address.sendKeys("pune");
	
	address.sendKeys(Keys.TAB);	
	
	
	WebElement email  =  driver.switchTo().activeElement();
	
	String actualaddress = email.getAttribute("placeholder");
	
	String expectedaddress = "Email address";

	if(actualaddress.equals("expectedaddress")) {
	
	System.out.println("matched");
	}else {
		
		System.out.println("not matched");
	}
	
	email.sendKeys("komalpriya1010@gmail.com");
	
	email.sendKeys(Keys.TAB);
	
	
	
	WebElement phone  =  driver.switchTo().activeElement();
	
	String actualphone = phone.getAttribute("placeholder");
	
	String expectedphone = "Phone";

	if(actualaddress.equals("expectedaddress")) {
	
		System.out.println("matched");
		
			
	} else {
		
		System.out.println("not matched");
	}
	
	phone.sendKeys("7666753802");
	
	phone.sendKeys(Keys.TAB);
	
	
	WebElement gender		=	driver.switchTo().activeElement();
	
	String actualplaceholder= gender.getAttribute("placeholder");
	
	String expectedplaceholder = "Female";
	
	if(actualaddress.equals("expectedaddress")) {
		
		System.out.println("matched");
		
			
	} else {
		
		System.out.println("not matched");
	}
	
	
	
	gender.sendKeys(Keys.TAB);
	
	gender.click();
	
	gender.sendKeys(Keys.TAB);
	
	
	WebElement hobbies		=	driver.switchTo().activeElement();
	
	String actualplaceholder1= hobbies.getAttribute("placeholder");
	
	String expectedplaceholder1 = "Hobbies";
	
	if(actualaddress.equals("expectedaddress")) {
		
		System.out.println("matched");
		
			
	} else {
		
		System.out.println("not matched");
	}
	
	hobbies.click();
	
	hobbies.sendKeys(Keys.TAB);

	hobbies.sendKeys(Keys.TAB);
	hobbies.sendKeys(Keys.TAB);
	
	driver.findElement(By.id("msdd")).click();
List<WebElement> language =driver.findElements(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all>li>a"));
	
System.out.println("Size: "+language.size());	
	
for(int i=0;i<language.size();i++) {
	
 language.get(0).click();
 language.get(1).click();
 
 
 driver.findElement(By.cssSelector("body")).click();

 //	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
// 	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
// 	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
// 	
 	
 		WebElement dropdown = driver.findElement(By.id("Skills"));
 		dropdown.click();
 		Select act = new Select(dropdown);
 		
 		List	<WebElement >ops =  act.getOptions();
 		
 		System.out.println(ops.size());
 	
 		for(int i1=0;i<ops.size();i++) {
 		
 		//System.out.println("options: "+ops.get(i).getText());
 			}
 		act.selectByIndex(5);
 		
 		driver.findElement(By.cssSelector("body")).click();
 	
 		driver.findElement(By.cssSelector(".select2-selection.select2-selection--single")).click();
 		
 		driver.findElement(By.cssSelector(".select2-results__options>li:nth-child(6)")).click();

 		WebElement yearops = driver.findElement(By.id("yearbox"));
 		yearops.click();
 		
 		Select year =new Select(yearops);

 		List<WebElement> yearoptions = year.getOptions();
 		
 		for(int i2=0;i<yearoptions.size();i++) {
 		
 			year.selectByIndex(7);
 			
 			driver.findElement(By.cssSelector("body")).click();
 			
 	WebElement	month =	driver.findElement(By.cssSelector("select[placeholder='Month']"));
 			
 			month.click();
 			Select monthoptions =new Select(month);
 			List <WebElement> monthops = monthoptions.getOptions();
 			for(int i3=0;i3<yearoptions.size();i3++) {
 			monthoptions.selectByVisibleText("September");
 		}
 		
 		driver.findElement(By.cssSelector("body")).click();
 		
		
 	WebElement	day =	driver.findElement(By.id("daybox"));
 			
 			day.click();
 			Select dayoptions =new Select(day);
 			List <WebElement> dayops = dayoptions.getOptions();
 			for(int i4=0;i4<dayops.size();i4++) {
 			dayoptions.selectByIndex(1);
 		}
 		
 		
	driver.findElement(By.cssSelector("body")).click();
 		
 		
 		
 		
}
	}
}
}	
	



