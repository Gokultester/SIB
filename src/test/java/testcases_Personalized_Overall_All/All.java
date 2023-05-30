package testcases_Personalized_Overall_All;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import common_Functionalities.ScreenShots;
import personalizedCards_Pages.Authorized_cards_Pages;
import personalizedCards_Pages.CVV_Genenartion_Pages;
import personalizedCards_Pages.EncodingAndEmbossing_Pages;
import personalizedCards_Pages.PIN_Generation_Pages;
import personalizedCards_Pages.Recieve_Cards_Pages;
import personalizedCards_Pages.issue_Cards_Pages;

public class All extends Common_Functions {

	static ExtentReports extentReports;
	static File file;
	static ExtentSparkReporter sparkReporter;
	static ExtentTest test;
	static Actions actions;

	@BeforeTest
	public static void startTest() throws IOException {
		 extentReports = new ExtentReports(); 
		  file = new File("reports.html");
		  sparkReporter = new ExtentSparkReporter(file);
		  Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
		 extentReports.attachReporter(sparkReporter);
		 extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		 extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		 extentReports.setSystemInfo("Browser Name",capabilities.getBrowserName()+capabilities);
		 extentReports.setSystemInfo("Browser Version",capabilities.getBrowserVersion()+capabilities);
		 extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		 extentReports.setSystemInfo("App URL", "http://172.16.10.48:8080/SIB/#/login");
		 extentReports.setSystemInfo("Username", "maker");
		 extentReports.setSystemInfo("password", "***********");
		 extentReports.getReport();
	}
	
	@Test
	public void runBySelectingAll()   {
		actions = new Actions(driver);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver, ScreenShots.class);
		PageFactory.initElements(driver, Authorized_cards_Pages.class);
		PageFactory.initElements(driver, CVV_Genenartion_Pages.class);
		PageFactory.initElements(driver, PIN_Generation_Pages.class);
		PageFactory.initElements(driver, EncodingAndEmbossing_Pages.class);
		PageFactory.initElements(driver, Recieve_Cards_Pages.class);
		PageFactory.initElements(driver, issue_Cards_Pages.class);
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		ExtentTest authorizethecards =extentReports.createTest("login the application To authorize the cards"); 
		ExtentTest Cvvgeneration =extentReports.createTest("Generating the cvv by selecting the all options"); 
		ExtentTest PINGeneration =extentReports.createTest("Generating the PIN by selecting the all options");
		ExtentTest encodingandembossing =extentReports.createTest("user can get the encodding and embossing data");
		ExtentTest recievie =extentReports.createTest("recieve cards");
		ExtentTest issuethecards =extentReports.createTest("issue cards"); 
		String path2 = ScreenShots.captureScreenshot("Usersucessfullyauthrizethecards.jpg");
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
	
		authorizethecards.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
		PageFactory.initElements(driver, Authorized_cards_Pages.class);
		
		Authorized_cards_Pages.personalizedprocess.click();
		authorizethecards.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Authorized_cards_Pages.authorizecard.click();
		authorizethecards.log(Status.PASS, "User has expected it should navigate to Authorization of cards  successfully.");
		Authorized_cards_Pages.retrieve.click();
		authorizethecards.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		Authorized_cards_Pages.checkbox.click();
		actions.click(Authorized_cards_Pages.authorise).build().perform();
		authorizethecards.log(Status.PASS, "User has expected to get the success message card authorized successfully ");
		authorizethecards.addScreenCaptureFromPath(path2);
	
		driver.navigate().refresh();
	
		Authorized_cards_Pages.personalizedprocess.click();
		authorizethecards.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Authorized_cards_Pages.authorizecard.click();
		authorizethecards.log(Status.PASS, "User has expected it should navigate to Authorization of cards  successfully.");
		Authorized_cards_Pages.retrieve.click();
		authorizethecards.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		Authorized_cards_Pages.checkbox.click();
		
		actions.click(Authorized_cards_Pages.authorise).build().perform();
		authorizethecards.log(Status.PASS, "User has expected to get the success message card authorized successfully ");
		authorizethecards.addScreenCaptureFromPath(path2);
	
		driver.navigate().refresh();
	}
	
	
	@AfterTest
	public void endTest() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
}
	
	
	

