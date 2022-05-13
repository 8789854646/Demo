package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Test class of POM

public class ValidLoginPom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testValidLoginPom() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPagePom l=new LoginPagePom(driver);
		l.setLogin("admin", "manager");
	}

}
