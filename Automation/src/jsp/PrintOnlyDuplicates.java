package jsp;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/MultipleListbox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allDup = s.getOptions();
		int count = allDup.size();
		for(int i=0;i<count;i++)
		{
			String text = allDup.get(i).getText();
			
			if(hs.add(text)==false)
			{
				System.out.println(text);
			}
		}
		
        driver.close();

	}

}
