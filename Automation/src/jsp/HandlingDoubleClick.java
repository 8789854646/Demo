package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement resource1 = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		
		//Actions a1=new Actions(driver);
	     a.doubleClick(resource1).perform();
	     boolean HackerEarth = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).isDisplayed();
	     if (HackerEarth==true) {
	    	 System.out.println("Displayed");
			
		}
	     else {
			System.out.println("Not displayed");
		}
		
         driver.close();
	}

}
