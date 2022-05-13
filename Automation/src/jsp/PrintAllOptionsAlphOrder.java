package jsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsAlphOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/MultipleListbox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alphOrder = s.getOptions();
		int count = alphOrder.size();
		for(int i=0;i<count;i++)
		{
			String text = alphOrder.get(i).getText();
			
			ar.add(text);
		}
		Collections.sort(ar);
		for(String text:ar)
		{
			System.out.println(text);
		}
        driver.close();
	}

}
