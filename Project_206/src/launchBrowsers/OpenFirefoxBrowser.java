package launchBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFirefoxBrowser {

	public static void main(String[] args) 
	{
		
		
		//Setup geckoDriver
		WebDriverManager.firefoxdriver().setup();
		
		//Open Firefox browser and Loadwebpage
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://Instagram.com");
		
		//print page title
		System.out.println(firefox.getTitle());
		
		//Close browser
		firefox.close();
	}

}
