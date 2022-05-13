package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingParticularScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		int y = driver.findElement(By.xpath("//a[text()=' CEO Secrets ']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//concatation string with int y
		j.executeScript("window.scrollBy(0,"+y+")");
	}

}
