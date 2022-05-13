package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/MultipleListbox.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		List<WebElement> allOptions = s.getAllSelectedOptions();
		int count=allOptions.size();
		System.out.println("Selected options are="+count);
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
        driver.close();
	}

}
