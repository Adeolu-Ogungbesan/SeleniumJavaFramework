package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageText_TestNG {
	static WebDriver driver = null;
	
	@BeforeTest
	public void SetUpTest() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
			
		}
	@Test
	public  void GoogleSearchTest() {
		
		driver.get("https://google.com");
		
		GoogleSearchPageObject searchPagObj = new GoogleSearchPageObject(driver);
		searchPagObj.SendTextBox("Automation step by step");
		searchPagObj.ClickTextButton();
	}
		@AfterTest
		public void TearDownTest() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.quit();
			System.out.println("Test Completed Seccessfully!!!");
		}
			}


