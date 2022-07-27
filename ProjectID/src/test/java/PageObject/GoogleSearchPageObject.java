package PageObject;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	static WebDriver driver = null;
	By textBox_Search = By.name("q");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By textButton_Search = By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b");
public void SendTextBox(String text) {
	driver.findElement(textBox_Search).sendKeys(text);
}
public void ClickTextButton() {
	driver.findElement(textButton_Search).sendKeys(Keys.RETURN);	
}



}
