package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports_Demo {
	private static WebDriver driver = null;
public static void main(String[] args) {
	
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Avent.html");

	ExtentReports extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	ExtentTest test1 = extent.createTest("GoogleSerchTest1","This is a test an google search functionalities");
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
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
	 driver.quit();
	 test1.pass("Clossed the browser");
	 
	 test1.info("Test Completed");
	 
		ExtentTest test2 = extent.createTest("GoogleSerchTest2","This is a test an google search functionalities");

	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		test2.info("Starting test case");

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
	
	 driver.quit();
	 test2.pass("Clossed the browser");
	 
	 test2.info("Test Completed");
	 
	extent.flush();

}
}
