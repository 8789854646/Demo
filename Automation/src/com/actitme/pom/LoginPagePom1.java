package com.actitme.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Pom class
public class LoginPagePom1 {
	@FindBy(id="username")           //declartion
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgBtn;
	
	/*(Without using Constructor)
	 
	public LoginPagePom1(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);     //intilisation
	}
	*/
	public void setLogin(String un,String pw) 
	{
		untbx.sendKeys(un);        //utilisation
		pwtbx.sendKeys(pw);
		lgBtn.click();
		
	}

}
