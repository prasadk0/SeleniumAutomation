package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager .chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("username@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.name("Login")).click();
		driver.close();
	
		

	}

}
