package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/MultipleListbox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		//Select the Options
		for(int i=0;i<count;i++)
		{
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		//Deselect the options
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
			Thread.sleep(500);
		}
        driver.close();
	}

}
