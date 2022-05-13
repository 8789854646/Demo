package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColour {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String color = link.getCssValue("color");
		String fontSize = link.getCssValue("font-size");
		String fontType = link.getCssValue("font-family");
		System.out.println(color);
		System.out.println(fontSize);
		System.out.println(fontType);
		driver.close();

	}

}
