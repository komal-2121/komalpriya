package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {

	public static void main(String[] args) {
		
		//get required browser executable path
	//	String path1="C:\\Users\\hp\\eclipse-workspace\\SeleniumTraining\\executable\\chromedriver.exe";
		//String path2="\\executable\\chromedriver.exe"; 

		String path3=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";		
	}

	//set required browser exeutable path using System.set property(String key,String value)
	
//String System.out.property("")

//which ever browser we hjave to open we have to crete object of that ChromeDriver();

	
	ChromeDriver d=	new ChromeDriver();


}
