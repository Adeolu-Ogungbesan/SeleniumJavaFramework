package demo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSecondPieSize;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGWaitDemo {
	
	public static void main(String[] args) {
		SeleniumWait();
		
	}

	
	@SuppressWarnings("deprecation")
	public static void SeleniumWait() {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//250ms
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("abcd")).click();
		
		WebDriverWait wait;
		try {
			wait = new WebDriverWait(driver, TimeUnit.toSeconds(20));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.quit();
		driver.close();
	}
}
