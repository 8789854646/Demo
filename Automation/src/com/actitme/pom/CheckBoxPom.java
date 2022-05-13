package com.actitme.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPom {
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allchbx;
	
	public  CheckBoxPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setCheckbox() {
		for (int i = 0; i < allchbx.size(); i++) {
			allchbx.get(i).click();
			
		}
	}

}
