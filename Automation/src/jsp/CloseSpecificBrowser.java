package jsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//whenever different browser are given then utilize this logic
public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter specific browser");
	String eTitle=sc.next();
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Windows.html");
    driver.findElement(By.linkText("Open New Seperate Windows")).click();
    driver.findElement(By.xpath("//button[text()='click']")).click();
    
    Set<String> allwh = driver.getWindowHandles();
    for (String wh : allwh) {
	   driver.switchTo().window(wh);
	  String aTitle = driver.getTitle();
	  if (aTitle.equals(eTitle)) {
		  driver.close();	
	}	
    }

	}

}
