package testcases_Personalized_Overall_All;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
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
		
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@BeforeTest
	public static void startTest() throws IOException {
		
		  extentReports = new ExtentReports(); 
		  file = new File("reports.html");
		  sparkReporter = new ExtentSparkReporter(file);
		 extentReports.attachReporter(sparkReporter);
	}
	
	@Test(priority=1)
	public void authorize() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		actions = new Actions(driver);
		ExtentTest logintheapplicationToauthorizethecards =extentReports.createTest("login the application To authorize the cards"); 
		PageFactory.initElements(driver, Login_Application.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		logintheapplicationToauthorizethecards.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
		PageFactory.initElements(driver, Authorized_cards_Pages.class);
		ExtentTest authorizethecard =extentReports.createTest("Authorize the card by selecting the all options"); 
		Authorized_cards_Pages.personalizedprocess.click();
		authorizethecard.log(Status.PASS, "User has expected should be able to see the following options like \r\n"
				+ "1. Authorize Cards\r\n"
				+ "2. CVV Generation\r\n"
				+ "3.PIN generation \r\n"
				+ "4.Encoding/Embossing \r\n"
				+ "5.  Receive Cards\r\n"
				+ "6. Issue Cards\r\n"
				+ "5. Instant Issue Cards.");
		Authorized_cards_Pages.authorizecard.click();
		authorizethecard.log(Status.PASS, "User has expected it should navigate to Authorization of cards  successfully.");
		Authorized_cards_Pages.retrieve.click();
		authorizethecard.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		//Authorized_cards_Pages.checkbox.click();
		actions.click(Authorized_cards_Pages.authorise).build().perform();
		authorizethecard.log(Status.PASS, "User has expected to get the success message card authorized successfully ");
		Thread.sleep(4000);
		Login_Application.logout.click();
	}
	@Test( priority=2 )
	private void authorizeCvvAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		actions = new Actions(driver);
		ExtentTest logintheapplicationToauthorizetheCVV =extentReports.createTest("login the application To generate the cvv"); 
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		logintheapplicationToauthorizetheCVV.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
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
		Thread.sleep(4000);
		Login_Application.logout.click();
	
}
	
	@Test( enabled=false )
	private void authorizePINAll() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
	PageFactory.initElements(driver, Login_Application.class);
	ExtentTest logintheapplicationToGeneratethePIN =extentReports.createTest("login the application To generate the PIN"); 
	Login_Application.username.sendKeys("maker");
	Login_Application.password.sendKeys("Test@123");
	Login_Application.login.click();
	logintheapplicationToGeneratethePIN.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
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
	PIN_Generation_Pages.cvvGeneration.click();
	PIN_Generation_Pages.retrieve.click();
	PINGeneration.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
	PIN_Generation_Pages.checkbox.click();
	actions.click(PIN_Generation_Pages.authorise).build().perform();
	PINGeneration.log(Status.PASS, "User has expected to get the success message PIN generated Sucessfully ");
	Thread.sleep(4000);
	Login_Application.logout.click();
	
}
	
	@Test( enabled=false )
	private void EncodingandEmbossingTheData() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		ExtentTest logintheapplicationTogettheencodingandembossingdata =extentReports.createTest("login the application To get the encoding and embossing"); 
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		logintheapplicationTogettheencodingandembossingdata.log(Status.PASS, "User has expected should be able to login and see the dashboard page successfully");
		actions = new Actions(driver);
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
		EncodingAndEmbossing_Pages.retrieve.click();
		encodingandembossing.log(Status.PASS, "User has expected should be able to see All the Card details in the Table View. ");
		//EncodingAndEmbossing.checkbox.click();
		EncodingAndEmbossing_Pages.authorise.click();
		Thread.sleep(4000);
		encodingandembossing..log(Status.PASS, "User has expected to get the success message encoding and embosing data generated successfully ");
		Login_Application.logout.click();
	}
	@Test( enabled=false )
	private void recieveAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		actions = new Actions(driver);
		PageFactory.initElements(driver, Recieve_Cards_Pages.class);
		Recieve_Cards_Pages.personalizedprocess.click();
		Recieve_Cards_Pages.receivecards.click();
		actions.clickAndHold(Recieve_Cards_Pages.selectbatchNumber).build().perform();	
		Thread.sleep(5000);
		Login_Application.logout.click();
}
	@Test( enabled=false )
	private void issuecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_Application.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		actions = new Actions(driver);
		PageFactory.initElements(driver, issue_Cards_Pages.class);
		issue_Cards_Pages.personalizedprocess.click();
		issue_Cards_Pages.issuecards.click();
		issue_Cards_Pages.retrieve.click();
		issue_Cards_Pages.checkbox.click();
		actions.click(issue_Cards_Pages.issue).build().perform();
		Thread.sleep(4000);
		Login_Application.logout.click();
}
	@AfterTest
	public void endTest() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
}
