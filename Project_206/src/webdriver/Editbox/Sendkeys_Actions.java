package mq.selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_Actions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		//Clicking on Singn In button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='password']"))
		.sendKeys("Hello@123"+Keys.ENTER);

	}

}
