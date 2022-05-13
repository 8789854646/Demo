package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email"));
		int height = driver.findElement(By.id("email")).getSize().getHeight();
		int width = driver.findElement(By.id("email")).getSize().getWidth();
		System.out.println("Height= "+height+" pixel");
		System.out.println("Width= "+width+" pixel");
		driver.close();

	}

}
