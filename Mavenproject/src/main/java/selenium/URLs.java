package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		List<WebElement> element=  driver.findElements(By.tagName("a"));
      System.out.println(element.size());
      for(WebElement e: element) {
    	  System.out.println("text is"+e.getText());
    	  System.out.println(e.getAttribute("title"));
    	  System.out.println(e.getAttribute("href"));
      }
      driver.close();
	}

}
