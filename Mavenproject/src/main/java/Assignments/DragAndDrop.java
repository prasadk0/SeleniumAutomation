package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
        
        //Element on which need to drop.		
      
		WebElement src = driver.findElement(By.xpath("//li[@id='fourth']"));	;
		
        WebElement des = driver.findElement(By.xpath("//ol[@id='amt7']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(src, des).build().perform();
        
	}

}
