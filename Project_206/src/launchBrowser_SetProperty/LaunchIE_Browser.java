package launchBrowser_SetProperty;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_Browser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		String pagetitle=ie.getTitle();
		System.out.println(pagetitle);
		
		

	}

}
