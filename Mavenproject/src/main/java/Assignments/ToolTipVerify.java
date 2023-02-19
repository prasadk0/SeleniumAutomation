package Assignments;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/mouse/");
		WebElement ele  = driver.findElement(By.id("m-documentation"));
		String Exp = "The Selenium Browser Automation Project";
		  String Act = ele.getAttribute("title");
		  
		  if(Act.equals(Exp)) {							
	            System.out.println("Test Case Passed");					
	        }else {
	        
	        }
		  

	}

}
