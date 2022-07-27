package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.GoogleSearchPageText_TestNG2;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projetPath =System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties() {
		try {

			InputStream input = new FileInputStream(projetPath+"/src/test/java/Config/Config.properties");
			prop.load(input);
			String Browser = prop.getProperty("Browser");
			System.out.println(Browser);
			GoogleSearchPageText_TestNG2.browserName=Browser;
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projetPath+"/src/test/java/Config/Config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, "browser");

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}
}
