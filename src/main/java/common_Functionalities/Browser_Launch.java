package common_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Launch {
	public WebDriver driver;
	public static WebDriver getDriver() {
       
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("http://172.16.10.48:8080/SIB/#/login");
        driver.manage().window().maximize();
        return driver;
    }
	
	
}
