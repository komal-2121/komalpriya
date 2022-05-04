package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver ();
		
		d.get("https://demo.actitime.com/");
		
		String title=d.getTitle();
		System.out.println("Title"+title);
		System.out.println("Title"+title.length());
		System.out.println(d.getCurrentUrl());
		
		if(d.getCurrentUrl().equals("https://demo.actitime.com/")){
			
			System.out.println("correct url");
		}else {
				System.out.println("Not correct url");
			}
			
		}
}		
//		String sourse= d.getPageSource();
//		System.out.println("Sourse: "+sourse);
//		System.out.println("Sourse: "+sourse.length());
//		
		
//}		
//}	
//
//	}
//
//}
