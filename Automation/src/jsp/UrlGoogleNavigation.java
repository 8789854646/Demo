package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlGoogleNavigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		String url = driver.getCurrentUrl();
		if (url.contains("google.com")) {
			System.out.println("url is navigating to google.com");
		}
		else {
			System.out.println("url is not navigating to google.com");
		}
       
	}

}
