package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutQuitChildPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh)
		{
			driver.switchTo().window(wh);
			driver.close();
			
		}
        
	}

}
