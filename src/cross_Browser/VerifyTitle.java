package cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class VerifyTitle {
	
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	
	
	public void verifyTitle(String browserName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{				
			System.setProperty("webdriver.chrome.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//chromedriver.exe");

			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dilip776");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9036669604");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
