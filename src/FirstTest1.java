

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import library.Helper;

public class FirstTest1 {
	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	// Create a new instance of the Firefox driver
			

	        //Launch the Online Store Website
			driver.get("http://www.facebook.com");

	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com  : " +driver.getTitle() );
	        
	        
	      //  driver.manage().window().maximize();
			//Wait for 5 Sec
			Thread.sleep(2000);
			WebElement el=driver.findElement(By.xpath(".//*[@id='email']"));
			Helper.highlightElement(driver,el);
			el.sendKeys("dilip776");
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9036669604");
			
			driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
			
			Thread.sleep(3000);
			
			 WebElement lstitem=driver.findElement(By.id(".//*[@class='_5lxt f_click']"));
			    lstitem.click();

			    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

			    driver.findElement(By.xpath(".//*[@id='js_53']/div/div/ul/li[12]/a/span/span")).click();

			    System.out.println("Log out");

			Thread.sleep(2000);
			
	        // Close the driver
	        driver.quit();

}
}
