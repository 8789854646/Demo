package jsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
     static {
    	 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
     }
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		//Mandontry
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
     
	}

}
