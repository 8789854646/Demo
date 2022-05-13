package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Open the chromebrowser
		WebDriver driver=new ChromeDriver();
		//Go to google.com
		driver.get("https://www.google.com/");
		//Type java in search textbox
		driver.findElement(By.name("q")).sendKeys("java");
		//Selenium is very fast so browser take some time to display auto suggestions that's the reason we use
		Thread.sleep(2000);
		//Find all the auto suggestions
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		//Count the auto suggestions
		int count = allSugg.size();
		//Print the count of auto suggestions
		System.out.println(count);
		for (int i=0;i<count;i++)
		{
		    String text = allSugg.get(i).getText();
		    //Print the text of all auto suggestions
			System.out.println(text);
		}
		//Select first auto suggestions
		allSugg.get(0).click();

	}

}
