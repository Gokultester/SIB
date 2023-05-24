package common_Functionalities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Functions {
  public static WebDriver driver = null;
	static  Properties properties = null;
	
	/*public Properties loadProperFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperFile();
		String browser= properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterSuite
	public void tearDown() {
*/
	@BeforeSuite
public void browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://172.16.10.48:8080/SIB/#/login");
	driver.manage().window().maximize();
	
}
}
