package launchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_login 
{

	public static void main(String[] args)
	{

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();

		driver.get("https://www.facebook.com/");
	    driver.manage().window().setSize(new Dimension(800, 560));
	    driver.findElement(By.id("email")).sendKeys("fdsfdsfdsf");
	    driver.findElement(By.id("pass")).sendKeys("dfsdfsdfdsf");
	    driver.findElement(By.name("login")).click();

	  
	}

}
