import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFiledata {
	
		
		  public static void main(String[] args)  {
			  File file = new File("C:/Users/PC-Rothy/workspace/Selenium-3.7/Property/datafile.properties");
			  
				FileInputStream fileInput = null;
				try 
				{
					fileInput = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				Properties prop = new Properties();
				
				//load properties file
				try {
					prop.load(fileInput);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

				WebDriver driver = new FirefoxDriver();

				driver.get(prop.getProperty("URL"));
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(prop.getProperty("username"));
				driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(prop.getProperty("password"));
				driver.findElement((By.xpath(".//*[@id='loginbutton']"))).click();
				
				
				System.out.println("URL ::" + prop.getProperty("URL"));
				System.out.println("User name::" +prop.getProperty("username"));
			    System.out.println("Password::" +prop.getProperty("password"));
			    
			    driver.close();
		  }
		}


