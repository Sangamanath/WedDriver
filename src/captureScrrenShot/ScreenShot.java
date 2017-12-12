package captureScrrenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	
	@Test
	public void captureScreenShot() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dilip776");
		
		TakesScreenshot st=(TakesScreenshot)driver;
		
		File source=st.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShot/facebook.png"));
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9036669604");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		System.out.println(" Successively captured  !!!");
		
	}


}
