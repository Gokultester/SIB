package personalizedCards_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIN_Generation_Pages {
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy (xpath="//span[normalize-space()='PIN Generation']")
	public static WebElement pinGeneration;
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	public static WebElement retrieve;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public static WebElement authorise;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement checkbox;
}
