package jsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukariPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("kushwahavivek053@gmail.com");
        driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("kushwahavk");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        try {
        	driver.findElement(By.xpath("//div[contains(@class,'crossIcon')]")).click();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
        
        driver.findElement(By.xpath("//div[contains(text(),'UPDATE PROFILE')]")).click();
        File f=new File("./data/vivek resume.docx");
        String aPath = f.getAbsolutePath();
        driver.findElement(By.id("attachCV")).sendKeys(aPath);
	}

}
