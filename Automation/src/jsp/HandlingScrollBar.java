package jsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		//Convert one parent interface type reference into another parent interface type reference
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,3000)");

	}

}
