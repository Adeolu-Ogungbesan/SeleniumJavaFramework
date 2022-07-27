
package demo3;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		test1();
	}

	
	public static void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector("#botstuff > div > div:nth-child(3) > table > tbody > tr > td:nth-child(3) > a")).click();
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/div/a/h3")).click();
		 
			   // Waiting 30 seconds for an element to be present on the page, checking
			   // for its presence once every 5 seconds.
			   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(2L))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement path = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/div/a/h3"));
			       
			       
			       if (path.isEnabled()) {
			    	   System.out.println("Element is enabled");
			       }
		    	   return path;

			     }
			   });
			 element.click();

		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
}
