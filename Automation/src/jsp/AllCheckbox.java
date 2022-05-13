package jsp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
		driver.get(url);//https://demo.actitime.com/[http://ironspider.ca/forms/checkradio.htm]
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allcheckbox.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			allcheckbox.get(i).click();
			
		}
        driver.close();
	}

}
