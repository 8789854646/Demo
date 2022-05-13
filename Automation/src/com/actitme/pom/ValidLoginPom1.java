package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//Test class of Pom

public class ValidLoginPom1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testValidLoginPom() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPagePom1 l=new LoginPagePom1();   //Create a object
		PageFactory.initElements(driver, l);   //we used initElements() in Test class
		l.setLogin("admin", "manager");
	}

}
