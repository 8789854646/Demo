package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagName {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tag = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		if (tag.equals("a")) {
			System.out.println("It is anchor tag i.e-->a");
			
		}
		else {
			System.out.println("It is not anchor tag--->a");
		}

	}

}
