import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@Test
	public void getWindows() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		driver.manage().window().maximize();
		
       Set<String> ids= driver.getWindowHandles();
       
       Iterator<String> it=ids.iterator();
       
       String parentwindow=it.next();
       
       System.out.println("parent Window id is : " +parentwindow);
       
       String childwindow=it.next();
       System.out.println("Child window id is : " +childwindow);
       
       driver.switchTo().window(parentwindow);
       
       Thread.sleep(2000);
       
       driver.switchTo().window(childwindow);
       Thread.sleep(2000);
       
       driver.close();
       
       
       
		
	}
	

}
