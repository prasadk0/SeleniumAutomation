package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.JavascriptEcecuter;

public class ClickOnHiddenButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.dofactory.com/html/button/hidden");
            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
               js.executeScript("window.scrollBy(0,2000)", "");
              //driver.findElement(By.xpath("//button[text()='Toggle hidden']")).click();
              
              driver.findElement(By.xpath("//button[@id='button']")).click();
             
              
	}

}
