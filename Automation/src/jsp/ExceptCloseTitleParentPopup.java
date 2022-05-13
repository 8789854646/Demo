package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptCloseTitleParentPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String title = driver.getWindowHandle();
		//System.out.println(title);
		String title1 = driver.getTitle();
		//System.out.println(title1);
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allWh = driver.getWindowHandles();
		//System.out.println(allWh);
		
		for (String titlewh : allWh) {
			driver.switchTo().window(titlewh);
			String allTitle = driver.getTitle();
			//System.out.println(allTitle);
			if (title1.equals(allTitle)) {
				
			} else {
			driver.close();

			}
			
		}

	}

}
