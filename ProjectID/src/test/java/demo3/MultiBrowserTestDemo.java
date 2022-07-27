package demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserTestDemo {

	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName ){
		System.out.println("The browser name is :"+browserName);
System.out.println("Thread id is :"+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	

		} 
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	

		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	}
		
	}
	@Test
	public void Test1() {
		System.out.println("Browser opened");
		driver.get("https://google.com");
	}


}