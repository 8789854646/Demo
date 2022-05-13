package com.actitme.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	private WebElement untBx;      //intilisation
	private WebElement pwtBx;
	private WebElement lgBtn;
	
	public  LoginPage1(WebDriver driver) {
		untBx=driver.findElement(By.id("username"));        //declaration
		pwtBx=driver.findElement(By.name("pwd"));
		lgBtn=driver.findElement(By.xpath("//div[.='Login ']"));
		
	}
	public void setLogin(String un,String pw) {
		untBx.sendKeys(un);       //utilisation
		pwtBx.sendKeys(pw);
		lgBtn.click();
	}

}
