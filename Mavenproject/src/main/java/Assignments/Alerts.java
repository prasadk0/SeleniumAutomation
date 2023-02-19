
package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.JavascriptEcecuter;

public class Alerts{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/delete_customer.php");
            driver.manage().window().maximize();
            driver.findElement(By.name("cusid")).sendKeys("prasad");
            driver.findElement(By.name("submit")).click();
            Alert alt = driver.switchTo().alert();
            alt.accept();
            alt.dismiss();
            System.out.println(alt.getText());
            // in case any add prompt alt.sendKeys(null)
              
             
              
	}

}
