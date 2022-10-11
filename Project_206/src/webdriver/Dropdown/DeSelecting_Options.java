package mq.selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelecting_Options {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Identifying State Dropdown
		WebElement State_DD=driver.findElement(By.xpath("//select[@id='customState']"));
	
		/*
		 * Using Javscript executor Converting Single Option Dropdown
		 * into Multiple Selection Dropdown..
		 */
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", State_DD);

		//Verifying Drodpown Multiple selection state
		boolean flag=new Select(State_DD).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is --> "+flag);
		
		//Decision statement to continue execution on multiple selection type.
		if (flag) 
		{
			System.out.println("Dropdown is really multiple selection type");
			new Select(State_DD).deselectAll();   //Deselecting options ony works when droddown is multipel selection type
			new Select(State_DD).selectByIndex(1);
			new Select(State_DD).selectByIndex(3);
			new Select(State_DD).selectByIndex(5);
			
			//GetAllSelectionCount
			int Count=new Select(State_DD).getAllSelectedOptions().size();
			System.out.println("Number of Options Selected is --> "+Count);
			
			
			//Deselecting Single Option From Multiple Selection
			new Select(State_DD).deselectByIndex(3);
			
			//GetAllSelectionCount
			int DCount=new Select(State_DD).getAllSelectedOptions().size();
			System.out.println("Number of Options Selected is --> "+DCount);
			
			
			
		}
		else 
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
	}

}
