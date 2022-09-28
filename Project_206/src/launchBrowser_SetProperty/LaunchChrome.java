package launchBrowser_SetProperty;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  106.0
		 * 				Chrome Driver  =>  106.0
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to backup folder 
		 * 		=> with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		//Setting Runtime Environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome browser and stroing browser referece into ChromeDrier class
		ChromeDriver chrome=new ChromeDriver();
		
		//Using Browser reference loading webpage
		chrome.get("http://naukri.com");
		
		//Using browser reference priting current window title
		System.out.println(chrome.getTitle());
		
		//Close Browser
		chrome.close();
		
		
	}

}
