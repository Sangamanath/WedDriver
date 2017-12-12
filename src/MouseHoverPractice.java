import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele= driver.findElement((By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button")));
		 
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		for(int i=0; i< links.size(); i++ )
		{
			WebElement ele1= links.get(i);
			
			String text=ele1.getAttribute("innerHTML");
			boolean status=ele1.isEnabled();
			
			System.out.println(" The link name is here : " +text + "and link is also : "+status);
			
			if(text.equalsIgnoreCase("Selenium"))
			{
				System.out.println(" Selenium link is opened : ");
				
				break;
			}
			
		}

	}

}
