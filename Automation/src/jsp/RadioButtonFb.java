package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonFb {
      static {
    	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]")).getLocation().getY();
		if (y1==y2&& y2==y3) {
			System.out.println("Radio button are properly alligned in y-axis");
		}
		else {
			System.out.println("Radio button are not properly alligned in y-axis ");
		}
      driver.close();
	}

}
