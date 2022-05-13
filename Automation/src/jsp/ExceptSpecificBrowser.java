package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptSpecificBrowser {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    driver.findElement(By.linkText("Open New Seperate Windows")).click();
	    driver.findElement(By.xpath("//button[text()='click']")).click();
	    String eTitle="Selenium";
	    Set<String> allwh = driver.getWindowHandles();
	    for (String wh : allwh) {
		   driver.switchTo().window(wh);
		  String aTitle = driver.getTitle();
		  if (!(aTitle.equals(eTitle))) {
			  driver.close();	
		}	
	    }

		}

	}

