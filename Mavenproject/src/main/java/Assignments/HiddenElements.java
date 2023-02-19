package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenElements {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement show  = driver.findElement(By.xpath(" //input[@id='hide-textbox']"));
		WebElement   elem= driver.findElement(By.xpath("//input[@id='displayed-text']"));
		show.click();
		//WebElement   elem= driver.findElement();
		//System.out.println("Hidden element is not displyed "+elem.isDisplayed());
		show.click();
		System.out.println("Text from hidden element: "+elem.getAttribute("placeholder"));
		
		
	
		
	}

}
