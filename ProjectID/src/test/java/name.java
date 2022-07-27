import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class name {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\ProjectID\\ChromeDrive\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		driver.get("http://google.com");
		
		
	}

}
