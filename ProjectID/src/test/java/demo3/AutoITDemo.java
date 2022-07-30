package demo3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
		
}
	@Test
	@SuppressWarnings("deprecation")
	public static void test() throws Exception {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("https://basedev.gradely.co/auth/login");
		System.out.println("Site opened");
		driver.findElement(By.id("userinfo")).sendKeys("ogungbesanadeolu@gmail.com");
		System.out.println("Username entered");
		driver.findElement(By.id("password")).sendKeys("password1");
		System.out.println("Password entered");
		driver.findElement(By.cssSelector("#app > div > div > div.container.auth-wrapper > div.col-10.col-sm-9.col-md-6.col-lg-5.col-xl-4.form-wrapper > div.form-area > form > button")).click();
		System.out.println("Login successfully");
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		//WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds)
		//WebElement element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/div[1]/div[2]")));
		//WebElement element = driver.findElement(By.cssSelector("#app > div.layout-app-base > div.gradely-app-container.topnav-base-offset > div.gradely-container.px-1.px-sm-3.px-md-4.px-xl-5.mx-auto.smooth-animation > div.school-info-section > div.right > div.bottom-row > div:nth-child(9)"));
		//element.isDisplayed();
		//element.click();
		WebElement element = driver.findElement(By.cssSelector("#app > div.layout-app-base > div.gradely-app-container.topnav-base-offset > div.gradely-container.px-1.px-sm-3.px-md-4.px-xl-5.mx-auto.smooth-animation > div.school-info-section > div.right > div.bottom-row > div:nth-child(9) > div.class-top.pointer > div.left-set.d-flex.justify-content-start.align-items-center.color-text > div.class-level"));
		//WebDriverWait wait = new WebDriverWait(driver, null);

		//element = wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
			
	
		System.out.println("Pry 4 selected");
		
		WebElement feed = driver.findElement(By.cssSelector("#app > div.layout-app-base > div.gradely-app-container.topnav-base-offset > div.gradely-container.px-1.px-sm-3.px-md-4.px-xl-5.mx-auto.smooth-animation > div.school-info-section > div.right > div.bottom-row > div:nth-child(9) > div.class-bottom.smooth-transition > div.class-rows.smooth-transition > div > div > div.bottom-row.position-absolute.ignore > a.hint--primary.hint--rounded.hint--top-right.ignore > span"));
		//JavascriptExecutor execcutor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", feed);
		
		System.out.println("I am on pry 4 feed");
		driver.findElement(By.cssSelector("#tabSwitcher > div > div > div > div.w-100 > div")).click();
		
		driver.findElement(By.cssSelector("#tabSwitcher > div > div > div.post-top.w-100 > div.post-top-row.w-100 > div.wrapper.w-100 > div.extended-textarea.rounded-12")).sendKeys("Hello class");
		System.out.println("Text sent");
		driver.findElement(By.cssSelector("#tabSwitcher > div > div > div.post-bottom > label > div.text")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\C# Training\\insertObjectScript.exe");
		
		//driver.findElement(By.cssSelector("#tabSwitcher > div > div > div.post-bottom > div > button")).click();
		System.out.println("Uploaded successfully");
		System.out.println("Test completed successfully");
		//driver.findElement(By.cssSelector("#tabSwitcher > div > div > div.post-bottom > div > button")).click();
		//driver.close();
	}
	
	
}
