package personalizedCards_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class issue_Cards_Pages {
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy (xpath="//span[normalize-space()='Issue-Cards']")
	public static WebElement issuecards;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement retrieve;
	@FindBy(xpath="//span[normalize-space()='Issue']")
	public static WebElement issue;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
}
