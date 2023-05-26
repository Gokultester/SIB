package personalizedCards_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EncodingAndEmbossing_Pages {
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy(xpath="//span[normalize-space()='Encoding Embossing']")
	public static WebElement encodingandembossing;
	@FindBy(xpath="//a[normalize-space()='NON-CPC-Kit']")
	public static WebElement NON_CPC;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement retrieve;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public static WebElement authorise;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
	
}
