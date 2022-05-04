import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		WebElement	task = driver.findElement(By.cssSelector(".content.tasks"));
		task.click();
		
		driver.findElement(By.cssSelector(".title.ellipsis")).click();//add new
		driver.findElement(By.cssSelector(".dropdownContainer.addNewMenu>div:nth-of-type(3)")).click();//new task
		
driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer")).click();
		
		List<WebElement> company = driver.findElements(By.cssSelector(".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div>div>div>div>div>div"));
	
		System.out.println("No of Companes :" +company.size());
	
		for(int i=0;i<company.size();i++) {
			
			WebElement companyoption=company.get(i);
			String companyName=companyoption.getText();
			
			if(companyName.equals("Galaxy Corporation")) {
				
				companyoption.click();

				
				break;
			}
		}
		
		driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div")).click();
		
		List<WebElement> project = driver.findElements(By.cssSelector(".projectSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div>div>div>div>div>div"));
		
		System.out.println(" Count of Project:  "+project.size());
		
		for(int i=0;i<project.size();i++) {
		
			WebElement projectElement = project.get(i);
			
			String projectName=projectElement.getText();
			
			if(projectName.equals("Android testing")) {
				
				projectElement.click();	
				break;
				
	}
		
	}
	
		//driver.findElement(By.xpath("//td[@class='nameCell first']/input")).sendKeys("Atesting");
		
		driver.findElement(By.xpath("//td[@class='nameCell first']/input")).sendKeys("testing");
		
		driver.findElement(By.xpath("//td[@class='billingTypeCell']/div[2]")).click();
		
		driver.findElement(By.cssSelector(".dropdownContainer.components_typeOfWorkMenu.typeOfWorkEditorMenu.addNewTasks>div>div>div>div>div:nth-child(11)")).click();//click on testing
		
		driver.findElement(By.cssSelector(".x-btn-text")).click();
		
		driver.findElement(By.cssSelector("#ext-gen110")).click();
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-child(3)>td>a>em>span")).click();//date9
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		
		
		 driver.findElement(By.cssSelector(".createdTasksRowsTable>tbody>tr>td>div>div")).click();//
		 
			List<WebElement> atest = driver.findElements(By.cssSelector(".taskRow>td.names>div"));//tyesting
				
				for(int i=0;i<atest.size();i++) {
				
					WebElement atestname=atest.get(i);
					
					String atestoption=atestname.getText();
					
					if(atestoption.equalsIgnoreCase("testing")) {
					
						System.out.println("Created ");
		 				
					}else {
						
						System.out.println(" Not Created ");
					
					break;	
					}
				}
				
				
				Thread.sleep(2000);
				WebElement delete= driver.findElement(By.cssSelector(".delete.button"));
				
				delete.click();
				
				
				WebElement delete2= driver.findElement(By.cssSelector(".dialogWithPointerWrapper.deleteDialog>div>div>div>div:nth-of-type(5)>div>div>span"));
				
				delete2.click();
				 
				
///////////////////////////////////////////////
				List<WebElement> atestdeleted = driver.findElements(By.cssSelector(".taskRow>td.names>div"));
				
				for(int i=0;i<atest.size();i++) {
				
					WebElement atestname=atest.get(i);
					
					String atestoption=atestname.getText();
					
					if(atestoption.equals("testing")) {
						
					System.out.println("Deleted ");
			 				
					}else {
		
						System.out.println(" Not Deleted ");
						break;
			 			
		}
			}
		}

 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


