package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
int x = driver.findElement(By.xpath("//a/div[1]")).getLocation().getX();
int y = driver.findElement(By.xpath("//a/div[1]")).getLocation().getY();
System.out.println("x-axis is: "+x);
System.out.println("y-axis is: "+y);
driver.close();
	}

}
