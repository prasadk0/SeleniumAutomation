package TextNG;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver  = new ChromeDriver();
			driver.get("https://jqueryui.com/tooltip/");
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
		   Actions act = new Actions(driver);
		   WebElement ele = driver.findElement(By.xpath("//input[@id='age']"));
		   act.moveToElement(ele).perform();
		  String  actual = "We ask for your age only for statistical purposes.";
		//  Assert.assertEquals(actual, ele.getText());
		  String ex = ele.getText();
		  if(actual.equals(ex)){
			  System.out.println("pass");
		  }
		  System.out.println(ex);
		 
		  
	}

}
