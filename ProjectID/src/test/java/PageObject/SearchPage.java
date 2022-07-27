package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	 private static WebElement element = null;
	
	public static WebElement GoogleSearch_box(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
	}

	public static WebElement GooglSearch_button(WebDriver driver) {
		
		element = driver.findElement(By.name("btnk"));
		return element;
	}
}
