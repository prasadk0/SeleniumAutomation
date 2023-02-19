package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 	System.out.println(driver.getCurrentUrl());
	 	System.out.println(driver.getTitle());
	 	System.out.println(driver.getPageSource());
	 	driver.get("https://www.facebook.com/");
	 	driver.quit();
	 	

	}

}
