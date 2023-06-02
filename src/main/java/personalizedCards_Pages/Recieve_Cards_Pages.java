package personalizedCards_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recieve_Cards_Pages {
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy(xpath="//span[normalize-space()='Receive-Cards']")
	public static WebElement receivecards;
	/*@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c46-5']")
	public static WebElement selectbatchNumber;*/
	@FindBy(xpath ="//div[@class='mat-form-field-wrapper ng-tns-c46-2']")
	public static WebElement selectbatchNumber;
	@FindBy(xpath ="//span[text()='437501_29052381_PA.PRE']")
	public static WebElement preselect;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement retrieve;
	@FindBy(xpath="//span[normalize-space()='Issue']")
	public static WebElement issue;
	
	
	
}
