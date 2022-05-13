package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoutTestClassPom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void logoutTestClsPom() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LogoutPom l=new LogoutPom(driver);
		l.setLogout();
	}

}
