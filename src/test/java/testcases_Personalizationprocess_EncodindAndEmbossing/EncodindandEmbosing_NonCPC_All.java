package testcases_Personalizationprocess_EncodindAndEmbossing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		PageFactory.initElements(driver, EncodingAndEmbossing_Pages.class);
		EncodingAndEmbossing_Pages.personalizedprocess.click();
		EncodingAndEmbossing_Pages.encodingandembossing.click();
		EncodingAndEmbossing_Pages.NON_CPC.click();
		EncodingAndEmbossing_Pages.retrieve.click();
		//EncodingAndEmbossing.checkbox.click();
		EncodingAndEmbossing_Pages.authorise.click();
	}
		
}
