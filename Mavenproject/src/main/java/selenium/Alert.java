package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert  {

	public static void main(String[] args) throws InterruptException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("");
	driver.findElement(By.id(null));
	
	Alert al = driver.switchTo().alert();
	al.accept();
	

	}

}
