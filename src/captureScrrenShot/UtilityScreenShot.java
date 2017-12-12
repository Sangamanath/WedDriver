/**
 * 
 */
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

import library.Utility;

/**
 * @author PC-Rothy
 *
 */
public class UtilityScreenShot {

	@Test
	public void captureScreenShot1() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Utility.captureScreenShot1(driver);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dilip776");
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9036669604");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		System.out.println(" Successively captured  !!!");
		
	}

}
