import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilityDemo {
	static WebDriver driver = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ensureCleanSession", true);
		
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver(caps);
 driver.get("https://google.com");
 driver.findElement(By.name("q")).sendKeys("Automation step by step");
 driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).sendKeys(Keys.RETURN);

	}

}
