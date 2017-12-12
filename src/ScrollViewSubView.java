import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollViewSubView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//PC-Rothy//workspace//Selenium-3.7//driver//geckodriver.exe");

WebDriver driver=new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement ele= driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
	
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		System.out.println(ele.getText());
		
		driver.close();
	}

}
