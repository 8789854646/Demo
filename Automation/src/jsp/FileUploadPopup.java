package jsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kushw/Desktop/Resume.html");
		File f=new File("./data/Resume.docx");
		String aPath = f.getAbsolutePath();
		
		driver.findElement(By.id("cv")).sendKeys(aPath);
        driver.close();
	}
}
