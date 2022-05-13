package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
Thread.sleep(2000);
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.quit();

	}

}
