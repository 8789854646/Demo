package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHiddenPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement monthBox = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(monthBox);
		s1.selectByIndex(4);
		WebElement yearBox = driver.findElement(By.className("ui-datepicker-year")); 
		Select s2=new Select(yearBox);
		s2.selectByVisibleText("1995");
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		WebElement e = driver.findElement(By.id("policynumberError"));
		String text = e.getText();
		//System.out.println(text);
		if (text.equals("Please enter valid Policy No.")) {
			System.out.println("Displayed");
			
		}
		else {
			System.out.println("Not displayed");
		}
		driver.close();

	}

}
