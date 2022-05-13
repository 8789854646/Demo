package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptCloseParentPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        
		String pwh = driver.getWindowHandle();
		//System.out.println(pwh);
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allWh = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String wh : allWh) {
			driver.switchTo().window(wh);
			if (wh.equals(pwh)) {
				
			} else {
				driver.close();

			}
			
		}

	}

}
