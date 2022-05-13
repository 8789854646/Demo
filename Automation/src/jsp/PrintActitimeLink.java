package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintActitimeLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/");
     String text = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).getAttribute("href");
     System.out.println(text);
     driver.close();
	}

}
