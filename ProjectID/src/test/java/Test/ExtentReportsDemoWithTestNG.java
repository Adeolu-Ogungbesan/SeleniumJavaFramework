package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	static WebDriver driver = null;
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test1;
	ExtentTest test2;
	

	@BeforeSuite
	public void SetUp() {
	 sparkReporter = new ExtentSparkReporter("ExtextReports.html");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
		@BeforeTest
	 public void SetUpTest() {
		
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
	 }
	 		

	
	@Test
	public void test1() {
		test1 = extent.createTest("GoogleSerchTest1","This is a test an google search functionalities");
		test1.info("Starting test case");
		 driver.get("https://google.com");
		 test1.pass("Navigated to the google site");
		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 test1.pass("Text typed into the search box successfuly");
		 driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	@Test
		 public void test2() {
		 test2 = extent.createTest("GoogleSerchTest2","This is a test an google search functionalities");
		 
		test2.info("Starting test case 2");
			 driver.get("https://google.com");
			 test2.pass("Navigated to the google site");
			 driver.findElement(By.name("q")).sendKeys("Automation step by step");
			 test2.pass("Text typed into the search box successfuly");
			 driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).sendKeys(Keys.RETURN);
			test2.fail("Pressed keyboard enter key");
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 

	}
	@AfterTest
	public void TearDownTest() {
		driver.quit();
		test1.pass("Clossed the browser");
		 test2.pass("Clossed the browser");

		
	}
	
	
	@AfterSuite
	public void TearDown() {
		test1.info("Test Completed");
		test2.info("Test Completed");
		extent.flush();
		
	}
}
