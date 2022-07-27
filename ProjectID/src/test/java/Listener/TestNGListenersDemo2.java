package Listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGListenersDemo2 {
	
	@Test
	public void Test5(){
		System.out.println("I am inside Test 5");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


driver.get("http://google.com");
driver.findElement(By.name("q"));

	}
	@Test
	public void Test6(){
		System.out.println("I am inside Test 6");
	}
	@Test
	public void Test7(){
		System.out.println("I am inside Test 7");
	}
	@Test
	
	public void Test8(){
		System.out.println("I am inside Test 8");
	}

}
