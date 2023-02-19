package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver drv  = new ChromeDriver();
		drv.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		WebElement ele  = drv.findElement(By.className("guide-banner-section__heading"));
		Actions act = new Actions(drv);
		act.contextClick(ele).perform();

	}

}
