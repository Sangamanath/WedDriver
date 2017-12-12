package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void captureScreenShot1(WebDriver driver) throws IOException
	{
	TakesScreenshot st=(TakesScreenshot)driver;
	
	File source=st.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(source, new File("./ScreenShot/facebook.png"));
	
	}

}
