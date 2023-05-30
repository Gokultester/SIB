package testcases_Recieve_Cards;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Scenario;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.Recieve_Cards_Pages;

public class Receive_Cards_By_all extends Common_Functions {
	@Test
	public void login() throws InterruptedException {
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@Test(priority=1)
	public void authorizecardsRecieveAll() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	//	Actions actions = new Actions(driver);
		
		PageFactory.initElements(driver, Login_Application.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		PageFactory.initElements(driver, Recieve_Cards_Pages.class);
		
		Recieve_Cards_Pages.personalizedprocess.click();
		System.out.println("personalized card selected");
		Recieve_Cards_Pages.receivecards.click();
		System.out.println("receive card selected");
		Select se = new Select(Recieve_Cards_Pages.selectbatchNumber);
		se.selectByVisibleText("437501_01032379_PA.PRE");
	//	actions.click(Recieve_Cards_Pages.selectbatchNumber).build().perform();	
		System.out.println("batch is not selected");
}
}