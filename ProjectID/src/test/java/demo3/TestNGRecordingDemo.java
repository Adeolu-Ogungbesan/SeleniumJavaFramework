package demo3;

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import static org.testng.Assert.fail;
import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
	import java.io.File;
import java.time.Duration;

	public class TestNGRecordingDemo {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  JavascriptExecutor js;
	  @BeforeTest
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void test() throws Exception {
	    driver.get("https://basedev.gradely.co/auth/login?redirect=https%3A%2F%2Fbasedev.gradely.co%2F");
	    driver.findElement(By.id("userinfo")).sendKeys("ogungbesanadeolu@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("password1");
	    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/form/button")).click();
	    driver.get("https://basedev.gradely.co/");
	    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div[2]/div[2]/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/form/button")).click();
	    driver.findElement(By.id("userinfo")).clear();
	    driver.findElement(By.id("userinfo")).sendKeys("ogungbesanadeolu@yahoo.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("1234ade");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

	


