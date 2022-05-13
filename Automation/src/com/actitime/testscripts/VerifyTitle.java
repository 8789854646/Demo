package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		//if-else block does not give fail report
		if (aTitle.equals(eTitle)) {
			Reporter.log("title is matching and pass",true);
			
		}
		else {
			Reporter.log("Title is not matching and fail",true);
		}
		driver.close();
	}

}
