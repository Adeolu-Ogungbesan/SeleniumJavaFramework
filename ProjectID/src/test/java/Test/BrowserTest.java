package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import PageObject.GoogleSearchPageObject;

public class BrowserTest {
	
	
	static WebDriver driver = null;
	
	
	public static void main(String[] args) {
	
		
		
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();

		
		driver.get("http://google.com");
		
		
	
		
	}

}
