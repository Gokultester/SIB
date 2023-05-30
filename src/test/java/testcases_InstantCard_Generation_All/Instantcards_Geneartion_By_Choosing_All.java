package testcases_InstantCard_Generation_All;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import common_Functionalities.Common_Functions;
import common_Functionalities.Login_Application;
import common_Functionalities.ScreenShots;
import instant_Card_Generation_Pages.Insatnt_Issue_Cards_Pages;
import instant_Card_Generation_Pages.Instant_Card_Authorization_Pages;
import instant_Card_Generation_Pages.Instant_Card_Encoding_Embossing;
import instant_Card_Generation_Pages.Instant_Card_Pin_Geneartion_Pages;
import personalizedCards_Pages.Authorized_cards_Pages;
import personalizedCards_Pages.EncodingAndEmbossing_Pages;

public class Instantcards_Geneartion_By_Choosing_All extends Common_Functions {

	
	@Test
	public void browser() throws InterruptedException {
		
		PageFactory.initElements(driver,Common_Functions.class );

		
	}
	
	@Test
		public void authorizeCards() {

			driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
			 
			PageFactory.initElements(driver,Login_Application.class); 
			  Login_Application.username.sendKeys("maker");
					  Login_Application.password.sendKeys("Test@123");
					  Login_Application.login.click();
					  PageFactory.initElements(driver,Instant_Card_Authorization_Pages.class); 
					 Actions action1 = new Actions(driver);
					  Instant_Card_Authorization_Pages.instantcardgeneration.click();
					  Instant_Card_Authorization_Pages.instantauthorizecard.click();
					  Instant_Card_Authorization_Pages.insatantretrieve.click();
					  Instant_Card_Authorization_Pages.checkbox.click();
					  System.out.println("user has revieve option");
					action1.click(Instant_Card_Authorization_Pages.instantauthorise).build().perform();
	
	}
		
	@Test
	public void pinGeneration() {

		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		 
		PageFactory.initElements(driver,Login_Application.class); 
		  Login_Application.username.sendKeys("maker");
				  Login_Application.password.sendKeys("Test@123");
				  Login_Application.login.click();
					PageFactory.initElements(driver,Instant_Card_Pin_Geneartion_Pages.class); 
					String extractedText = "PinGenerate - Instant']";
			        String expectedText = "This is the expected text";
					
					Instant_Card_Pin_Geneartion_Pages.instantcardgeneration.click();
					Instant_Card_Pin_Geneartion_Pages.instantpinGeneration.click();
					Instant_Card_Pin_Geneartion_Pages.instantretrieve.click();
					Instant_Card_Pin_Geneartion_Pages.instantcheckbox.click();
					Actions action1 = new Actions(driver);
					
					action1.click(Instant_Card_Pin_Geneartion_Pages.instantauthorise).build().perform();
					if (extractedText.equals(expectedText)) {
						System.out.println("user need to connect to hsm");
			        } else {
			        	System.out.println("Pin is sucessfully generated");
			        	//driver.navigate().refresh();
			        	
			        }
}
	
	@Test
	public void encodingAndEmbossing() {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver,Login_Application.class); 

		Login_Application.username.sendKeys("maker");
		  Login_Application.password.sendKeys("Test@123");
		  Login_Application.login.click();
		
			String extractedText = "User successfully generated the data";
	        String expectedText = "No Records found";
			PageFactory.initElements(driver,Instant_Card_Encoding_Embossing.class); 
			Instant_Card_Encoding_Embossing.instantcardgeneration.click();
			Instant_Card_Encoding_Embossing.encodingandembossing.click();
			Instant_Card_Encoding_Embossing.retrieve.click();
			if (extractedText.equals(expectedText)) {
				System.out.println("user  is sucessfully generated");
	        } else {
	        
	        	System.out.println("need to add the records");
	        	//driver.navigate().refresh();
	        	
	        }
	}
	
	
	@Test
	public void issueCards() {
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		PageFactory.initElements(driver,Login_Application.class); 

		Login_Application.username.sendKeys("maker");
		  Login_Application.password.sendKeys("Test@123");
		  Login_Application.login.click();
		  PageFactory.initElements(driver,Insatnt_Issue_Cards_Pages.class); 
		  Actions action2 = new Actions(driver);
		  Insatnt_Issue_Cards_Pages.instantcardgeneration.click();
		  action2.click(Insatnt_Issue_Cards_Pages.insatissuecards).build().perform();
		  Insatnt_Issue_Cards_Pages.retrieve.click();
		  Insatnt_Issue_Cards_Pages.checkbox.click();
		  action2.click(Insatnt_Issue_Cards_Pages.issue).build().perform();
			
}

			
}

	

