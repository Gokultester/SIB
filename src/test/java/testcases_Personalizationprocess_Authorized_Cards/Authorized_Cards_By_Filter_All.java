package testcases_Personalizationprocess_Authorized_Cards;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.bouncycastle.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import personalizedCards_Pages.Authorized_cards_Pages;
import personalizedCards_Pages.CVV_Genenartion_Pages;

public class Authorized_Cards_By_Filter_All extends Common_Functions 


{
	static ExtentReports extentReports;
	static File file;
	static ExtentSparkReporter sparkReporter;
	static ExtentTest test;
	
	@BeforeTest
	public static void startTest() throws IOException {
		
		  extentReports = new ExtentReports(); 
		  file = new File("reports.html");
		  sparkReporter = new ExtentSparkReporter(file);
		 extentReports.attachReporter(sparkReporter);
	}
	
	@AfterTest
	public void endTest() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
	
@Test
public void browser() throws InterruptedException {
	
	PageFactory.initElements(driver,Common_Functions.class );
	extentReports.createTest("Browser Launch").log(Status.PASS, "Chrome Browser launched");
	}


 @Test(priority=1) private void authorizecardsAll() throws
  InterruptedException, IOException {
	 ExtentTest authorizetest =	extentReports.createTest("authorizecardsAll"); 
 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
  
 
  Actions actions = new Actions(driver);
  PageFactory.initElements(driver,
		  Login_Application.class); Login_Application.username.sendKeys("maker");
		  Login_Application.password.sendKeys("Test@123");
		  Login_Application.login.click();
  PageFactory.initElements(driver, Authorized_cards_Pages.class);
  Authorized_cards_Pages.personalizedprocess.click();
  authorizetest.log(Status.PASS, "Personalized button clicked successfully");
 Authorized_cards_Pages.authorizecard.click();
 authorizetest.log(Status.PASS, "authorizecard button clicked successfully");
 Authorized_cards_Pages.retrieve.click();
 authorizetest.log(Status.PASS, "retrieve button clicked successfully");
 Authorized_cards_Pages.checkbox.click();
 actions.click(Authorized_cards_Pages.authorise).build().perform();
 Thread.sleep(2000);
 


 
  }
 
  }
 



