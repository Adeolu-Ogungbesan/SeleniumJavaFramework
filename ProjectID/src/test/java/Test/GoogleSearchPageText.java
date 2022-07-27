package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageText {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		GoogleSearchTest();
			
		}
	public static void GoogleSearchTest() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		GoogleSearchPageObject searchPagObj = new GoogleSearchPageObject(driver);
		searchPagObj.SendTextBox("Automation step by step");
		searchPagObj.ClickTextButton();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
