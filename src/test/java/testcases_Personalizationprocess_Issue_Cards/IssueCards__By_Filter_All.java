package testcases_Personalizationprocess_Issue_Cards;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.PIN_Generation_Pages;
import personalizedCards_Pages.issue_Cards_Pages;

public class IssueCards__By_Filter_All extends Common_Functions{
	@Test
	public void login() throws InterruptedException {
		PageFactory.initElements(driver,Common_Functions.class );
		}
	@Test(priority=1)
	private void authorizecardsAll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		PageFactory.initElements(driver, Login_Application.class);
		PageFactory.initElements(driver, issue_Cards_Pages.class);
		Login_Application.username.sendKeys("maker");
		Login_Application.password.sendKeys("Test@123");
		Login_Application.login.click();
		issue_Cards_Pages.personalizedprocess.click();
		issue_Cards_Pages.issuecards.click();
		issue_Cards_Pages.retrieve.click();
		issue_Cards_Pages.checkbox.click();
		actions.click(issue_Cards_Pages.issue).build().perform();
}
}
