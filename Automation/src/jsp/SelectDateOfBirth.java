package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateOfBirth {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dayListBox = driver.findElement(By.id("day")); 
		Select s1=new Select(dayListBox);
		
		s1.selectByIndex(9);
		WebElement monthListBox = driver.findElement(By.id("month")); 
		Select s2=new Select(monthListBox);
		
		s2.selectByValue("5");
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select s3=new Select(yearListBox);
		
		s3.selectByVisibleText("1995");

	}
}
