package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window==>"+driver.getTitle());
		String parentWindowId  = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Set<String> windows = driver.getWindowHandles();
		String childWindowId = null;
		
	Iterator<String> it  = windows.iterator();
		it.next();
		childWindowId = it.next();
		System.out.println("Parent Windowit=>" +parentWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("Parent Windowit=>" +childWindowId);
		System.out.println("child Windowit=>" +driver.getTitle());
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Windowit=>" +driver.getTitle());
		
		

	}

}
