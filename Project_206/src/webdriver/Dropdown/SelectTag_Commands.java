package mq.selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTag_Commands 
{

	public static void main(String[] args) {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Identify location and selecting dropdown using Visible Option Name
		WebElement Day_DD=driver.findElement(By.id("day"));
		new Select(Day_DD).selectByVisibleText("29");
		
		//Selecting dropdown option using Value Property
		WebElement Month_DD=driver.findElement(By.id("month"));
		new Select(Month_DD).selectByValue("5");
		
		//Selecting dropdown option using index number
		WebElement Year_DD=driver.findElement(By.id("year"));
		new Select(Year_DD).selectByIndex(21);
		
		
		/*
		 * Note:--> Option name and Optiov value property are
		 * 			casesensitive.
		 */
		

	}

}
