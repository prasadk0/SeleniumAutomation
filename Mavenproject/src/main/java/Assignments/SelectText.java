package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectText {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	
	Actions act = new Actions(driver);
	WebElement  ele = driver.findElement(By.xpath("//a[text()='Get Started free']"));
	act.doubleClick(ele).build().perform();


	}

}
