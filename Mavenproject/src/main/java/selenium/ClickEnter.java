package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		WebElement  m= driver.findElement(By.xpath("//input[@type='search']"));
		m.sendKeys("Java");
		
		
		 
	      m.sendKeys(Keys.ENTER);
	      driver.close();
	      
		
		
		

	}

}
