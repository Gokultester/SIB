package testcases_Recieve_Cards;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.Recieve_Cards_Pages;

public class Receive_Cards_By_all extends Common_Functions {
	@Test
	public void login() throws InterruptedException {
		
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@Test(priority=1)
	private void authorizecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		PageFactory.initElements(driver, Login_Application.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		PageFactory.initElements(driver, Recieve_Cards_Pages.class);
		Recieve_Cards_Pages.personalizedprocess.click();
		Recieve_Cards_Pages.receivecards.click();
		actions.clickAndHold(Recieve_Cards_Pages.selectbatchNumber).build().perform();	
}
}