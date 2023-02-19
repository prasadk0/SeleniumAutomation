package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
		act.moveToElement(ele).perform();

	}

}
