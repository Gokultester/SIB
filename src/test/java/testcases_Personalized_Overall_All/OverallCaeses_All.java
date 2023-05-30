package testcases_Personalized_Overall_All;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common_Functionalities.Browser_Launch;
import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import common_Functionalities.ScreenShots;
import personalizedCards_Pages.Authorized_cards_Pages;
import personalizedCards_Pages.CVV_Genenartion_Pages;
import personalizedCards_Pages.EncodingAndEmbossing_Pages;
import personalizedCards_Pages.PIN_Generation_Pages;
import personalizedCards_Pages.Recieve_Cards_Pages;
import personalizedCards_Pages.issue_Cards_Pages;

public class OverallCaeses_All extends Common_Functions{
	static ExtentReports extentReports;
	static File file;
	static ExtentSparkReporter sparkReporter;
	static ExtentTest test;
	static Actions actions;
	@Test
	public void browser() throws InterruptedException {
		
		PageFactory.initElements(driver,ScreenShots.class );
		PageFactory.initElements(driver,Common_Functions.class );

		ExtentTest browserLaunch =extentReports.createTest("Application status"); 
		String expectedTitle = "DCMS";
		String pageTitle = driver.getTitle();
		String path1 = ScreenShots.captureScreenshot("applicationissuceesfullylaunchedinbrowser.jpg");
	
		if (pageTitle.equals(expectedTitle)) {
			browserLaunch.log(Status.PASS, "the SIB Application is launched in chrome browser successfully");
			browserLaunch.addScreenCaptureFromPath(path1);
			System.out.println(pageTitle);
		} else {
			browserLaunch.log(Status.FAIL, "the SIB Application is failed  launched in chrome browser successfully");
			browserLaunch.addScreenCaptureFromPath(path1);
			System.out.println(pageTitle);

		}
		
	
	}
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
	
	@Test(priority=1)
	public void authorize() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		actions = new Actions(driver);
		
		ExtentTest logintheapplicationToauthorizethecards =extentReports.createTest("login the application To authorize the cards"); 
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver, ScreenShots.class);
		String path2 = ScreenShots.captureScreenshot("Usersucessfullyauthrizethecards.jpg");
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
		PageFactory.initElements(driver, Authorized_cards_Pages.class);
		String extractedText = "No data available in table";
        String expectedText = "This is the expected text";
		Authorized_cards_Pages.personalizedprocess.click();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Authorized_cards_Pages.authorizecard.click();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected it should navigate to Authorization of cards  successfully.");
		Authorized_cards_Pages.retrieve.click();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		if (extractedText.equals(expectedText)) {
			Authorized_cards_Pages.checkbox.click();

		if (Authorized_cards_Pages.checkbox.isEnabled()) {
			logintheapplicationToauthorizethecards.log(Status.PASS, "User can able to select the card from the check box sucessfully");
		} else {
			logintheapplicationToauthorizethecards.log(Status.FAIL, "User need to select the card from the table to authorize the cards");
		}
		actions.click(Authorized_cards_Pages.authorise).build().perform();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected to get the success message card authorized successfully ");
		logintheapplicationToauthorizethecards.addScreenCaptureFromPath(path2);
		driver.navigate().refresh();
		 } else {
	        	driver.navigate().refresh();
	        	logintheapplicationToauthorizethecards.log(Status.SKIP, "No dta is found!");
	        }
	}
	@Test( priority=2 )
	private void authorizeCvvAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver,ScreenShots.class );
		actions = new Actions(driver);
		String path3 = ScreenShots.captureScreenshot("UsersucessfullygeneratetheCVV.jpg");
