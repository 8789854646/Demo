package com.actitme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class

public class LoginPagePom {
	@FindBy(id="username")           //declartion
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgBtn;
	
	public LoginPagePom(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);     //intilisation
	}
	public void setLogin(String un,String pw) 
	{
		untbx.sendKeys(un);        //utilisation
		pwtbx.sendKeys(pw);
		lgBtn.click();
		
	}
}
