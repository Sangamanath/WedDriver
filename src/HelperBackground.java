import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBackground {
	
	
	public static void highlightElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;');", ele);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px while')",ele);
		
	}

}
