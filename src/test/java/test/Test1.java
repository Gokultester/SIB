package test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common_Functionalities.Common_Functions;
import common_Functionalities.ScreenShots;

public class Test1 extends Common_Functions {
	static ExtentReports extentReports;
	static File file;
	static ExtentSparkReporter sparkReporter;
	static ExtentTest test;
	static Actions actions;
	
	
	@Test
	public static  void test() {
	PageFactory.initElements(driver,ScreenShots.class );
	PageFactory.initElements(driver,Common_Functions.class );

	ExtentTest browserLaunch =extentReports.createTest("Application status"); 

	String path = ScreenShots.captureScreenshot("google.jpg");


		
		browserLaunch.addScreenCaptureFromPath(path);
	
	
	}
	
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
}
