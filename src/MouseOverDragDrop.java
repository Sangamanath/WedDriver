import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDragDrop {
	
	WebDriver driver;
		

		public void setUp() throws InterruptedException{
			System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");
		driver=new FirefoxDriver();;

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		}
		
		public void action_1() throws InterruptedException
		{
	
		driver.findElement(By.xpath(".//*[@id='box1']")).click();
		WebElement dragme=driver.findElement(By.xpath(".//*[@id='box1']"));

		WebElement dropme=driver.findElement(By.xpath(".//*[@id='box101']"));
		
		Actions builder =new Actions(driver);
			
				builder.clickAndHold(dragme).moveToElement(dropme).release(dragme).build().perform();
				//builder.dragAndDrop(dragme, dropme).perform();
				System.out.println("Success !!!");
				Thread.sleep(3000);
				driver.quit();
		}
				public static void main(String agrs[]) throws InterruptedException
				{
					MouseOverDragDrop drag = new MouseOverDragDrop();
					drag.setUp();
					drag.action_1();
					
				}
	
		// TODO Auto-generated method stub
		
		
	}


