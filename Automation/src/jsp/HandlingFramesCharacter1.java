package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesCharacter1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kushw/Desktop/page1.html");
	driver.findElement(By.id("t1")).sendKeys("a");
	//String-id or Attribute of the frame
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("b");
	//t2--->t1 use defaultContent()
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("c");
	//WebElement-Address of the frame
	WebElement frame1 = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(frame1);
	Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("d");
	
	
	}
}