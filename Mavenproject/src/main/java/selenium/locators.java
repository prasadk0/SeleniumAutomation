package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager .chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		
////		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("admin@gmail.com");
//		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//		driver.findElement(By.name("email")).sendKeys("admijn");
////		driver.findElement(By.partialLinkText("email")).sendKeys("admijn");
//		driver.findElement(By.tagName("email")).sendKeys("admijn");
		driver.findElement(By.xpath("//*[@id=\"u_0_3_U3\"]")).sendKeys("a");
		
				driver.close();
}


}

