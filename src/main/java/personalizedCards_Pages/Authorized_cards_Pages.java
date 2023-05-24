package personalizedCards_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorized_cards_Pages {
	
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy(xpath="//span[normalize-space()='Authorise Cards' ]")
	public static WebElement authorizecard;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement retrieve;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public static WebElement authorise;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
	
}
