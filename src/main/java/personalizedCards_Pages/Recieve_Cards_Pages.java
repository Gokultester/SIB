package personalizedCards_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recieve_Cards_Pages {
	@FindBy(xpath="//span[text()='Personalization Progress']")
	public static WebElement personalizedprocess ;
	@FindBy(xpath="//span[normalize-space()='Receive-Cards']")
	public static WebElement receivecards;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c46-5']")
	public static WebElement selectbatchNumber;
	
	
}
