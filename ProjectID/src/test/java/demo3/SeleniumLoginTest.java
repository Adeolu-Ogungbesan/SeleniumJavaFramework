
package demo3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class SeleniumLoginTest {
	
	
@Test
public static void TestOnGoogle() throws MalformedURLException {
	ChromeOptions browserOptions = new ChromeOptions();
	browserOptions.setPlatformName("Windows 11");
	browserOptions.setBrowserVersion("103");
	Map<String, Object> sauceOptions = new HashMap<>();
	sauceOptions.put("build", "<your build id>");
	sauceOptions.put("name", "<Google>");
	browserOptions.setCapability("sauce:options", sauceOptions);

	URL url = new URL("https://Adeolu:aab42488-8b1d-4741-82c2-8ddf11667f7d@ondemand.us-west-1.saucelabs.com:443/wd/hub");
	RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
	
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
	driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).sendKeys(Keys.RETURN);
	System.out.println("Test Completed");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}


}