package Test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_Test {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();	
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		
		driver.findElement(By.xpath("//input[@id='user-name' and @placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@data-test='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.quit();
		
		
		
	}
		
		
		
		

	
	
	
	
}
