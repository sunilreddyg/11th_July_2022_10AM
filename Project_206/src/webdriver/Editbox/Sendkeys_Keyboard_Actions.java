package mq.selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_Keyboard_Actions 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Sending keybord keys on Editbox
		driver.findElement(By.name("firstname"))
		.sendKeys("Raghu"+Keys.TAB+"Ram"+Keys.TAB+"Raghuram@gmail.com");
		
		//Selecting dropdown using keyboard shortcut
		driver.findElement(By.xpath("//select[@id='day']"))
		.sendKeys("23");
		
		//Selecting month dropdown using Keboard keys
		driver.findElement(By.xpath("//select[@id='month']"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Selecting month dropdown using keyboard keys
		driver.findElement(By.xpath("//select[@id='year']"))
		.sendKeys("1980"+Keys.ARROW_DOWN);
		
		
	
		
	}

}