PageFactory.initElements(driver, CVV_Genenartion_Pages.class);
		ExtentTest Cvvgeneration =extentReports.createTest("Generating the cvv by selecting the all options"); 
		CVV_Genenartion_Pages.personalizedprocess.click();
		Cvvgeneration.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		CVV_Genenartion_Pages.cvvGeneration.click();
		Cvvgeneration.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		CVV_Genenartion_Pages.retrieve.click();
		CVV_Genenartion_Pages.checkbox.click();
		actions.click(CVV_Genenartion_Pages.authorise).build().perform();
		Cvvgeneration.log(Status.PASS, "User has expected to get the success message Cvv generated Sucessfully ");
		Cvvgeneration.addScreenCaptureFromPath(path3);
		driver.navigate().refresh();
}
	
	@Test( priority=3 )
	private void authorizePINAll() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	PageFactory.initElements(driver,ScreenShots.class );
	String path4 = ScreenShots.captureScreenshot("UsersucessfullygeneratedthePINthecards.jpg");
	
	actions = new Actions(driver);
	PageFactory.initElements(driver, PIN_Generation_Pages.class);
	ExtentTest PINGeneration =extentReports.createTest("Generating the PIN by selecting the all options");
	PIN_Generation_Pages.personalizedprocess.click();
	PINGeneration.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
			+ "1. Authorize Cards\r\n"
			+ "2. CVV Generation\r\n"
			+ "3.PIN generation \r\n"
			+ "4.Encoding/Embossing \r\n"
			+ "5.  Receive Cards\r\n"
			+ "6. Issue Cards\r\n"
			+ "5. Instant Issue Cards.");
	PIN_Generation_Pages.pinGeneration.click();
	System.out.println("pingeneration cicked");
	PIN_Generation_Pages.retrieve.click();
	System.out.println("retrive cicked");
	PINGeneration.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
	PIN_Generation_Pages.checkbox.click();
	System.out.println("check box cicked");
	actions.click(PIN_Generation_Pages.authorise).build().perform();
	PINGeneration.log(Status.PASS, "User has expected to get the success message PIN generated Sucessfully ");
	PINGeneration.addScreenCaptureFromPath(path4);
	driver.navigate().refresh();
	
}
	
	@Test( priority=4 )
	private void EncodingandEmbossingTheData() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		PageFactory.initElements(driver,ScreenShots.class );
		String path5 = ScreenShots.captureScreenshot("Usersucessfullygeneratetheencodingandembosingdata.jpg");
	    String extractedText = "No data available in table";
        String expectedText = "This is the expected text";
		PageFactory.initElements(driver, EncodingAndEmbossing_Pages.class);
		ExtentTest encodingandembossing =extentReports.createTest("user can get the encodding and embossing data");
		EncodingAndEmbossing_Pages.personalizedprocess.click();
		encodingandembossing.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		EncodingAndEmbossing_Pages.encodingandembossing.click();
		encodingandembossing.log(Status.PASS,"User has expected it popup the sub menu below CPC-Red KIT and NON CPC Red Kid");
		EncodingAndEmbossing_Pages.NON_CPC.click();
		encodingandembossing.log(Status.PASS, "User has expected it navigate into the encoding and embossing (NON CPC kid )");
		
		if (extractedText.equals(expectedText)) {
			EncodingAndEmbossing_Pages.retrieve.click();
			encodingandembossing.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
			//encodingAndEmbossing.checkbox.click();
			EncodingAndEmbossing_Pages.authorise.click();

			encodingandembossing.log(Status.PASS, "User has expected to get the success message encoding and embosing data generated successfully ");
			encodingandembossing.addScreenCaptureFromPath(path5);
			encodingandembossing.log(Status.PASS, "Text matches!");
			driver.navigate().refresh();
        } else {
        	driver.navigate().refresh();
        	encodingandembossing.log(Status.SKIP, "No dta is found!");
        }
	

		driver.navigate().refresh();
	}
@Test( priority=5 )
	private void recieveAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver,ScreenShots.class );
		String path6 = ScreenShots.captureScreenshot("Usersucessfullyrecievethecards.jpg");
		ExtentTest recievie =extentReports.createTest("recieve cards");
		actions = new Actions(driver);
		PageFactory.initElements(driver, Recieve_Cards_Pages.class);
		Recieve_Cards_Pages.personalizedprocess.click();
		recievie.log(Status.PASS, "User has expected to recieve cards successfully ");
		recievie.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Recieve_Cards_Pages.receivecards.click();
		recievie.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		actions.clickAndHold(Recieve_Cards_Pages.selectbatchNumber).build().perform();	
		recievie.addScreenCaptureFromPath(path6);
		recievie.log(Status.PASS, "User has expected to recieve cards successfully ");
		

		driver.navigate().refresh();
}
	@Test( priority=6 )
	private void issuecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver,ScreenShots.class );
		ExtentTest logintheapplicationToissuethecards =extentReports.createTest("issue cards"); 
		String path7 = ScreenShots.captureScreenshot("Usersucessfullyissuethecards.jpg");
		actions = new Actions(driver);
		PageFactory.initElements(driver, issue_Cards_Pages.class);
		issue_Cards_Pages.personalizedprocess.click();
		logintheapplicationToissuethecards.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Recieve_Cards_Pages.receivecards.click();
		issue_Cards_Pages.issuecards.click();
		logintheapplicationToissuethecards.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		issue_Cards_Pages.retrieve.click();
		
		issue_Cards_Pages.checkbox.click();
		actions.click(issue_Cards_Pages.issue).build().perform();
		logintheapplicationToissuethecards.addScreenCaptureFromPath(path7);
		logintheapplicationToissuethecards.log(Status.PASS, "User has expected to issue cards successfully ");

		driver.navigate().refresh();
}
	@AfterTest
	public void endTest() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
}
