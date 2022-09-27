package launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		//Setup Environment for chromedriver
		WebDriverManager.chromedriver().setup();
		
		//open chrome browser and laod webpage
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		
		//Print title of webpage
		System.out.println(chrome.getTitle());
		
		//Close Browser
		chrome.close();

	}

}
