package instant_Card_Generation_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Insatnt_Issue_Cards_Pages {
	@FindBy(xpath="//span[normalize-space()='Instant Card Generation']")
	public static WebElement instantcardgeneration ;
	@FindBy (xpath="//span[normalize-space()='Instant Issue Cards']")
	public static WebElement insatissuecards;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement retrieve;
	@FindBy(xpath="//span[normalize-space()='Issue']")
	public static WebElement issue;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
}
