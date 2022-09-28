package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Manager_4 
{

	public static void main(String[] args) 
	{
		
		/*
		 * WebDriver:-->
		 * 			=> Webdriver is a interface class it can automate
		 * 				all browser instances supported by selenium
		 * 
		 * 			=> Webdriver Can manage crossbrowser automation
		 * 				with multiple browser
		 */
		
		//set ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		//launching chrome browser and storing browser reference into webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//Loading webpage
		driver.get("http://instagram.com");
		
		//printing Page title
		System.out.println(driver.getTitle());
		
		//Closing browser
		driver.close();
		
	}

}
