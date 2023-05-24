package common_Functionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Application {
	@FindBy(xpath="//input[@placeholder='User Name']")
	public static WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement password;
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement login;
	

}