package jsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTopDownScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//scroll to buttom of the webpage
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scroll to top of the webpage
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0,0)");

	}

}
