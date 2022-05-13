package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPom {
	
	
	@FindBy(id="logoutLink")
	private WebElement lgout; 
	
	public LogoutPom(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);     //intilisation
	}
	public void setLogout()
	{
		lgout.click();
		
	}
	

}
