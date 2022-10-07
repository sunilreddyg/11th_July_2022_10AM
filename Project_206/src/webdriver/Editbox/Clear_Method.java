package mq.selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear_Method {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Sending keybord keys on Editbox
		driver.findElement(By.name("firstname")).sendKeys("Mounika");
		
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).clear();
		
		
		driver.findElement(By.name("firstname")).sendKeys("pavani");

	}

}
