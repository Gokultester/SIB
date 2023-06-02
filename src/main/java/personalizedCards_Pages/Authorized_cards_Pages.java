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
	@FindBy(xpath="//input[@id='checkbox-all']")
	public static WebElement checkboxAll;
	@FindBy (xpath="//div[@id='mat-select-value-7']")
	public static WebElement all;
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c67-16']")
	public static WebElement arrow;
	@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Product Based']")
	public static WebElement productBased;
	@FindBy(xpath="//mat-option[@id='mat-option-0']")
	public static WebElement byselectAll;
	
	
	
}
