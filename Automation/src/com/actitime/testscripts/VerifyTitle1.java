package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//Example of Hard Assert
public class VerifyTitle1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle1 () {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Doogle";
		String aTitle = driver.getTitle();
		//This statement give the failure report of Testscript(if title is not match then browser also not closed) but if-else block does not give the failure report.
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
		
	}
	
    

}
