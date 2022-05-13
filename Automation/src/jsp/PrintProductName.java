package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintProductName {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 pro max");
		driver.findElement(By.cssSelector("path[class='_34RNph']")).click();
		Thread.sleep(2000);
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max' ) and @class]"));
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max' ) and @class]/../../div[2]/div[1]/div[1]/div[1]"));
	    int count = product.size();
		for (int i=0;i<count;i++)
		{
			String text1 = product.get(i).getText();
			String text2 = price.get(i).getText();
			System.out.println(text1+"---->"+text2);
		}
	}

}
