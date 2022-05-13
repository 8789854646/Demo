package jsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		
		a.dismiss();
		WebElement e = driver.findElement(By.id("demo"));
		String text = e.getText();
	
		Thread.sleep(2000);
		if (text.equals("You Pressed Cancel")) {
			System.out.println("You Pressed Cancel is passed");
		}
		else {
			System.out.println("You Pressed Cancel is not passed");
		}
		
       driver.close();
	}

}
