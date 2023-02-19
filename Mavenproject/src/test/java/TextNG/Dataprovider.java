package TextNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	
	@Test(dataProvider = "getUserData")
	public void validateUserLoginTest(String uname,String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}
  @DataProvider
	public  Object[][] getUserData() {
		Object[][] data = new Object[3][2];
      data[0][0]="admin";
      data[0][1]="admin123";
      
      data[1][0]="hr";
      
      data[1][1]="hr123";
      
      data[2][0]="finance";
      
      data[2][1]="finance123";
      System.out.println(data[0][0]);
      System.out.println(data[0][1]);
      System.out.println(data[1][0]);
      System.out.println(data[1][1]);
      System.out.println(data[2][0]);
      System.out.println(data[2][1]);
      return data;
      
      
      
	}

}
