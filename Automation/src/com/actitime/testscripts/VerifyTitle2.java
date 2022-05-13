package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Example of Soft Assert

public class VerifyTitle2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle="Doogle";
		String aTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(eTitle, aTitle);
		driver.close();
		//Mandatory   (It can close the browser after not matching title)
		s.assertAll();//This statement give the fail report of testscript
	}

}
