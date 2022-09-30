package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Registration 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		
		//Clicking on Sing up link
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		
		//Type Firstname
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Newuser");;
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Webdriver");
		
	
	}

}
