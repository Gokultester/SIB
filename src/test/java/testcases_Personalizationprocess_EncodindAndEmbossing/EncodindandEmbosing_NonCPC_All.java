package testcases_Personalizationprocess_EncodindAndEmbossing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.EncodingAndEmbossing_Pages;

public class EncodindandEmbosing_NonCPC_All extends Common_Functions{
	@Test
	public void login() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@Test(priority=1)
	private void authorizecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver, EncodingAndEmbossing_Pages.class);
        String extractedText = "No data available in table";
        String expectedText = "This is the expected text";
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		EncodingAndEmbossing_Pages.personalizedprocess.click();
		EncodingAndEmbossing_Pages.encodingandembossing.click();
		EncodingAndEmbossing_Pages.NON_CPC.click();
		EncodingAndEmbossing_Pages.retrieve.click();
		if(expectedText.equals(expectedText)) {
			EncodingAndEmbossing_Pages.checkbox.click();
			EncodingAndEmbossing_Pages.authorise.click();

			//encodingandembossing.log(Status.PASS, "User has expected to get the success message encoding and embosing data generated successfully ");
			//encodingandembossing.addScreenCaptureFromPath(path5);
			//encodingandembossing.log(Status.PASS, "Text matches!");
			driver.navigate().refresh();
			}
			else {
				driver.navigate().refresh();
        	//encodingandembossing.log(Status.SKIP, "No dta is found!");
	}
		
}}
