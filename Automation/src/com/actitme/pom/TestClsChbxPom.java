package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClsChbxPom {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/xpath.html");
		CheckBoxPom c=new CheckBoxPom(driver);
		c.setCheckbox();
	}

}
