package common_Functionalities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots extends Common_Functions {


	public static    String captureScreenshot(String fileName) {
	TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
	File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshot/"+ fileName);
	try {
		FileUtils.copyFile(sourceFile, destFile);
		
	}catch(IOException e) {
		e.printStackTrace();
		
	}
	return destFile.getAbsolutePath();
}
}
