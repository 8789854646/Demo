package com.actitme.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//Stores the username textbox address as @a1 in untbx
		WebElement untbx = driver.findElement(By.id("username"));
		//refresh the page and username textbox address will be changed to @p1
		driver.navigate().refresh();
		//It will try to enter admin using old address is @a1(which is no longer exit)
		untbx.sendKeys("admin");

	}

}
