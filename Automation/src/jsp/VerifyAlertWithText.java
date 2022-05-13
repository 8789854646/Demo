package jsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlertWithText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
        Alert a = driver.switchTo().alert();
        a.sendKeys("vivek");
        a.accept();
        WebElement e = driver.findElement(By.id("demo1"));
      
		String text = e.getText();
		//System.out.println(text);
		Thread.sleep(2000);
		if (text.equals("Hello vivek How are you today")) {
			System.out.println(" Passed");
		}
		else {
			System.out.println("Failed");
		}
		
       driver.close();
		
		
	}

}
