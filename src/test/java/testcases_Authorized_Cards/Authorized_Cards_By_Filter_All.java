package testcases_Authorized_Cards;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import io.github.bonigarcia.wdm.WebDriverManager;
import personalizedCards_Pages.Authorized_cards_Pages;
import personalizedCards_Pages.CVV_Genenartion_Pages;

public class Authorized_Cards_By_Filter_All extends Common_Functions 
{
@Test
public void login() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	PageFactory.initElements(driver,Common_Functions.class );
	}
@Test(priority=1)
private void authorizecardsAll() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
	Actions actions = new Actions(driver);
	PageFactory.initElements(driver, Login_Application.class);
	Login_Application.username.sendKeys("maker");
	Login_Application.password.sendKeys("Test@123");
	Login_Application.login.click();
	PageFactory.initElements(driver, Authorized_cards_Pages.class);
	Authorized_cards_Pages.personalizedprocess.click();
	Authorized_cards_Pages.authorizecard.click();
	Authorized_cards_Pages.retrieve.click();
	Authorized_cards_Pages.checkbox.click();
	actions.click(Authorized_cards_Pages.authorise).build().perform();
	Authorized_cards_Pages.personalizedprocess.click();
	PageFactory.initElements(driver, CVV_Genenartion_Pages.class);
	CVV_Genenartion_Pages.cvvGeneration.click();
	Authorized_cards_Pages.retrieve.click();
	Authorized_cards_Pages.checkbox.click();
	actions.click(Authorized_cards_Pages.authorise).build().perform();
}


/*private void cvvGenerationAll() {
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	Actions actions = new Actions(driver);
	PageFactory.initElements(driver, Authorized_cards_Pages.class);
	Authorized_cards_Pages.personalizedprocess.click();
	PageFactory.initElements(driver, CVV_Genenartion_Pages.class);
	CVV_Genenartion_Pages.cvvGeneration.click();
	Authorized_cards_Pages.retrieve.click();
	Authorized_cards_Pages.checkbox.click();
	actions.click(Authorized_cards_Pages.authorise).build().perform();*/
	
	
	
}


