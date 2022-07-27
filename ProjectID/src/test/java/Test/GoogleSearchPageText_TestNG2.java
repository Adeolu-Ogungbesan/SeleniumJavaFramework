package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import PageObject.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageText_TestNG2 {
	static WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void SetUpTest() {
		
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
				
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		
			
		}
	@Test
	public  void GoogleSearchTest2() {
		
		driver.get("https://google.com");
		
		GoogleSearchPageObject searchPagObj = new GoogleSearchPageObject(driver);
		searchPagObj.SendTextBox("Automation step by step");
		searchPagObj.ClickTextButton();
	}
	
	@Test
	public  void GoogleSearchTest3() {
		
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
			PropertiesFile.setProperties();
		}
			}


