import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("www.facebook.com");
		
		driver.close();

	}

}
