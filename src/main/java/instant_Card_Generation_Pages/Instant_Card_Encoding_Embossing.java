package instant_Card_Generation_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Instant_Card_Encoding_Embossing {
	@FindBy(xpath="//span[normalize-space()='Instant Card Generation']")
	public static WebElement instantcardgeneration ;
	@FindBy(xpath="//span[normalize-space()='Instant Card Encoding/Embossing']")
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
