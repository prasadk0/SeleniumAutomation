import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=14727083324750360140&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040236&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=Cj0KCQiA6LyfBhC3ARIsAG4gkF80RXbuC2H78xhWGfPOz4r2xt-5JraUOhd-hSzpBpLGLCcXhzIMfxwaAl1nEALw_wcB");
        WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       js.executeScript("document.getElementById('twotabsearchtextbox').value='laddu';",ele);
       WebElement inner = driver.findElement(By.xpath("//h2[contains(text(),'Up to 70% off | Clearance store')]"));
       js.executeScript("document.getElementByClassName('a-color-base headline truncate-2line').innerText", inner);
       
      // js.executeScript(“document.getElementsByID(‘element id ’).value = ‘xyz’;”);
        WebElement button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click()", button);
        
        
        //inner text
        
        
	}

}
