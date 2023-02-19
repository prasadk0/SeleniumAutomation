package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		//JavascriptEcecuter js = (JavascriptEcecuter) driver;
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,350)", "");
		//Creating object of an Actions class
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,550)", "");
		
		
		Actions action  = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[@id='mousehover']"));
		action.moveToElement(btn).perform();
		Thread.sleep(3000);
		
		
		
		

	}

}
