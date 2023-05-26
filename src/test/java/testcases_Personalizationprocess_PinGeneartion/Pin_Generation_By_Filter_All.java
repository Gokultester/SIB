package testcases_Personalizationprocess_PinGeneartion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.PIN_Generation_Pages;

public class Pin_Generation_By_Filter_All extends Common_Functions {
	@Test
	public void login() throws InterruptedException {
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@Test(priority=1)
	private void authorizecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver, PIN_Generation_Pages.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		PIN_Generation_Pages.personalizedprocess.click();
		PIN_Generation_Pages.cvvGeneration.click();
		PIN_Generation_Pages.retrieve.click();
		PIN_Generation_Pages.checkbox.click();
		actions.click(PIN_Generation_Pages.authorise).build().perform();
	}
}
