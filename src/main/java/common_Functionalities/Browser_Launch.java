package common_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Launch {
	public static  WebDriver driver;
	public static String title=null;;
	public static WebDriver getDriver() {
    
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("http://172.16.10.48:8080/SIB/#/login");
        driver.manage().window().maximize();
        return driver;
    
	
	}
	public static String gettitle() {
		
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return title;
		}
}
