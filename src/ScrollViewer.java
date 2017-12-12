import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollViewer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com");
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
				//JavascriptExecutor jas=(JavascriptExecutor)driver;
		//jas.executeScript("scroll(200,400)");
		driver.close();

	}

}
