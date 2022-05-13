package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int x1 = driver.findElement(By.id("username")).getLocation().getX();
		int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		if (x1==x2) {
			System.out.println("UN & PW textbox are Properly Alligned");
		}
		else {
			System.out.println("UN & PW textbox are not Properly Alligned");
		}
		System.out.println("x1=x2 is: "+x1);
		driver.close();
	}
}
		
