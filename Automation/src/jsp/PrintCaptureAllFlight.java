package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCaptureAllFlight {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Any')])[1]")).sendKeys("BLR - Bangalore, IN");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Any')])[2]")).sendKeys("GOI - Goa, IN");
		driver.findElement(By.xpath("(//button[contains(@class,'flex')])[4]")).click();
		
		driver.findElement(By.xpath("//div[text()='21']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();

	}

}
