package Assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrlJSExecutro {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		JavascriptExecutor js  = (JavascriptExecutor) driver;
		String s = js.executeScript("return document.URL").toString();
		System.out.println(s);
	}

}
