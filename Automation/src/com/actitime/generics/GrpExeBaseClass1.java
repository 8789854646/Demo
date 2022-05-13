package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GrpExeBaseClass1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
 public WebDriver driver;
 @BeforeClass(groups={"smoke test","regression test"})
 public void openBrowser() {
	 Reporter.log("Open Browser",true);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 @AfterClass
 public void closeBrowser() {
	 Reporter.log("Close Browser",true);
	 driver.close();
 }
 @BeforeMethod(groups={"smoke test","regression test"})
 public void login() {
	 Reporter.log("Login",true);
	 driver.get("https://demo.actitime.com/");
	 driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 
 }
 @AfterMethod(groups="regression test")
 public void logout() {
	 Reporter.log("Logout",true);
	 driver.findElement(By.id("logoutLink")).click();
 }

}
