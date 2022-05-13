package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodClass2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage1 l=new LoginPage1(driver);
		//It gives StaleElementReferenceException:
		l.setLogin("admin1", "manager1");
		Thread.sleep(4000);
		l.setLogin("admin", "manager");

	}

}
