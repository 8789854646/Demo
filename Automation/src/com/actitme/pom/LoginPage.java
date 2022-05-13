package com.actitme.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
    {
	
	private WebElement untBx;                            //declaration
	
	public LoginPage(WebDriver driver)  //constructor
	{
		
	untBx=driver.findElement(By.id("username"));        //intilisation
	
	}
	
	public void setUser(String un)   //setter method(modify)
	{
		untBx.sendKeys("admin");                        //utilisation
	}

}
