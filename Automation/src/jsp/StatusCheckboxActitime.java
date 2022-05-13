package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCheckboxActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean status = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
             if (status==true) {
				System.out.println("Selected");
			}
             else {
				System.out.println("Not selected");
			}
	}

}
