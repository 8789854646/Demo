package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.cssSelector("div[class='lrtEPN _17d0yO']"));
		Thread.sleep(2000);
	    int count = allSugg.size();
	    System.out.println(count);
	    for (WebElement sugg : allSugg) {
	    	String text = sugg.getText();
	    	System.out.println(text); 
			
		}
	   allSugg.get(count-1).click();

	}

}
