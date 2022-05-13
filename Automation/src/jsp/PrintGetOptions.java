package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintGetOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/MultipleListbox.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		List<WebElement> allselect = s.getOptions();
		int count = allselect.size();
		System.out.println(count);
		for (WebElement select : allselect) {
			String text = select.getText();
			System.out.println(text); 
		}
        driver.close(); 
	}

}
