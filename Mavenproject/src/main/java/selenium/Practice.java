package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=  new ChromeDriver();
		//driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollBy(550,0)", "");
	
//		List<WebElement>  ele= driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i = 0;i<ele.size();i++) {
//			ele.get(i).click();
//		}
//		driver.quit();
		
//		WebElement ele = driver.findElement(By.xpath("//select[@id='carselect']"));
//		Select sle = new Select(ele);
//	  sle.selectByIndex(1);
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("//input[@id='radio-3']"));
		radio.click();
		
		
		
	  
		
		
		
	   
	    
		
	}
}
