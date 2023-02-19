package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptEcecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//js.executeScript("window.scrollBy(0,1000)");
		//scrolling to the end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// scrolling to the particular element 
		WebElement target = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Grocery]"));
		js.executeScript("arguments[0].scrollIntoView", target);
		//driver.close();

	}

}
