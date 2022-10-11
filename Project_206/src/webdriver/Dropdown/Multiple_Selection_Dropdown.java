package mq.selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Selection_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identifying State Dropdown
		WebElement State_DD=driver.findElement(By.xpath("//select[@id='customState']"));
		
		//Verifying Drodpown Multiple selection state
		boolean flag=new Select(State_DD).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is --> "+flag);
		
		/*
		 * Using Javscript executor Converting Single Option Dropdown
		 * into Multiple Selection Dropdown..
		 */
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", State_DD);

		//Verifying Drodpown Multiple selection state
		boolean flag1=new Select(State_DD).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is --> "+flag1);
		
		
		
		
	}

}
