package instant_Card_Generation_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Instant_Card_Authorization_Pages {
	@FindBy(xpath="//span[normalize-space()='Instant Card Generation']")
	public static WebElement instantcardgeneration ;
	@FindBy(xpath="//span[text()='Instant Card Authorisation']")
	public static WebElement instantauthorizecard;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement insatantretrieve;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public static WebElement instantauthorise;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
	@FindBy (xpath="//div[@id='mat-select-value-7']")
	public static WebElement all;
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c67-16']")
	public static WebElement arrow;
	@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Product Based']")
	public static WebElement productBased;
	@FindBy(xpath="//mat-option[@id='mat-option-0']")
	public static WebElement byselectAll;
	
}
