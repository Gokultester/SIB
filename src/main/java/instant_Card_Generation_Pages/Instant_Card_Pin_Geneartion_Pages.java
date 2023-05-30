package instant_Card_Generation_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Instant_Card_Pin_Geneartion_Pages {
	@FindBy(xpath="//span[normalize-space()='Instant Card Generation']")
	public static WebElement instantcardgeneration ;
	@FindBy (xpath="//span[normalize-space()='Instant Card Pin Generation']")
	public static WebElement instantpinGeneration;
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	public static WebElement instantretrieve;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public static WebElement instantauthorise;
	@FindBy(xpath="//input[@id='checkbox-2']")
	public static WebElement instantcheckbox;
}
