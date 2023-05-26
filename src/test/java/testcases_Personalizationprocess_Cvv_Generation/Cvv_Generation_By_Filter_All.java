package testcases_Personalizationprocess_Cvv_Generation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import personalizedCards_Pages.CVV_Genenartion_Pages;

public class Cvv_Generation_By_Filter_All extends Common_Functions  {
	@Test
	public void login() throws InterruptedException {
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
		PageFactory.initElements(driver, CVV_Genenartion_Pages.class);
		CVV_Genenartion_Pages.personalizedprocess.click();
		CVV_Genenartion_Pages.cvvGeneration.click();
		CVV_Genenartion_Pages.retrieve.click();
		CVV_Genenartion_Pages.checkbox.click();
		actions.click(CVV_Genenartion_Pages.authorise).build().perform();
}
}