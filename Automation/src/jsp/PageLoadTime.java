package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {
  static {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(21, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/");
			System.out.println("Page is loaded within 21 seconds");
		} 
		catch (TimeoutException e) {
			System.out.println("Page is not loaded within 21 seconds");
			
		}
		driver.close();
   
	}

}
