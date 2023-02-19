package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://output.jsbin.com/osebed/2");
    WebElement dropdown  = driver.findElement(By.id("fruits"));
    Select obj = new Select(dropdown);
//    obj.selectByIndex(0);
//    Thread.sleep(4000);
    obj.selectByValue("orange");
    obj.selectByVisibleText("Apple");
    driver.close();
	}

}
