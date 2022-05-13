package jsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadYourResume {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		driver.findElement(By.className("uploadResume resman-btn-primary resman-btn-small")).click();
		//File f=new File("./data/Resume.docx");
		//String aPath = f.getAbsolutePath();
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys(aPath);
		
	}

}
