package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=1363715335726839156&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301802&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=Cj0KCQiAxbefBhDfARIsAL4XLRrs-qqEKr6CiBdAgn74ZC0olumLY_iFgbyOiWFl57yUjtD-Pjok4xMaAlihEALw_wcB");
       WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
       ele.sendKeys("oppos");
       ele.sendKeys(Keys.ENTER);
	}

}
