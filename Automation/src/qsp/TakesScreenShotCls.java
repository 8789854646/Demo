package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the url");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);//https://www.google.com/
		
		//Type cast the Object to TakesScreenShot(Webdriver[I]---->TakesScrrenShot[I])
		TakesScreenshot t=(TakesScreenshot) driver;
		
		//Press the print screen button
		File src = t.getScreenshotAs(OutputType.FILE);
		
		//open or create the empty file in the below location
		File desc=new File("./ScreenShot/ss.png");
		
		//Move the screen shot from source to destination
		FileUtils.copyFile(src, desc);
		
		driver.close();

	}

}
