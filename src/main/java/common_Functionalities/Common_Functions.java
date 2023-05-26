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
	
	@BeforeSuite
public void browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://172.16.10.48:8080/SIB/#/login");
	driver.manage().window().maximize();	
}
	@AfterSuite
	public void closebrowser() {
		driver.close();
	}
}
